
// find sum of the digits of a number
class DigitSumOfNumber{
	int rem = 0, sum = 0;
	protected void digitSumOfNumber(int num){
		System.out.println("You typed = "+num);
		while ( num > 0){
			rem = num % 10;
			num = num / 10;
			sum += rem; 
		}
		System.out.println("Sum of digits = "+sum);
	}
}

// display table of given number. It prints till 10. You can print it to any number.
class DisplayTable{
	public void displayTable(int num){
		for (int i = 1; i <= 10 ; i++){
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
}

// finding factorial. this is the example for recursion
class Factorial{
	protected int fact(int num){
		int mul = num;
		if (num <= 1){
			return 1;
		}
		else{
			// recursion
			mul *= fact(num-1);
			}
		return mul;
	}
}

// find fibonacci of the given number.
class Fibonacci{
	void findSeries(int num){
		int i = 0,sum=0,prev=0;
		while(i <= num){
			if(i==0) prev = 0;
			else if(i == 1) prev = 1;
			else if(i==2){
				sum=0;
			}
			sum += prev;
			prev = sum;
			System.out.print(sum+" ");
			i++;
		}
	}
}

// find  x^y 
class PowerFunctions{
	protected void function1(int x,int y){
		int ans = 1;
		for (int i = 1; i <= y ; i++){
			ans *= x;
		}
		System.out.println(x +" ^ "+ y + " = " + ans);
	}
}

// base class calling all above utilities.
public class LoopUtilities{
	public static void main(String[] args){
		//new DigitSumOfNumber().digitSumOfNumber(Integer.parseInt(args[0]));
		//new DisplayTable().displayTable(Integer.parseInt(args[0]));
		//new Fibonacci().findSeries(Integer.parseInt(args[0]));
		//new PowerFunctions().function1(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		//System.out.println("Factorial of the given number is:"+new Factorial().fact(Integer.parseInt(args[0])));
	}	
}