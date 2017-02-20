package com.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.domain.Request;

@Service
public class MessageDao {

	public String send(Request request) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			String response = restTemplate.postForObject(
					"https://hooks.slack.com/services/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", request,
					String.class);

			return response;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
