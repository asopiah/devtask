package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class RequestHeader {
	@JsonProperty("messageID")
	public String getMessageID() {
		return this.messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	String messageID;

	@JsonProperty("featureCode")
	public String getFeatureCode() {
		return this.featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	String featureCode;

	@JsonProperty("featureName")
	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	String featureName;

	@JsonProperty("serviceCode")
	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	String serviceCode;

	@JsonProperty("serviceName")
	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	String serviceName;

	@JsonProperty("serviceSubCategory")
	public String getServiceSubCategory() {
		return this.serviceSubCategory;
	}

	public void setServiceSubCategory(String serviceSubCategory) {
		this.serviceSubCategory = serviceSubCategory;
	}

	String serviceSubCategory;

	@JsonProperty("minorServiceVersion")
	public String getMinorServiceVersion() {
		return this.minorServiceVersion;
	}

	public void setMinorServiceVersion(String minorServiceVersion) {
		this.minorServiceVersion = minorServiceVersion;
	}

	String minorServiceVersion;

	@JsonProperty("channelCode")
	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	String channelCode;

	@JsonProperty("channelName")
	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	String channelName;

	@JsonProperty("routeCode")
	public String getRouteCode() {
		return this.routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	String routeCode;

	@JsonProperty("timeStamp")
	public String getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	String timeStamp;

	@JsonProperty("serviceMode")
	public String getServiceMode() {
		return this.serviceMode;
	}

	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	String serviceMode;

	@JsonProperty("subscribeEvents")
	public String getSubscribeEvents() {
		return this.subscribeEvents;
	}

	public void setSubscribeEvents(String subscribeEvents) {
		this.subscribeEvents = subscribeEvents;
	}

	String subscribeEvents;

	@JsonProperty("callBackURL")
	public String getCallBackURL() {
		return this.callBackURL;
	}

	public void setCallBackURL(String callBackURL) {
		this.callBackURL = callBackURL;
	}

	String callBackURL;
}
