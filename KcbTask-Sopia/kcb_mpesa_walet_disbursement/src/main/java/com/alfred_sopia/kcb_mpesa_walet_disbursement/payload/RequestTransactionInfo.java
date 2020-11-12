package com.alfred_sopia.kcb_mpesa_walet_disbursement.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Created on 11:42 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class RequestTransactionInfo {
	@JsonProperty("companyCode")
	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	String companyCode;

	@JsonProperty("transactionType")
	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	String transactionType;

	@JsonProperty("creditAccountNumber")
	public String getCreditAccountNumber() {
		return this.creditAccountNumber;
	}

	public void setCreditAccountNumber(String creditAccountNumber) {
		this.creditAccountNumber = creditAccountNumber;
	}

	String creditAccountNumber;

	@JsonProperty("credintMobileNumber")
	public String getCredintMobileNumber() {
		return this.credintMobileNumber;
	}

	public void setCredintMobileNumber(String credintMobileNumber) {
		this.credintMobileNumber = credintMobileNumber;
	}

	String credintMobileNumber;

	@JsonProperty("transactionAmount")
	public String getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	String transactionAmount;

	@JsonProperty("transactionReference")
	public String getTransactionReference() {
		return this.transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	String transactionReference;

	@JsonProperty("currencyCode")
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	String currencyCode;

	@JsonProperty("amountCurrency")
	public String getAmountCurrency() {
		return this.amountCurrency;
	}

	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}

	String amountCurrency;

	@JsonProperty("dateTime")
	public String getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	String dateTime;

	@JsonProperty("dateString")
	public String getDateString() {
		return this.dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	String dateString;
}
