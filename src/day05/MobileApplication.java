package day05;

import java.util.Scanner;

public class MobileApplication {
public static void main(String[] args) {
	
	Mobile refMobile = new Mobile();
	
	
    Scanner sc = new Scanner(System.in);
         
	
	System.out.println("Enter your text");
	String myText = sc.next();
	
	
	Chat refChat = new Chat();
	refChat.setChat(myText);
	
	Whatsaap refWhatsaap = new Whatsaap();
	refMobile.setRefWhatsaap(refWhatsaap);//we have to pass the reference of WhatsApp);
	
	
	refWhatsaap.setRefChat(refChat);
	
	
	System.out.println(refMobile.getRefWhatsaap().getRefChat().getChat());
	
	
	
}
}


