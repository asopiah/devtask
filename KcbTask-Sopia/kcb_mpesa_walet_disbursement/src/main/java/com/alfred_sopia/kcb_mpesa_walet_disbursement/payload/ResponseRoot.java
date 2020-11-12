package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class ResponseRoot {
	@JsonProperty("header")
	public ResponseHeader getHeader() {
		return this.header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	ResponseHeader header;

	@JsonProperty("responsePayload")
	public ResponsePayloadBody getResponsePayload() {
		return this.responsePayload;
	}

	public void setResponsePayload(ResponsePayloadBody responsePayload) {
		this.responsePayload = responsePayload;
	}

	ResponsePayloadBody responsePayload;
}
