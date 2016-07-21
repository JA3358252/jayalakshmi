import java.util.Scanner;


public class Alpha {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character:");
		char c=s.next().charAt(0);
		if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
	        System.out.println(" is an alphabet."+c);}
	    else{
	        System.out.println(" is not an alphabet."+c);
	        s.close();
	    }
	}
	

}
