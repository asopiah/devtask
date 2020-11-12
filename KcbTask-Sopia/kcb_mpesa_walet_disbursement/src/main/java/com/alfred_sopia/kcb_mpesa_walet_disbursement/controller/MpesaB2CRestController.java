package com.alfred_sopia.kcb_mpesa_walet_disbursement.controller;


import com.alfred_sopia.kcb_mpesa_walet_disbursement.payload.RequestRoot;
import com.alfred_sopia.kcb_mpesa_walet_disbursement.payload.ResponseRoot;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Created on 11:52 AM 12-Nov-2020
 * @Author Alfred Sopia
 */
@RestController
public class MpesaB2CRestController {
	@RequestMapping(path="/api/sendToMpesa",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE},consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseRoot add(@RequestBody RequestRoot request) {
		ResponseRoot responseRoot = new ResponseRoot();
		
		
		return responseRoot;
	}
	
	@RequestMapping(path="/api/",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE},consumes=MediaType.APPLICATION_JSON_VALUE)
	public String test(@RequestBody String request) {
		//TO DO Create user in DB
		return "Success";
	}
	
}
