package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.SlackResponse;
import com.service.MessageService;

@RestController
public class SlackController {
	@Autowired
    private MessageService messageService;
	
	@RequestMapping(value = "/v1/addslack" ,method = RequestMethod.GET 
			,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE 
			,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public SlackResponse addMessage(@RequestBody SlackResponse slackResponse ){
		System.out.println("hello world");
		return messageService.addSlackNoti(slackResponse);
	}
}
