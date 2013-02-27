
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArray[][]={{1,2,3,4},{12,13,14,15}};	  //[1][1-5]
		
		
		int secondArray[][]={{34,3,12,65},{23,7,15},{34}};
		
		//display(firstArray);
		display(secondArray);
	}

	public static void display(int x[][])
	{
		for(int row=0; row<x.length; row++)
		{
			for(int column=0; row<x[row].length; column++)
			{
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
	
}
