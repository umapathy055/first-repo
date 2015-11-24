package sampleexception;

import java.io.DataInputStream;

class MyExceptions extends Exception{
	public MyExceptions()
	{
		//super("incorrect value");
		System.out.println("enter correct value");
	}
}

public class Userdefinedexception {

	static int a;
	public static void main(String[] args) throws MyExceptions {
		// TODO Auto-generated method stub
		try{
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("enter value");
		a=Integer.parseInt(d.readLine());
		if (a<4)
		{
			MyExceptions me = new MyExceptions();
			throw me;
			
		}
		System.out.println("entered number");
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		

	}

}
