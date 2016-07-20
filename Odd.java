import java.util.Scanner;


public class Odd {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter no:");
	int n=scr.nextInt();
	if(n%2==0){
		System.out.println("no is even:"+n);
	}
	else{
		System.out.println("no is odd:"+n);
	
	scr.close();
	}
	}

}
