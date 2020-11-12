package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class TransactionInfo {
	@JsonProperty("transactionId")
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	String transactionId;

	@JsonProperty("falconBalance")
	public String getFalconBalance() {
		return this.falconBalance;
	}

	public void setFalconBalance(String falconBalance) {
		this.falconBalance = falconBalance;
	}

	String falconBalance;
}
