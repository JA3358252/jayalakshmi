import java.util.Scanner;


public class Large {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n>n1 &&n>n2){
			System.out.println("n is greater:"+n);
		}
		else if(n1>n && n1>n2)
		{
			System.out.println("n1 is greater"+n1);
		}
		else
		{
			System.out.println("n2 is greater"+n2);
		s.close();
		}
	}

}
