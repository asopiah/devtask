package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class ResponseHeader {
	@JsonProperty("messageID")
	public String getMessageID() {
		return this.messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	String messageID;

	@JsonProperty("conversationID")
	public String getConversationID() {
		return this.conversationID;
	}

	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}

	String conversationID;

	@JsonProperty("targetSystemID")
	public String getTargetSystemID() {
		return this.targetSystemID;
	}

	public void setTargetSystemID(String targetSystemID) {
		this.targetSystemID = targetSystemID;
	}

	String targetSystemID;

	@JsonProperty("routeCode")
	public String getRouteCode() {
		return this.routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	String routeCode;

	@JsonProperty("statusCode")
	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	String statusCode;

	@JsonProperty("statusDescription")
	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	String statusDescription;

	@JsonProperty("statusMessage")
	public String getStatusMessage() {
		return this.statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	String statusMessage;
}
