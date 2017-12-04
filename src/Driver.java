import animals.Puppy;
import utils.ArrayUtils;
import utils.Math;
public class Driver {

	public static void main(String[] args)
	{
		Puppy p1 = new Puppy("Joye");
		Puppy p2 = new Puppy("Chandler");
		Puppy p3 = new Puppy("Ross");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		
		int[] a = {9, 20, 3, 44, 88, 300};
		ArrayUtils.reverse(a);
		System.out.println(ArrayUtils.stringifyArray(a));
		
		double b = 15.4;
		System.out.println(Math.factorial((int)b));
		
	}
	
	
}
