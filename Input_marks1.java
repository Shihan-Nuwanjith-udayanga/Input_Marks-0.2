import java.util.*;
class Input_marks1{
	public static int[] createIntArray(int size){
		int[] array=new int[size];
		return array;
	}
	public static void readMarks(int[] y){
		Scanner input=new Scanner(System.in);
		System.out.println();
		for(int i=0; i<y.length; i++){
			System.out.print("Input no "+(i+1)+" Student Marks :");
			y[i]=input.nextInt();
		}
	}
	public static int findTotal(int[] x){
		int total=0;
		for(int i=0; i<x.length; i++){
			total+=x[i];
		}
		return total;
	}
	public static int findMax(int[] x){
		int max=x[0];
		for(int i=0; i<x.length; i++){
			if(x[i]>max){
				max=x[i];
			}
		}
		return max;
	}
	public static int findMin(int[] x){
		int min=x[0];
		for(int i=0; i<x.length; i++){
			if(x[i]<min){
				min=x[i];
			}
		}
		return min;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input numbers of Students :");
		final int N=input.nextInt();
		int[] marks=createIntArray(N);
		
		//read marks
		readMarks(marks);
		
		//find total
		int total;
		total=findTotal(marks);
		
		//find max
		int max;
		max=findMax(marks);
		
		//find min
		int min;
		min=findMin(marks);
		
		System.out.println();
		System.out.println("Total :"+total);
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
	}
}
