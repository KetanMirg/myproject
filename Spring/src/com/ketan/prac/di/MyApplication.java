package com.ketan.prac.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.core.io.FileSystemResource;

public class MyApplication {
	
	public static void main(String[] args) {
		BeanFactory bean = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		PaymentService ps = (PaymentService) bean.getBean("paymentService");
		ps.makePayment();
		ps.setName("abc");
		 ps = (PaymentService) bean.getBean("paymentService");
		System.out.println("Value for name:"+ps.getName());
		
	}

}
