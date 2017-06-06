package com.snaket.xml.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.sanket.xml.GetMessage;
import com.sanket.xml.MessageType;

public class ParserHelper {
	
	//XML to Object - Unmarshalling
	//This code is for Unmarshalling - Getting xml into java objects
	public MessageType getRootElement(String completeXmlPath){
		MessageType message = null;
		 try {  
			   
		        File file = new File(completeXmlPath);  
		        JAXBContext jaxbContext = JAXBContext.newInstance(GetMessage.class);  
		   
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        message= (MessageType) jaxbUnmarshaller.unmarshal(file);  
		          
		        
		   
		      } catch (JAXBException e) {  
		        e.printStackTrace();  
		      } 
		 return message;
	}

	//Object to XML - Marshalling
	//This code is for marshalling - After changing the data in Java objects , writing back to the same xml
	
	public void setRootElement(String completeXmlPath, GetMessage message){
		 try {  
			   
			 JAXBContext contextObj = JAXBContext.newInstance(GetMessage.class);  
			  
			    Marshaller marshallerObj = contextObj.createMarshaller();  
			    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
			  
			    try {
					marshallerObj.marshal(message, new FileOutputStream(completeXmlPath));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error:- File or location does not exist!");
				}
		   
		      } catch (JAXBException e) {  
		        e.printStackTrace();  
		      } 
	}
}
