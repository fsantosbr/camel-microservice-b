package com.fsantos.camelmicroserviceb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileReceiverFromActiveMqRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("activemq:activemq-files-queue")
		.log("${body}")
		.to("file:files/output-queue-folder");
		
	}
	
	

}
