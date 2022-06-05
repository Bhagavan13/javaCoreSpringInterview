package com.bhagavan.interview.transactionalUnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingController {
	
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping(value="/book")
	public FlightBookingAcknowledgementDTO bookFlightTicket(@RequestBody FlightBookingRequestDTO request) throws InsufficientException
	{
		return flightBookingService.bookFlightTkt(request);
	}

}
