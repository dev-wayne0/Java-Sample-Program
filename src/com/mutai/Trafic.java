package com.mutai;

import java.util.Scanner;

public class Trafic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the color:");
		String color=scanner.next();
		if (color.equals("RED")) {
			System.out.println("STOP");
		
		}else if (color.equals("AMBER")) {
			System.out.println("GET READY");
			
		}else if (color.equals("GREEN")) {
			System.out.println("GO");
		}

	}

}
