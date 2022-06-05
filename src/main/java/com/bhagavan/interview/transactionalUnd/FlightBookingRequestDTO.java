package com.bhagavan.interview.transactionalUnd;

public class FlightBookingRequestDTO {
	
	private PassengerEntity passengerEntity;
	private PaymentEntity paymentEntity;
	public FlightBookingRequestDTO(PassengerEntity passengerEntity, PaymentEntity paymentEntity) {
		super();
		this.passengerEntity = passengerEntity;
		this.paymentEntity = paymentEntity;
	}
	public PassengerEntity getPassengerEntity() {
		return passengerEntity;
	}
	public void setPassengerEntity(PassengerEntity passengerEntity) {
		this.passengerEntity = passengerEntity;
	}
	public PaymentEntity getPaymentEntity() {
		return paymentEntity;
	}
	public void setPaymentEntity(PaymentEntity paymentEntity) {
		this.paymentEntity = paymentEntity;
	}
	

}
