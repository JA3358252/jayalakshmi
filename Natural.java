import java.util.Scanner;


public class Natural {
	public static void main(String[] args) {
		 int n;
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter range");
		 n=s.nextInt();
		 int m=0;
	
			 for(int i=1;i<=n;i++){
				 m=m+i; 
			 }
		 System.out.println(m);
		 s.close();
	}

}
