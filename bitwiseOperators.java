package com.demo.helloworld;

public class bitwiseOperators {
	public static void main(String[] args) {
		byte val1= 12;		//0000 1100
		byte val2= 10;		//0000 1010
		byte res;
		
		res= (byte) ~val1;
		System.out.println("Result: "+res);
		
		res = (byte) (val1 & val2); //AND
		System.out.println("Result: "+res);
		
		res = (byte) (val1 | val2);	//OR
		System.out.println("Result: "+res);
		
		res = (byte) (val1 ^ val2);	//XOR
		System.out.println("Result: "+res);
		
		// 0000 1100 << 2 = 0011 0000 = 32 + 16 = 48
		res = (byte) (val1 << 2); //Shift 2 bits left
		System.out.println("Result: "+res);
		
		res = (byte) (val1 >> 2);
		System.out.println("Result: "+res);
	}

}
