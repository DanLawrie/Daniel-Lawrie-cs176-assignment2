package assignment2;

public class Question1 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int total = 0;
		for(int i = 0; i<array.length; i++)
		{
			for(int y = 0; y<array[0].length; y++)
			{
				array[i][y] = i+ y;
				System.out.print(array[i][y] + "   ");
			}
			System.out.println();
		}
		for(int g = 0; g < array[0].length; g++)
		{
			total = array[2][g] + total;
		}
		System.out.println("Sum of elements at second row " + total);
		total = 0;
		for(int g = 0; g < array.length; g++)
		{
			total = array[g][3] + total;
		}
		System.out.println("sum of third colemn " + total);
		total = 0;
		for(int column = 0; column < array[0].length; column++)
		{
			for(int row = 0; row < array.length; row++)
			{
				total = array[column][row] + total;
			}
		}
		System.out.println("Sum of all elements " + total);
		
		for(int i = 0; i<array.length; i++)
		{
			for(int y = 0; y<array[0].length; y++)
			{
				
				System.out.print(array[i][y] + "   ");
			}
			System.out.println();
		}
	//	TextTable tt = new TextTable(columns, rows);
		
		
	}

	

}
