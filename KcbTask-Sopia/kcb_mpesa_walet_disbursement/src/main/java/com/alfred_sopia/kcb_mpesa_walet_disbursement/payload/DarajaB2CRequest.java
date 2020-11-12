package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class DarajaB2CRequest {
	@JsonProperty("InitiatorName")
	public String getInitiatorName() {
		return this.initiatorName;
	}

	public void setInitiatorName(String initiatorName) {
		this.initiatorName = initiatorName;
	}

	String initiatorName;

	@JsonProperty("SecurityCredential")
	public String getSecurityCredential() {
		return this.securityCredential;
	}

	public void setSecurityCredential(String securityCredential) {
		this.securityCredential = securityCredential;
	}

	String securityCredential;

	@JsonProperty("CommandID")
	public String getCommandID() {
		return this.commandID;
	}

	public void setCommandID(String commandID) {
		this.commandID = commandID;
	}

	String commandID;

	@JsonProperty("Amount")
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	String amount;

	@JsonProperty("PartyA")
	public String getPartyA() {
		return this.partyA;
	}

	public void setPartyA(String partyA) {
		this.partyA = partyA;
	}

	String partyA;

	@JsonProperty("PartyB")
	public String getPartyB() {
		return this.partyB;
	}

	public void setPartyB(String partyB) {
		this.partyB = partyB;
	}

	String partyB;

	@JsonProperty("Remarks")
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	String remarks;

	@JsonProperty("QueueTimeOutURL")
	public String getQueueTimeOutURL() {
		return this.queueTimeOutURL;
	}

	public void setQueueTimeOutURL(String queueTimeOutURL) {
		this.queueTimeOutURL = queueTimeOutURL;
	}

	String queueTimeOutURL;

	@JsonProperty("ResultURL")
	public String getResultURL() {
		return this.resultURL;
	}

	public void setResultURL(String resultURL) {
		this.resultURL = resultURL;
	}

	String resultURL;

	@JsonProperty("Occassion")
	public String getOccassion() {
		return this.occassion;
	}

	public void setOccassion(String occassion) {
		this.occassion = occassion;
	}

	String occassion;
}
