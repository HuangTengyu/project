package clientdubbo.main;

import clientdubbo.action.ChatAction;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		 ChatAction act = new ChatAction();  
		 System.out.println("client 掉用dubbo");
         act.SayHello();
        /* while(true){
        	 Thread.sleep(5000);
        	 System.out.println("just sleep 5 second");
         }*/
	}
}
