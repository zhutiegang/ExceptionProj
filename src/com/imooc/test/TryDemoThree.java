package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int result = test();
			System.out.println("one��two�����ǣ�" + result);
		} catch (ArithmeticException e) {
			System.out.println("����������Ϊ0");
			e.printStackTrace();
		}catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("����������");
			e.printStackTrace();
		}
	}
	
	/**
	 * ���Խ��������������ķ���
	 * @return	�����������ݵ���
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
	/*public static int test() throws ArithmeticException,InputMismatchException {
		Scanner input = new Scanner(System.in);
		System.out.println("======���㿪ʼ======");
		System.out.print("�������һ��������");
		int one = input.nextInt();
		System.out.print("������ڶ���������");
		int two = input.nextInt();
		System.out.println("======�������======");
		return one / two;
	}*/
	
	public static int test() throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("======���㿪ʼ======");
		System.out.print("�������һ��������");
		int one = input.nextInt();
		System.out.print("������ڶ���������");
		int two = input.nextInt();
		System.out.println("======�������======");
		return one / two;
	}

}
