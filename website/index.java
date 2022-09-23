 import java.util.*;
public class index{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];
		for(int i=0; i<size; i++){
			number[i] = sc.nextInt();
			System.out.println(number[i]);
		}
	}
}
		