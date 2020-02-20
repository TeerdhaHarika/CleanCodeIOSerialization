package com.sample.simple_and_compound;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter principle amount :");
    	double principle_amt=sc.nextDouble();
    	System.out.println("Enter the rate of interest :");
        double rate=sc.nextDouble();
        System.out.println("Enter the time period");
        int time=sc.nextInt();
        Interest_calc interest=new Interest_calc(principle_amt,rate,time);
        System.out.println("Enter the choice :\n1.simple interest\t2.compound interest");
        int choice=sc.nextInt();
        if(choice==1)
        {
        	System.out.println("Simple Interest is : "+interest.simple_interest());
        }
        else if(choice==2)
        {
        	double cmp=interest.compound_interest();
        	System.out.println("compound Interest is : ".format("%.2f",cmp));
        }
        else
        {
        	System.out.println("Invalid choice\n");
        }
    }
}
