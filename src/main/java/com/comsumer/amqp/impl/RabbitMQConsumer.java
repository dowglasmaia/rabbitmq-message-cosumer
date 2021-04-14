package com.comsumer.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comsumer.amqp.AmqpConsumer;
import com.comsumer.dto.MessageDTO;
import com.comsumer.services.ConsumerServices;

@Component
public class RabbitMQConsumer implements AmqpConsumer<MessageDTO> {

	@Autowired
	private ConsumerServices consumerServices;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.routing-key.producer}")
	public void consumer(MessageDTO message) {
		try {
			consumerServices.action(message);

		} catch (Exception e) {
			e.printStackTrace();
			throw new AmqpRejectAndDontRequeueException(e);
		}

	}

}
