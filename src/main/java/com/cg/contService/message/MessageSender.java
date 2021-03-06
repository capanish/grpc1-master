package com.cg.contService.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@EnableBinding(Source.class)
public class MessageSender {
  
  @Autowired
  private MessageChannel output; 
  
  public void sendTramitada(Message<?> m) {
    try {
      // avoid too much magic and transform ourselves
      ObjectMapper mapper = new ObjectMapper();
      String jsonMessage = mapper.writeValueAsString(m);
      // wrap into a proper message for the transport (Kafka/Rabbit) and send it      
      output.send(
          MessageBuilder.withPayload(jsonMessage)
          .setHeader("message", "tramitada")
          .build());
    } catch (Exception e) {
      throw new RuntimeException("Could not tranform and send message due to: "+ e.getMessage(), e);
    }
  }
  
  public void sendOutOfDate(Message<?> m) {
	    try {
	      // avoid too much magic and transform ourselves
	      ObjectMapper mapper = new ObjectMapper();
	      String jsonMessage = mapper.writeValueAsString(m);
	      // wrap into a proper message for the transport (Kafka/Rabbit) and send it      
	      output.send(
	          MessageBuilder.withPayload(jsonMessage)
	          .setHeader("message", "outofdate")
	          .build());
	    } catch (Exception e) {
	      throw new RuntimeException("Could not tranform and send message due to: "+ e.getMessage(), e);
	    }
	  }
  
  public void sendProvisionDenegada(Message<?> m) {
	    try {
	      // avoid too much magic and transform ourselves
	      ObjectMapper mapper = new ObjectMapper();
	      String jsonMessage = mapper.writeValueAsString(m);
	      // wrap into a proper message for the transport (Kafka/Rabbit) and send it      
	      output.send(
	          MessageBuilder.withPayload(jsonMessage)
	          .setHeader("message", "provisiondenegada")
	          .build());
	    } catch (Exception e) {
	      throw new RuntimeException("Could not tranform and send message due to: "+ e.getMessage(), e);
	    }
	  }
  
  public void sendCertdenegada(Message<?> m) {
	    try {
	      // avoid too much magic and transform ourselves
	      ObjectMapper mapper = new ObjectMapper();
	      String jsonMessage = mapper.writeValueAsString(m);
	      // wrap into a proper message for the transport (Kafka/Rabbit) and send it      
	      output.send(
	          MessageBuilder.withPayload(jsonMessage)
	          .setHeader("message", "certdenegada")
	          .build());
	    } catch (Exception e) {
	      throw new RuntimeException("Could not tranform and send message due to: "+ e.getMessage(), e);
	    }
	  }
  
  
  
  
  
}