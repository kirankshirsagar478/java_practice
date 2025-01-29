package com.demo.helloworld;

public class strBufferBuilder {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer();
		System.out.println("Default Capacity of buffer: "+sBuffer.capacity());	// 16
		
		sBuffer = new StringBuffer(50);
		System.out.println("Default Capacity of buffer: "+sBuffer.capacity());	// 50
		
		sBuffer = new StringBuffer("My StringBuffer");
		System.out.println("Default Capacity of buffer: "+sBuffer.capacity());	// 31
		
		System.out.println("String in StringBuffer: "+sBuffer);
		
		StringBuilder sBuilder = new StringBuilder("My StringBuilder");
		System.out.println("String in StringBuilder: "+sBuilder);
		
		sBuffer.append(". Append with StringBuffer");
		sBuilder.append(". Append with StringBuilder");
		System.out.println("String in StringBuffer: "+sBuffer);
		System.out.println("String in StringBuilder: "+sBuilder);
		
		sBuffer = new StringBuffer("AABCABBC");
		sBuilder = new StringBuilder("abaabcabac");
		
		sBuffer.insert(5,"pqrst");
		sBuilder.insert(3, "XYZ");
		System.out.println("String in StringBuffer: "+sBuffer);
		System.out.println("String in StringBuilder: "+sBuilder);
		
		System.out.println("Reverse StringBuffer: "+sBuffer.reverse());
		System.out.println("Reverse StringBuilder: "+sBuilder.reverse());
		

		
		

		

		
	}

}
