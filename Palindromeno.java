import java.util.Scanner;
public class Palindromeno {
	public static void main(String[] args) {
  int num,r=0,r1;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the number:");
  num=s.nextInt();
  int b=num;
  while(num>0){
	  r1=num%10;
	  num=num/10;
	  r=r*10+r1;
  }
  if(b==r){
	  System.out.println("yes:"+r);
  }
  else
  {
	  System.out.println("no");
  s.close();
  }
  }
	}


