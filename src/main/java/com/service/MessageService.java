package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.MessageDao;
import com.domain.SlackResponse;

@Service
public class MessageService {
	@Autowired
	private MessageDao messageDao;
	
	@ResponseBody
	public SlackResponse addSlackNoti(SlackResponse slackRequest) {
		String response = messageDao.send(slackRequest);
        return new SlackResponse(response);
    }
}
