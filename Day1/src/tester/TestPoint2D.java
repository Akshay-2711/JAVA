package tester;

import java.util.Scanner;

import code.Point2D;

public class TestPoint2D {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Point2D p1 =new Point2D(5,8);
		Point2D p2 =new Point2D(3,2);
		System.out.println(p1.Show());
		System.out.println(p2.Show());
		System.out.println(p1.isEqual(p2));
		System.out.println(p1.CalDist(p2));
		
		System.out.println("How many points to be plotted");
		int n = sc.nextInt();
		Point2D point[] = new Point2D[n];
		int count =0;
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the no."+(i+1)+" element");
			 point[i]=new Point2D(sc.nextInt(),sc.nextInt());
			//point[i].x=sc.nextInt();
			//point[i].y=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			System.out.println(point[i].Show());
			//System.out.println("NO."+(i+1)+"Element : "+arr[i][0]+ " "+arr[i][1]);
		}
		
	}

}
