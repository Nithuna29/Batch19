
public class HelloWorld {
	public static void main(String args[])
	{
		int i=0;
		for(i=0;i<5;i++)
		System.out.println("I am printing Argument" + i  + " " + args[i]);
		String output = ( i > 3)? "Greater" : " Smaller" ;
		System.out.println(output);
	}

}
