import java.util.Scanner;


public class Leaf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year:");
		int n=s.nextInt();
		if(n%4==0){
			System.out.println("leaf year is:"+n);
		}
		else
		{
			System.out.println("not a leaf year"+n);
		
		s.close();
		}
	}

}
