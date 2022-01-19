package LineComparision;

import java.util.Scanner;

public class LineComparisionUC2 {
   
	public static void main(String [] args){
	//Variables 
	  int x1,y1,x2,y2,p1,q1,p2,q2;
	  Double length1,length2;
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the first co-ordinate of first point : ");
	x1=s.nextInt();
	System.out.println("Enter the second co-ordinate of first point : ");
	y1=s.nextInt();
	System.out.println("Enter the first co-ordinate of second point : ");
	x2=s.nextInt();
	System.out.println("Enter the second co-ordinate of second point : ");
	y2=s.nextInt();
	
	System.out.println("Enter the first co-ordinate of third point : ");
	p1=s.nextInt();
	System.out.println("Enter the second co-ordinate of third point : ");
	q1=s.nextInt();
	System.out.println("Enter the first co-ordinate of fourth point : ");
	p2=s.nextInt();
	System.out.println("Enter the second co-ordinate of fourth point : ");
	q2=s.nextInt();
	
	length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	length2=Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
	
	System.out.println("Length of first two points : "+length1);
	System.out.println("Length of second two points : "+length2);
	
	boolean res =length1.equals(length2);
	if(res=true)
		System.out.println("Both the lengths are equal");
	else
		System.out.println("Both the lengths are not equal");
}
}