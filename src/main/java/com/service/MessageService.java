package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.MessageDao;
import com.domain.Request;

@Service
public class MessageService {
	@Autowired
	private MessageDao messageDao;
	
	@ResponseBody
	public Request addSlackNoti(Request slackRequest) {
		String response = messageDao.send(slackRequest);
		slackRequest.setText(response);
        return slackRequest;
    }
}
