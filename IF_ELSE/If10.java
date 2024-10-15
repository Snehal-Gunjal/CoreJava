/*
Electricity bill problem:
-given an integer input a which reprensents units of electricity consumed at your house.
-calculate and print the bill amount .
units < = 100 : price  per unit is 1   //100*1
units > 100 : price per units is 2 ;
input : 50 ; o/p=50
input : 200  // 100 * 1 + 100 * 2 = 300 ;
output : 300   
*/
class If10{
	public static void main( String[]args )
	{
		int unit1 = 50 ;
		if( unit1 <= 100 )
		{
			System.out.println( unit1*1 ) ;
		}
		else 
		{
			//greater than 100 ..so 100 *1 ..so aata 100 gele ...2 unit mhanun * 2 ;
			
			System.out.println( 100 * 1 *( unit1 -100)*2 ) ;
		}
	}
}
			
			
