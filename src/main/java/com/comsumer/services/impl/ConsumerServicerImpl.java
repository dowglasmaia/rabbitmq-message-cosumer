package com.comsumer.services.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.comsumer.dto.MessageDTO;
import com.comsumer.services.ConsumerServices;



@Service
public class ConsumerServicerImpl implements ConsumerServices {

	private static Logger log = LoggerFactory.getLogger(ConsumerServicerImpl.class);
	
	@Override
	public void action(MessageDTO message) {
		
		System.out.println(message.getText());
		
		log.info(" AÇÃO >>> " + message.getText());
	}

}
