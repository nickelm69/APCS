package module6;

public class FinalTestMod6 {

	public static void main(String[] args) {
		String[ ] veggies = { "zucchini", "carrot", "spinach", "asparagus" };
		//Question 1 - answer: 30 (e)
		int i = 0;
		for (String item : veggies)
		{
		    i += item.length();
		}
		System.out.println(i);
		//Question 2 - answer: endless loop (e)
		/*
		int[ ] a = {11, 33, 55, 77};
		int i2 = 0;
		while (i2 < a.length)
		{
		    if (a[i2] < 50)
		    {
		        a[i2] = a[i2] % 3;
		    }
		    else
		    {
		        a[i2] = a[i2 - 1] + a[i2];
		    }
		    i++;
			
		}
		*/
		//Question 3 - answer: 6 (e)
		int a = 2;
		int b = 0;
		while (a < 10)
		{
		   b = 6;
		    while (b > a)
		    {
		        b--;
		    }
		    a += b;
		}
		System.out.println(b);
		//Question 4 - answer: 92, 88, 95, 83 (b)
		int[ ] grades = {88, 92, 95, 83};
		int temp = grades[0];
		grades[0] = grades[1];
		grades[1] = temp;
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		//Question 5 - k -= n; (a)
		//Question 6 - Integer.MAX_VALUE (b) is used for minimum value
		//Question 7 - not correctly initialized, sum should be 0
		int sum = 2;
		int k;
		for(k = 4; k <= 12; k += 2)
		{
		    sum += k;
		    System.out.println("sum = " + sum);
		}
		//question 8 - all 3 false
		boolean a2 = true;
		boolean b2 = false;
		boolean c2 = true;
		if (!((a2 || b2) && c2)) {
			System.out.println("1 = ");
		}
		if (!a2 && (b2 && c2)) {
			System.out.println("2 = " );
		}
		if(!a2 && (b2 || c2)){
			System.out.println("3 = " );
		}	
		//9 - 95 (c)
		//q12
		/*
		int i3 = 7;
		while (i3 >= 2)
		{
		    System.out.print (i3 + " ");
		    if ((i3 % 3) == 0)
		    {
		        i3 += 2;
		    }    
		    else
		    {
		        i3 /= 2;
		    }
		}
		*/
		//q13
		String s = "Howdy";
		int i4 = s.length() - 1;
		String total = "";
		String letter;

		while (i4 >= 0)
		{
		    letter = s.substring (i4, i4 + 1);
		    System.out.print (i4 + " " + letter + " ");
		    i4--;
		    
		}
		//q14
		int n = 1;
		int sum1 = 1;
		int i5 = 2;
		while (i5 <= n)
		{
		    sum += i5;
		    i5++;
		}
		System.out.println(sum1);
		
	}

}
