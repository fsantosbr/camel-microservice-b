package com.fsantos.camelmicroserviceb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("activemq:my-activemq-queue")
		.to("log:received-message-from-active-mq");
		
		// "from("activemq:my-activemq-queue")" = contains the endpoint activemq that we imported and the queue created there.
		// The application.properties is heading to the activemq
		
	}

}
