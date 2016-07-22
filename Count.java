import java.util.Scanner;


public class Count {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int a=0;
		int count=0;
		while(n!=0){
			a=n%10;
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
