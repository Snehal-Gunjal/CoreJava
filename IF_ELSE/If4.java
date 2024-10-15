/* -Take two integers A and B as input 
- print the max two .
-assume : x and y are not equal .
INPUT :
x = 5 , y = 5 
output:
Both are equal 
*/

class If4{
	public static void main( String[]args )
	{
		int x = 5 ;
		int y = 5 ;
		if( x > y )
		{
			System.out.println( x + "is Greater" ) ;
		}
		else if( y > x )                                     //if-else ladder   
		{
		  System.out.println(y + "is greater ") ; // concatanation using + 
		}
		else
		{
			System.out.println( "Both are equal") ;
		}
	}
}