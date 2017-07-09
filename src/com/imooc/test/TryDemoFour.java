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
			System.out.println("酒店前台工作人员不允许办理登记");
//			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//描述酒店的入住规则：限定年龄，18岁以下，80岁以上的住客必须由亲友陪同
	public static void testAge() throws HotelAgeException{
		System.out.print("请输入年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 18 || age > 80) {
//			throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
			throw new HotelAgeException();
		} else {
			System.out.println("欢迎入住本酒店");
		}
	}

	
	/*public static void testAge() {

		try {
			System.out.println("请输入年龄：");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
			} else {
				System.out.println("欢迎入住本酒店");
			}
		} catch (Exception e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}

	}*/
	 

}
