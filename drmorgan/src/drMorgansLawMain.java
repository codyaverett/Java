
public class drMorgansLawMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int x = 6;
		int y = 0;
		 
//SECTION A
		
		if ( !( x < 5 ) && !( y >= 7 ) )
		{
			System.out.println( "!( x < 5 ) && !( y >= 7 )" );
		}
		 
		if ( !( ( x < 5 ) || ( y >= 7 ) ) )
		{
			System.out.println( "!( ( x < 5 ) || ( y >= 7 )" );
		}
		 
		int a = 8;
		int b = 22;
		int g = 88;
		 
//SECTION B
		
		if ( !( a == b ) || !( g != 5 ) )
		{
			System.out.println( "!( a == b ) || !( g != 5 )" );
		}
		 
		if ( !( ( a == b ) && ( g != 5 ) ) )
		{
			System.out.println( "!( ( a == b ) && ( g != 5 ) )" );
		}
		 
		x = 8;
		y = 2;
		 
//SECTION C
		if ( !( ( x <= 8 ) && ( y > 4 ) ) )
		{
			System.out.println( "!( ( x <= 8 ) && ( y > 4 ) )" );
		}
		 
		if ( !( x <= 8 ) || !( y > 4 ) )
		{
			System.out.println( "!( x <= 8 ) || !( y > 4 )" );
		}	
		 
		int i = 0;
		int j = 7;
		 
//SECTION D
		if ( !( ( i > 4 ) || ( j <= 6 ) ) )
		{
			System.out.println( "!( ( i > 4 ) || ( j <= 6 ) )" );
		}
		 
		if ( !( i > 4 ) && !( j <= 6 ) )
		{
			System.out.println( "!( i > 4 ) && !( j <= 6 )" );
		}

	}

}
