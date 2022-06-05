package com.bhagavan.interview.transactionalUnd;

public class FlightBookingAcknowledgementDTO {

	private String status;
	private double totalfare;
	private String pnrNo;
	private PassengerEntity passengerEntity;
	public FlightBookingAcknowledgementDTO(String status, double totalfare, String pnrNo,
			PassengerEntity passengerEntity) {
		super();
		this.status = status;
		this.totalfare = totalfare;
		this.pnrNo = pnrNo;
		this.passengerEntity = passengerEntity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalfare() {
		return totalfare;
	}
	public void setTotalfare(double totalfare) {
		this.totalfare = totalfare;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public PassengerEntity getPassengerEntity() {
		return passengerEntity;
	}
	public void setPassengerEntity(PassengerEntity passengerEntity) {
		this.passengerEntity = passengerEntity;
	}


}
