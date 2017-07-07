package javapackage;

import java.util.Currency;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Timer;

import thread.Bank;

public class UtilDemo {

	public static void main(String[] args) {
		
		/*Random rd=new Random();
		
		System.out.println("Int "+rd.nextInt(10));
		System.out.println("Double "+rd.nextDouble());
		
		rd.setSeed(510879097);
		System.out.println(rd.nextInt(100));*/
		
		//class Currency
	
		/*Locale locale=Locale.TAIWAN;
		
		Currency crr=Currency.getInstance("USS");
		System.out.println("currency Code "+crr.getCurrencyCode());
		System.out.println("currency name "+crr.getDisplayName());
		System.out.println("currency Numberic Code "+ crr.getNumericCode());
		System.out.println("currency available "+crr.getAvailableCurrencies());
		*/
		
		//stack
		/*
		Stack<String> stack=new Stack<String>();
		
		stack.push("book");
		stack.push("cook");
		stack.push("bag");
		stack.push("dog");
		stack.push("pen");
		stack.push("cat");
		
		for(String s: stack){
			System.out.println(s);
		}
		
		System.out.println(stack.peek());
		System.out.println("after peek of stack");
		for(String s: stack){
			System.out.println(s);
		}
		
		System.out.println(stack.pop());
		System.out.println("after pop of stack");
		for(String s: stack){
			System.out.println(s);
		}*/
		
		/*Properties p=new Properties();
		Bank b=new Bank();
		
		p.put("Code", 89.9);
		p.put("data","Book,cake");
		p.put("Message", "success");
		
		System.out.println(p.get("data"));*/
		
		//p.get("Code");
		
		
		/*StringTokenizer stoken=new StringTokenizer("Korea, SoftWare 87 HRD center", "");
		while(stoken.hasMoreTokens()){
			System.out.println(stoken.nextToken());
		}*/
		
		
		//Timer and TimerTask
		
		new MessageTimerTask().messageTimer();
		
	}
	
}














