package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo1 {

	public static void main(String[] args) {
/*		// Ҫ�󣺶��������������������֮��
		int one=12;
		int two=2;
		System.out.println("one��two�����ǣ�"+one/two);*/
		
		// Ҫ�󣺶������������������û��ļ������룬�������֮��
		Scanner input=new Scanner(System.in);
		System.out.println("======���㿪ʼ======");
		try{
			System.out.print("�������һ��������");
			int one=input.nextInt();
			System.out.print("������ڶ���������");
			int two=input.nextInt();
			System.out.println("one��two�����ǣ�"+one/two);
		}catch(ArithmeticException e){
			System.exit(1);
			e.printStackTrace();
			System.out.println("����������Ϊ��");
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("����������");
		}catch(Exception e){
			System.out.println("���������~~~~");
		}finally{
			System.out.println("======�������======");
		}

	}

}
