import java.util.Scanner;

/**
 * 
 * Complete the code with TODO
 *
 */
interface SimpleStatistics {
	public int calculateAverage();
	public int calculateMin();
	public int calculateMax();
}
public class IntegerStatistics implements SimpleStatistics {
	public int[] arrayOfNumbers;
	public IntegerStatistics(int[] array){
		arrayOfNumbers = array;
	}
	public int calculateAverage(){
		int avg=0;
		//TODO: Write logic to calculate average
		return avg;
	}

	public int calculateMin(){
		int min=0;
		//TODO: Write logic to calculate minimum
		return min;
	}
	
	public int calculateMax(){
		int max=0;
		//TODO: Write logic to calculate maximum
		return max;
	}
	
	public static void main(String[] args){
		System.out.print("Enter number of total elements:");
		Scanner input = new Scanner(System.in);
		int total=input.nextInt();
		int[] array=new int[total];
		System.out.print("Enter number seperated by space or newline:");
		for(int i=0;i<total;i++){
			array[i]=input.nextInt();
		}
		
		IntegerStatistics number = new IntegerStatistics(array);
		int average=number.calculateAverage();
		int max=number.calculateMax();
		int min=number.calculateMin();
		
		System.out.println("Average:"+average);
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		
		input.close();
	}
}
