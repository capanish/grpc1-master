package com.cg.contService.grpc;
import com.cg.grpc.ProvisionServiceGrpc.ProvisionServiceImplBase;
import com.cg.grpc.request;
import com.cg.grpc.response;

import io.grpc.stub.StreamObserver;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("adif")
@GRpcService
public class ProvisionServiceImpl extends ProvisionServiceImplBase {
	
	public static String message;
	
public void creation(request req,StreamObserver<response> res) {
		
		response.Builder build = response.newBuilder();
		Date date = new Date(req.getTimestamp());  
		    SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy");  
		    String strDate= formatter.format(date);   
		String codigo = req.getCodigo();
		String msg = "Provisión creada para el expediente "+codigo+" en el periodo "+strDate;
		System.out.println("message "+msg);
		build.setMsg(msg);
	        message = msg;
		response b = build.build();
		res.onNext(b);
		res.onCompleted();
		
	}
	
	@CrossOrigin
	@GetMapping("/grpc")
	String getMsg() {
		String msg=message;
		message = null;
		return msg;
	}

}
