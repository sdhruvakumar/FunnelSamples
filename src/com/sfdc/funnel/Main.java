package com.sfdc.funnel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.salesforce.mandm.funnel.message.FunnelGateway;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");
		
		FunnelGateway funnelGateway = (FunnelGateway) ctx.getBean("funnelGateway");

	}

}
