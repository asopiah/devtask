package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class RequestPayloadBody {
	@JsonProperty("transactionInfo")
	public RequestTransactionInfo getTransactionInfo() {
		return this.transactionInfo;
	}

	public void setTransactionInfo(RequestTransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	RequestTransactionInfo transactionInfo;
}
