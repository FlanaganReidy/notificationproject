package com.company;

public class Main {

    public static void main(String[] args) {
	EmailNotification myEmail = new EmailNotification("hi,there", "this is no bueno", "John", "gmail");
	myEmail.transport();
	TextNotification mytext = new TextNotification("hello again", "You shouldn't have done this","Mike", "verizon");mytext.transport();
	myEmail.printMessage();
	myEmail.setStatus();;
	//should show "great" because we changed it in my email
	myEmail.showStatus();
	//shows default status of "good"
	mytext.showStatus();
	//let's clone
		Object newEmail = myEmail.clone();
		System.out.println(myEmail.equals(myEmail));
    }
}
