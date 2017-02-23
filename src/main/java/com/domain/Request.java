package com.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
	@JsonProperty("text")
	String text;
	
	@JsonProperty("channel")
	String channel;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
