package com.nt.service;

/**
 * Hello world!
 */


public class App {
	
    public int add(int x,int y) {
    	System.out.println("at this line TL will get conflict");
    	return x+y;
    }
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app =new App();
        System.out.println("sum is "+app.add(8, 4));
    }
}
