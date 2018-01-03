package assignment;
import java.util.*;
public class first {
	
	
	static public int sum(String nav1)
	{
		int sum=0;
		
		
		for(int i=0;i<nav1.length();i++)
		{
		if(nav1.charAt(i)>48&&nav1.charAt(i)<57)
		{ 
		sum+=Integer.parseInt(Character.toString((nav1.charAt(i))));
		}
		}
		return sum;
	}
	static public boolean sq(String day,int value)
	{
		if(day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday"))
		{
			if(value>40)
		return true;		
		}else
		{
			if(value>40&&value<60)
				return true;
		}
		return false;
	}
	
	static public int three(int a,int b,int c)
	{
		int sum=0;
		sum+=a;
		if(a!=b)
			sum+=b;
		if(a!=c&&b!=c)
			sum+=c;
		return sum;
		
	}
	
	static public int recursion(int[] a,int times,int position)
	{
		if(position<0)
			return 0;
		else
		{
			
		if(a[position]==11)
			times=times+1+recursion(a,times,--position);
		else
			times=times+recursion(a,times,--position);
		}
		recursion(a,times,--position);
		
		return times;
	
	}
public static void main(String[] args)
{
	
	Scanner nav=new Scanner(System.in);
//****************first program************************//
	
	//String nav1=nav.next();
	//System.out.println(sum(nav1));

	
	//*******************second program*******************//
	//String day=nav.next();
	//int value=nav.nextInt();
	
//	System.out.println(sq(day,value));
	//*******************third program*******************//
	//int a=nav.nextInt();
	//int b=nav.nextInt();
	//int c=nav.nextInt();
	//System.out.println(three(a,b,c));
	
	int l=nav.nextInt();
	int[] array=new int[l];
	for(int i=0;i<l;i++)
	{
		array[i]=nav.nextInt();
	}
	System.out.println(recursion(array,0,l-1));
	
	
	
}
}