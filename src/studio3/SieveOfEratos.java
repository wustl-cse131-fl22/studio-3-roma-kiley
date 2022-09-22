package studio3;

import java.util.Scanner;

public class SieveOfEratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
	boolean[]numTable = new boolean[n+1]; //declare+create array
	//array all auto false
	
	for(int i = 0; i<=n; i++)
	{
		numTable[i] = true; //set all to true from false
	}
	
	for (int i = 2; i <= n; i++)
	{
	if(numTable[i] == true) 
	{

		for(int multiple = i*2 ; multiple <= n; multiple+=i)//i*2 starts at 4 bc you want 2 --scanning #s for multiples of 2 +++
		{	
			numTable[multiple] = false;
			
		}

		System.out.println(i);	//has to be inside where it states i is true	
		}

	}
	}
		
	
	
	
		
	}


