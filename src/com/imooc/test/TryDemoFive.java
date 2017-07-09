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
			throw new Exception("我是新产生的异常1",e);
		}
		
	}

	public static void testthree() throws Throwable{
		try{
			testtwo();
		}catch(Exception e){
			Exception e1=new Exception("我是新产生的异常2");
			e1.initCause(e);
			throw e1;
//			throw new Throwable("我是新产生的异常2",e);
		}
	}

}
