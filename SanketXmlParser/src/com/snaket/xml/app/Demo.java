package com.snaket.xml.app;

import com.sanket.xml.BodyType;
import com.sanket.xml.GetMessage;
import com.sanket.xml.HeaderType;
import com.sanket.xml.MessageType;
import com.sanket.xml.QualifiedMailAddressType;
import com.snaket.xml.util.ParserHelper;

public class Demo {

	public static void main(String[] args) {
		//Code for reading the xml
		System.out.println("################Reading from XML##############");
		ParserHelper helper = new ParserHelper();
		
		MessageType msg = helper.getRootElement("D:\\Learner\\Jax B - XML Parsing\\msg173001.xml");

		BodyType body = msg.getBody();
		
		HeaderType header = msg.getHeader();
		QualifiedMailAddressType mailAddress = header.getFrom();
		System.out.println("File has come from:-"+mailAddress.getValue());
		System.out.println("Message ID is:-"+header.getMessageID());
		
		//code for writing to the xml
		
		
		
		
	}
}
