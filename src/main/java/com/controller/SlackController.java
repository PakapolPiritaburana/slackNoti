package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Request;
import com.domain.Response;
import com.service.MessageService;

@RestController
public class SlackController {
	@Autowired
    private MessageService messageService;
	
	@PostMapping(value = "/v1/addslack"  
			,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE 
			,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Response addMessage(@RequestBody Request request){
		System.out.println(request.toString());
		return messageService.addSlackNoti(request);
	}
}
