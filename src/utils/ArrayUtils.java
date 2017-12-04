package utils;

public class ArrayUtils {
	
public static void reverse(int[] arr)
{
int l = arr.length;
int[] newArr= new int[l];
for (int i=0; i<l; i++)
	newArr[i]=arr[l-i-1];
for (int j=0; j<l; j++)
	arr[j]=newArr[j];	
}

public static String stringifyArray(int[] arr)
{
	String str="";
	int l = arr.length;
	for (int i=0; i<l; i++)
		str = str+arr[i]+",";
	return str;	
}

}

