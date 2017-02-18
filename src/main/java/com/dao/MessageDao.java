package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.domain.SlackResponse;

@Service
public class MessageDao {
	@Autowired
    private RestTemplate restTemplate;
	
	public String send(SlackResponse request){
		HttpHeaders httpHeader = new HttpHeaders();
        HttpEntity<SlackResponse> httpEntity = new HttpEntity<>(request);

		try {
			restTemplate.exchange("https://hooks.slack.com/services/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", HttpMethod.POST, httpEntity, String.class);
		} catch (Exception e) {
			
		}
		return "";
	}
}
