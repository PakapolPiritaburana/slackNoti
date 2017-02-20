package com.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
	@JsonProperty("text")
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
