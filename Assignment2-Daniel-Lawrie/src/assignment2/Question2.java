package assignment2;
import java.util.ArrayList;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int i = 0;
		int x = 0;
		System.out.println("Type in integers and once done type done");
		while(in.hasNextDouble())
		{
			x = in.nextInt();
			array.add(x);
		
			i++;
		}
		System.out.println();
		for(int g = 0; g< array.size()-1; g=g+2)
		{
			System.out.print(array.get(g)+ " ");
		}
		System.out.println();
		for(int element :array) {
			if(element%2 == 0)
			{
			System.out.print(element + " ");
			}
		}
		
		System.out.println();
		for(int g = 0; g< array.size()-1; g++) {
			if(array.get(g)%2 != 0)
			{
				System.out.print(array.get(g)+ " ");
			}
		}
		System.out.println();
	//reverse order
		int old;
		int next;
		System.out.print("Reverse ");
	for(int y = array.size()-1; y>=0; y-- ) {
		System.out.print(array.get(y) + " ");
		//old = array.get(y);
		//next = array.get(array.size()-y);
		//array.set(array.size()-y, old );
		////array.set(y, next );
	}

		System.out.println();
		System.out.print("first " + array.get(0)+ " \t ");
		System.out.print("middle "+array.get((array.size()-1)/2) + " \t ");
		System.out.print("last " + array.get(array.size()-1));
		
		
		double large = array.get(0);
		double small = array.get(0);
		System.out.println();
		for(int g = 0; g<array.size();g++)
		{
			if(array.get(g)>large)
			{
				large = array.get(g);
			}
			if(array.get(g)<small)
			{
				small = array.get(g);
			}
			
			
		}
		System.out.print("largest "+ large + " \t ");
		System.out.print("smallest " + small);
		System.out.println();
		int total = 0;
		for(i = 0; i<array.size(); i++)
		{
			if(i%2 == 0) {
				total = total + array.get(i);
			}
			if(i%2 != 0) {
				total = total - array.get(i);
			}
		}
		System.out.println("total" + total);
		
	}
	
		
}
