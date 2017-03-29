import java.io.*;

class Average{
	private int array[], sum = 0, avg = 0;
	void average(int[] array){
		for (int i = 0; i < 5; i++){
				System.out.println("array "+ array[i]);
				sum += array[i];
			}
		System.out.println("array_length"+array.length);
		avg = sum / array.length;
		System.out.println("average "+ avg);
	}
}


public class InputOutput{
	public static void main(String args[]){
		Average avg = new Average();
		int a[] = new int[5];
		// prompt user to take input.
		DataInputStream ds = new DataInputStream(System.in);
		try{
			for (int k = 0; k < 5; k++)
				a[k] = Integer.parseInt(ds.readLine());
		}catch(Exception e){
			System.out.println("Yu got "+ e);
		}
		avg.average(a);
	}
}

