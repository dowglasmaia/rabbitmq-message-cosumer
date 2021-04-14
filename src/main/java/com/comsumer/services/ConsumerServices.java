package com.comsumer.services;

import com.comsumer.dto.MessageDTO;


public interface ConsumerServices {

	void action(MessageDTO message) throws Exception;
}
