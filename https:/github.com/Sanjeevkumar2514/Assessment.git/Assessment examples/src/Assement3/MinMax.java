package Assement3;

public class MinMax {
	public static void main(String[] args) 
	{
				int arr[]={76,2,4,7,19,24};
				int min=arr[0],max=arr[0];
				for(int i=0;i<arr.length;i++)
				{
			    		if(min>arr[i])
			    		{
			        			min=arr[i];
			    		}
			    		if(max<arr[i])
			    		{
			        			max=arr[i];
			    		}
				}
				System.out.println("This is a minimum number: "+min);
				System.out.println("This is a maximum number: "+max);
			}

}
