package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.MessageDao;
import com.domain.Request;
import com.domain.Response;

@Service
public class MessageService {
	@Autowired
	private MessageDao messageDao;
	
	@ResponseBody
	public Response addSlackNoti(Request slackRequest) {
		String responseSent = messageDao.send(slackRequest);
		slackRequest.setText(responseSent);
		Response response = new Response();
		if (responseSent.equalsIgnoreCase("ok")) {
			response.setResponse_code("0");
			response.setResponse_msg("SUCCESS");
		} else {
			response.setResponse_code("0000");
			response.setResponse_msg("FAIL");
		}
        return response;
    }
}
