package by.it_academy.tr.lab1;

import java.util.Random;

public class Laba1 {

	public static void main(String[] args)
	{
		Number1 n1 = new Number1();
		n1.task1(2.0, 3.0);
		
		System.out.println("------------------------");

		
		Number2 n2 = new Number2();
		Random r = new Random();
		int a = r.nextInt(50);
		n2.task2(a);
		
		System.out.println("------------------------");

		
		Number3 n3 = new Number3();
		n3.task3(2, 3, 0.1);
		
		System.out.println("------------------------");

		
		Number4 n4 = new Number4();
		int[] arrayN4 = {1,2,3,4,5,6,7,8,9,10,11};
		n4.task4(arrayN4);
		
		System.out.println("------------------------");
		
		Number5 n5 = new Number5();
		int[] array = {1,3,8,7,4,5,10,12,8,11,16};
		int[] array2 = new int[array.length];
		n5.tusk5(array,array2);
		
	}
}

class Number1
{
	public void task1(double x, double y) 
	{
		double answer = 1 + Math.pow((Math.sin(x + y)), 2)
						/(2 + Math.abs(x - (2*x) / ( 1 + Math.pow(x, 2) * Math.pow(y, 2) ))) + x;
		
		System.out.println(answer);
	}
}

class Number2
{
	public void task2(int l) 
	{
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for(int i = 0; i<=l ;i++) 
		{	
			if(i>15) 
			{
				count1++;
			}
			
			if(i>2) 
			{
				count2++;
			}
			
			if(i%5 == 4) 
			{
				count3 += i ;
			}
		}
		System.out.println("Число = " + l);
		System.out.println("Чисел больше 15 = " + count1);
		System.out.println("Чисел больше 2 = " + count2);
		System.out.println("Сумма чисел которые делятся на 5 с остатком 4 = " + count3);
	}
}

class Number3
{
	public void task3(double a, double b , double h) 
	{
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <= b ; x = x + h)
		{
			y = Math.tan(x);
			
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y); 
		}
	}
}

class Number4
{
	public void task4(int[]array) 
	{
		int count;
		int date;
		
		for(int i=1;i<array.length;i++) 
		{
			count = 1;
			date = i+1;
			for(int j=2;j<date;j++) 
			{
				if(date%j == 0) 
				{
					count = 0;
				}	
			}
			if (count == 1)
			{
				System.out.println("Число = " + array[i] + " простое число, его номер = " + i);
			}
		}
	}
}

class Number5
{
	public void tusk5(int[]array , int[]array2) 
	{
		int count = 0;
		int maxLine = 0;
		int minValue = 0;
		int maxValue = 0;
		
		for(int i=0;i<array.length-1;i++) 
		{
			if(array[i]<array[i+1]) 
			{
				count++;
				if(count>maxLine) 
				{
					maxLine = count;
					maxValue = i+1;
					minValue = i-(count-1);
				}
			}
			else 
			{
				count = 0;
			}
		}
		///////
		for(int i = 0;i<array.length-1;i++)
		{
			if(array[i]<array[i+1]) 
			{
				array2[i] = array[i];
				array2[i+1] = array[i+1];
			}
		}
		///////
		for(int i=minValue;i>0;i--) 
		{
			if(array2[minValue]<array2[i]) 
			{
				array2[i] = 0;
			}
		}
		//////
		for(int i = maxValue;i<array2.length-1;i++) 
		{
			if(array2[maxValue]>array2[i]) 
			{
				array2[i] = 0;
			}
		}
		//////
		System.out.print("Самая длинная последовательность = ");
		
		for(int i:array2) 
		{
			if(i!=0) 
			{
				System.out.print(i + " ");
			}
		}
	}
}
