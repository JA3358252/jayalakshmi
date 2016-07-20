import java.util.Scanner;


public class Cons {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter character:");
		char ch=scr.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		System.out.println("vowel is:"+ch);
	}
	else
	{
		System.out.println("consonent is:"+ch);
	
	scr.close();
	}
	}

}
