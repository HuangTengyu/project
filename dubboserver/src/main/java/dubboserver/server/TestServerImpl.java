package dubboserver.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestServerImpl implements TestServer{
	private static Logger logger = LoggerFactory.getLogger(TestServerImpl.class);
	public void sayHello() {
		logger.debug("hello 你好");
		System.out.println("dubbo server start to provide serverice I am the provider at consumer");
	}

}
