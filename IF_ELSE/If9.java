/*---->Sequence matters
Given an integer value as input .
- print fizz if it is divisible by 3 ;
- print buzz it is divisible by 5 ;
-print fizz - buzz is divisible by both ;
-  if not then print "Not divisible by both" */
class If9{
	public static void main( String[]args)
	{
		int x = 7 ;
		if( x % 3 == 0 && x % 5 == 0 )
		{
			System.out.println( "fizz-buzz") ;
		}
		else if( x % 5 == 0 )
		{
			System.out.println( "buzz" );
		}
		else if( x % 3 == 0 ) 
		{
			System.out.println("fizz");
		}
		else
		{
			System.out.println("Not divisible by both") ;
		}
	}
}