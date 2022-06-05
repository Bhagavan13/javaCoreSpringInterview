package com.bhagavan.interview.transactionalUnd;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingService {
	
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	
	public FlightBookingAcknowledgementDTO bookFlightTkt(FlightBookingRequestDTO request) throws InsufficientException
	{
		FlightBookingAcknowledgementDTO ack =null;
		PassengerEntity passengerEntity = request.getPassengerEntity();
		passengerInfoRepository.save(passengerEntity);
		PaymentEntity paymentEntity = request.getPaymentEntity();
		
		
		PaymentUtils.validateFaretoBalance(paymentEntity.getAccountNo(), passengerEntity.getFare());
		
		paymentEntity.setPassengerId(passengerEntity.getpId());
		paymentEntity.setAmount(passengerEntity.getFare());
		
		paymentInfoRepository.save(paymentEntity);
		
		return new FlightBookingAcknowledgementDTO("success", passengerEntity.getFare(),UUID.randomUUID().toString() , passengerEntity);
		
	}

}
