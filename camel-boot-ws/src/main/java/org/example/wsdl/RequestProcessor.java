package org.example.wsdl;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class RequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Message inMessage = exchange.getIn();
		String cellular = (String) inMessage.getHeader("cellularPhone");
		String fname = (String) inMessage.getHeader("firstName");
		String lname = (String) inMessage.getHeader("lastName");
		String personId = (String) inMessage.getHeader("PersonUId");
		
		
		
		
	}
	
	

}
