package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testAge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testAge() throws Exception {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 18 || age > 80) {
			throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
		} else {
			System.out.println("��ӭ��ס���Ƶ�");
		}
	}

	/*
	 * public static void testAge() {
	 * 
	 * try { System.out.println("���������䣺"); Scanner input = new
	 * Scanner(System.in); int age = input.nextInt(); if (age < 18 || age > 80)
	 * { throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ"); } else {
	 * System.out.println("��ӭ��ס���Ƶ�"); } } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 */

}
