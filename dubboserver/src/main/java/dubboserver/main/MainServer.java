package dubboserver.main;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainServer {
	private static Logger logger = LoggerFactory.getLogger(MainServer.class);
	public static void main(String[] args) throws IOException, InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		context.start();
		System.out.println("dubbo服务提供方");
		logger.debug("dubbo开始提供服务");
		System.out.println("按任意键退出");
		 while(true){
        	 Thread.sleep(5000);
        	 System.out.println("just sleep 5 second");
         }
	}
} ///dubboserver/src/main/resources/applicationProvider.xml

///E:\workspace\dubboserver\src\main\resources\applicationProvider.xml
