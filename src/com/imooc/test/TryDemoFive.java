package com.imooc.test;

public class TryDemoFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			testthree();
		}catch(Throwable e){
			e.printStackTrace();
		}
	}

	public static void testone() throws HotelAgeException {
		throw new HotelAgeException();
	}

	public static void testtwo() throws Exception{
		try{
			testone();
		}catch(HotelAgeException e){
			throw new Exception("�����²������쳣1",e);
		}
		
	}

	public static void testthree() throws Throwable{
		try{
			testtwo();
		}catch(Exception e){
			Exception e1=new Exception("�����²������쳣2");
			e1.initCause(e);
			throw e1;
//			throw new Throwable("�����²������쳣2",e);
		}
	}

}
