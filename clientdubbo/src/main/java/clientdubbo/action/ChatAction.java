package clientdubbo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dubboserver.server.TestServer;

public class ChatAction {
	public void SayHello() throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConsumer.xml");
		context.start();
		TestServer demoServer = (TestServer) context.getBean("demoService");
		demoServer.sayHello();
		/* while(true){
        	 Thread.sleep(5000);
        	 System.out.println("just sleep 5 second");
         }*/
	}
}

//E:\\workspace\\clientdubbo\\src\\main\\resources\\applicationConsumer.xml