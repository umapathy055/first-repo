package sampleexception;

public class Ex {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		try{
			int a,b,c=0;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			
			c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
