public class Armstrongnmbr
{
	public static void main(String[] args) 
	{
		int[] array = {153,370,456,675,535,407};
		for (int i =0;i<array.length;i++)
		{
		    int m=array[i]/100;
		    int b= array[i]%100;
		    int r=b/10;
		    int c=b%10;
		    int l = m*m*m + r*r*r + c*c*c;
		    if (array[i] == l)
		    {
		        System.out.println(array[i] + " is an Armstrong number");
		    }
		}
	}
}