package lesson4;

public class BinarySearch 
{
	public static int binarySearch(int[] intArr, int key, int min, int max)
	{
		int mid = (min+max)/2;
		if((key>intArr[intArr.length-1]||(key<intArr[0])))
		{
			return -1;
		}
		if(key==intArr[mid])
		{
			return 1;
		}
		else if(key<intArr[mid])
		{
			return binarySearch(intArr, key, min, mid-1);
		}
		else if(key>intArr[mid])
		{
			return binarySearch(intArr, key, mid+1, max);
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(a,9,0,9));
	}
}
