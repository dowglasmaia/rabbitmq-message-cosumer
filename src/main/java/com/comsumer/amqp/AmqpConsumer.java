package com.comsumer.amqp;

public interface AmqpConsumer<T> {

	void consumer(T t);
}
