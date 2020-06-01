package com.etoak.queue;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class HelloProducer {

	public static void main(String[] args) throws JMSException {
		//1. 创建ConnectionFactory(用户名,密码,链接地址)
		ConnectionFactory factory = new ActiveMQConnectionFactory(null,null,"tcp://localhost:61616");
		
		//2.通过ConnectionFactory创建Connection
		Connection connection = factory.createConnection();
		//3.通过Connection创建Session
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		//4.通过Session创建Destination
		Queue helloQueue = session.createQueue("hello2");
		//5.通过Session创建消息生产者
		MessageProducer producer = session.createProducer(helloQueue);
		
		//6.使用Session创建消息
		TextMessage msg = session.createTextMessage("这是第一个Hello Word消息");
		//7.使用发送消费者发送消息
		producer.send(msg);
		producer.close();
		session.close();
		connection.close();
		
		System.out.println("ok");
	}

}
