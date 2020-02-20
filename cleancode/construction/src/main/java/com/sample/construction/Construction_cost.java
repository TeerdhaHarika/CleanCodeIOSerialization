package com.sample.construction;

public class Construction_cost 
{
	
	double constructioncost;
	double totalarea;
	int typeofhouse;
	double automated;
	Construction_cost(double totalarea,int typeofhouse) // totalarea = Total Area of the House
	{
		this.totalarea=totalarea;
		this.typeofhouse=typeofhouse;
		automated=2500-1800;
		constructioncost=0;
	}
	double calculate_cost(int a)	
	{
		if(typeofhouse==1)
		{
			return constructioncost = (1200+a) * totalarea; // Construction Cost for Standard Material
		}
		else if(typeofhouse==2)
		{
			return constructioncost = (1500+a) * totalarea; // Construction Cost for Above Standard Material
		}
		else if(typeofhouse==3)
		{
			return constructioncost = (1800+a) * totalarea; // Construction Cost for High Standard Material
		}
		else if(typeofhouse==4)
		{
			return constructioncost = 2500 * totalarea; // Construction Cost for High Standard Material and Fully Automated Home
		}
		else
		{
			return 0;
		}
	}

}


