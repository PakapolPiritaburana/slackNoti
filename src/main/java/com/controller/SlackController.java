package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Request;
import com.service.MessageService;

@RestController
public class SlackController {
	@Autowired
    private MessageService messageService;
	
	@RequestMapping(value = "/v1/addslack" ,method = RequestMethod.POST 
			,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE 
			,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Request addMessage(@RequestBody Request request){
		System.out.println(request.toString());
		return messageService.addSlackNoti(request);
//		return null;
	}
}
