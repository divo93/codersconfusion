// convert Binary number to Decimal Number.
class BinToDec{
	protected void convertToDec(int num){
		int rem = 0, sum = 0, temp = 0;
		System.out.println("Number Binary:\t" + num);
		for(int i=0; num > 0; i++){
			rem = num % 10;
			num = num / 10;
			temp = (int)Math.pow(2,i) * rem;
			sum += temp;
		}
		System.out.println("Number Decimal:\t" + sum);
	}
}

//convert lower case to uppercase and vice vercs
class ConvertCase{
	private char var;
	protected void convert(char var){
		// check for upercase letter A - 65 [Ascii value]
		if(var >= 65 && var <= 91){
			System.out.println("Converting UpperCase to LowerCase");
			var += 32;
			System.out.println(var);
		}
		// check for lowercase letter a - 97 [Ascii value]
		else if(var >= 97 && var <= 123){
			System.out.println("Converting LowerCase to UpperCase");
			var -= 32;
			System.out.println(var);
		}
		else{
			System.out.println("Invalid Literal " + var);
		}
	}
}

// find largest of 3 numbers without using else. I use ternary operation.
class FindLargestWithoutElse{
	int k;
	protected void find(int a, int b, int c){
		k = (a > b) ? ((a > c) ? a : c) : (( b > c ) ? b : c);
		System.out.println("Largest among\t" + a + "\t" + b + "\t" + c + " is " + k) ;
	}
}

class Prime_Number{
		boolean flag = false;
		public void isPrime(int num){
		for(int i=2; i<num/2;i++){
			if(num % i == 0)
				{
					flag=false;
					break;
				}
			else{
				flag = true;
				continue;
			}
		}
		if(!flag)
			System.out.println(num+" is not prime number.");
		else
			System.out.println(num+" is prime number.");
	}
}

// swap two numbers
class Swap{
	private int a;
	private int b;
	Swap(int a, int b){
		this.a = a;
		this.b = b;
	}
	protected void swap(){
		System.out.println("Original Values are\n\ta: "+ a + "\n\tb: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swap Values are\n\ta: "+ a +"\n\tb: " + b);
	}
}

// base class calling above classes
public class Utilities{
	public static void main(String[] args){
		//new BinToDec().convertToDec(10101);
		//new ConvertCase().convert('/');
		//new FindLargestWithoutElse().find(45,48,100);
		//new ModBehavior().check();
		//new Prime_Number().isPrime(Integer.parseInt(args[0]));
		//new Swap(2,3).swap();
	}
}