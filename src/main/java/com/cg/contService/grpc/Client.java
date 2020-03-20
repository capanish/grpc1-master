package com.cg.contService.grpc;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


import com.cg.grpc.contable.ContableServiceGrpc;
import com.cg.grpc.contable.Request;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class Client {

	
	private ContableServiceGrpc.ContableServiceBlockingStub stub;
	
	@PostConstruct
	private void init() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("provision-service.adifv2.svc", 6565).usePlaintext(true).build();
		stub = ContableServiceGrpc.newBlockingStub(channel);
	}
	
	public String message(long ts) {
		Request res = Request.newBuilder().setTimestamp(ts).build();
		
		String msg = stub.creation(res).getMsg();
		
		
		return msg;
		
	}
}
