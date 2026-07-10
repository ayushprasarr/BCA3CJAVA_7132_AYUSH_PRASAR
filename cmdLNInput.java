//4.1 Write a java program to perform different arithmetic operations.(Using Command Line args).

class cmdLNInput
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("First no. : " + a);
		System.out.println("Second no. : " + b);
		System.out.println("Addition : " + (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Divison : " + (a/b));
		System.out.println("Modulus : " + (a%b));
	}
}	