package com.imooc.test;

import java.io.IOException;
import java.util.Scanner;

public class TryDemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testAge();
		} catch (HotelAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("�Ƶ�ǰ̨������Ա���������Ǽ�");
//			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//�����Ƶ����ס�����޶����䣬18�����£�80�����ϵ�ס�ͱ�����������ͬ
	public static void testAge() throws HotelAgeException{
		System.out.print("���������䣺");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 18 || age > 80) {
//			throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
			throw new HotelAgeException();
		} else {
			System.out.println("��ӭ��ס���Ƶ�");
		}
	}

	
	/*public static void testAge() {

		try {
			System.out.println("���������䣺");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
			} else {
				System.out.println("��ӭ��ס���Ƶ�");
			}
		} catch (Exception e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}

	}*/
	 

}
