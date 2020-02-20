package com.sample.simple_and_compound;

public class Interest_calc 
{
	double principle_amount,rate_of_interest;
	double simple_interest,compound_interest;
	int time;
	Interest_calc(double principle_amount,double rate_of_interest,int time)
	{
		this.principle_amount=principle_amount;
		this.rate_of_interest=rate_of_interest;
		this.time=time;
	}
	double simple_interest()
	{
		return (principle_amount*rate_of_interest*time)/100;
	}
	double compound_interest()
	{
		double t=1+(rate_of_interest/100);
		return principle_amount*Math.pow(t,time)-principle_amount;
	}
}
