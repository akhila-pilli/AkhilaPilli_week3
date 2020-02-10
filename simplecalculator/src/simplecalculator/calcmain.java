package simplecalculator;
import java.util.*;

public class calcmain {

	public static void main(String args[] )
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the operands:\n");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("enter the operator for operation\n");
		char c=in.next().charAt(0);
		calculator r = new calculator();
		switch(c)
		{
		case '+':System.out.println(a+"+"+b+"="+r.add(a,b));
		break;
		case '-':System.out.println(a+"-"+b+"="+r.sub(a,b));
		break;
		case '*':System.out.println(a+"*"+b+"="+r.mul(a,b));
		break;
		case '/':System.out.println(a+"/"+b+"="+r.div(a,b));
		break;
		default: System.out.println("operator is not valid");
		}
		System.out.println("\nDo yo want to do further operations\n(y/n");
		
	}

}
