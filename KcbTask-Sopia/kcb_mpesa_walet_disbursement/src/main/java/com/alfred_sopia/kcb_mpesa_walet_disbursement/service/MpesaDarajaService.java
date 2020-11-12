package com.alfred_sopia.kcb_mpesa_walet_disbursement.service;

import com.alfred_sopia.kcb_mpesa_walet_disbursement.payload.RequestRoot;
import com.alfred_sopia.kcb_mpesa_walet_disbursement.payload.ResponseRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

/**
 * @Created on 11:48 AM 12-Nov-2020
 * @Author Alfred Sopia
 */

public class MpesaDarajaService {
	@Autowired
	private Environment env;
	String darajaTokenEndpoint = env.getProperty("mpesa.daraja.token.endpoint");
	String darajaB2CEndpoint = env.getProperty("mpesa.daraja.b2c.endpoint");
	RestTemplate template = new RestTemplate();

	public String sendRequest() {
		String accessToken = "";
		return accessToken;
	}

	public ResponseRoot sendMpesaRequest(RequestRoot request) {
		//TO DO make get token call to daraja API then b2c payment request
		ResponseRoot responseRoot = new ResponseRoot();
		return responseRoot;
	}

}
