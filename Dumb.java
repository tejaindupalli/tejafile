
import java.util.scanner;
class Dumb{
	
	public static void main (String x[])
	{
		
		int n1, n2, n3, ch;
		scanner input = new scanner(System.in);
		
		System.out.println("enter first num:");
		
		n1 = intput.nextint();
		
		System.out.println("enter second num:");
		
		n2 = intput.nextint();
		
		System.out.println("choises are:");
		
		System.out.println(" 1. Addition:");
		
		System.out.println(" 2. sub:");
		
		System.out.println(" 3. multi:");
		
		System.out.println(" 4. div:");
		
		System.out.println("enter your choise:");
		
		ch = input.nextint();
		
		switch (ch)
		{
		case 1:
				n3=n1+n2;
				System.out.println("add:" +n3);
				break;
				
		case 2:
				n3=n1-n2;
				System.out.println("sub:" +n3);
				break;
				
		case 3:
				n3=n1*n2;
				System.out.println("multi:" +n3);
				break;
			
		case 4:
				n3=n1/n2;
				System.out.println("div:" +n3);
				break;
				
				default:
				
				System.out.println("you have enter wrong choise");
			 	
			
		}	
		
		
	}
	
	}