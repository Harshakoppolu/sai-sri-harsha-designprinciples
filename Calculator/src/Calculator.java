import java.util.*;
public class Calculator {
	 public static void main(String[] args)
	 {
	 int number1,number2,choice;
	 int flag=1;
	 char s;
	 Scanner scan=new Scanner(System.in);
	 public int Addition(int num1,int num2)
	 {
	  return num1+num2;
	 }
	 public int Subtraction(int num1,int num2)
	 {
	  return num1-num2;
	 }
	 public int Multiplication(int num1,int num2)
	 {
	  return num1*num2;
	 }
	 public int Division(int num1,int num2)
	 {
	  if(num2!=0)
	  {
	   return num1+num2;
	  }
	  else
	  {
	   return 0;
	  }
	 }
	 while(Flag==1)
	 {
	  System.out.println("Menu");
	  System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	  System.out.println("Enter your choice");
	  choice=scan .nextInt();
	  System.out.println("Enter number1");
	  number1=scan.nextInt();
	  System.out.println("Enter number2");
	  number2=scan.nextInt();
	  switch(choice)
	  {
	   case 1:System.out.println("Addition of"+number1+"and"+number2+"is"+Addition(number1,number2));
	          break;
	   case 2:System.out.println("Subtraction of"+number1+"and"+number2+"is"+Subtraction(number1,number2));
	          break;
	   case 3:System.out.println("Multiplication of"+number1+"and"+number2+"is"+Multiplication(number1,number2));
	          break;
	   case 4:System.out.println("Division of"+number1+"and"+number2+"is"+Division(number1,number2));
	          break;
	   default:
	         System.out.println("Invalid choice");
	  }
	  System.out.println("Do you want to continue(y/n)");
	  s=scan.next();
	  if(s=='N')
	  {
	   flag=0;
	  }
	  }
	}
	}
}
