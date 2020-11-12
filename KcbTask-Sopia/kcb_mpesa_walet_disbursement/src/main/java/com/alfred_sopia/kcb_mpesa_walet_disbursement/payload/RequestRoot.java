package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class RequestRoot {
	@JsonProperty("header")
	public RequestHeader getHeader() {
		return this.header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	RequestHeader header;

	@JsonProperty("requestPayload")
	public RequestPayloadBody getRequestPayload() {
		return this.requestPayload;
	}

	public void setRequestPayload(RequestPayloadBody requestPayload) {
		this.requestPayload = requestPayload;
	}

	RequestPayloadBody requestPayload;
}
