package hello.remote.server;

import hello.remote.share.PayService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("hello/server.xml");
		/*
		PayService payService = (PayService)context.getBean("httpServre");
		String result = payService.pay("hank", "BMO", 30);
		System.out.println(result);
		*/
	}

}
