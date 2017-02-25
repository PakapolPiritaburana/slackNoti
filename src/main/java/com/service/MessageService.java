package com.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.domain.Request;
import com.domain.Response;

@Service
public class MessageService {
	@ResponseBody
	public Response addSlackNoti(Request slackRequest) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			String response = restTemplate.postForObject("https://hooks.slack.com/services/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", slackRequest,String.class);
			Response buildResponse = new Response();
			if (response.equalsIgnoreCase("ok")) {
				buildResponse.setResponse_code("0");
				buildResponse.setResponse_msg("SUCCESS");
			} else {
				buildResponse.setResponse_code("0000");
				buildResponse.setResponse_msg("FAIL");
			}
			return buildResponse;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		    System.out.println(e.getCause().getMessage());
			throw new RuntimeException(e);
		}
    }
}
