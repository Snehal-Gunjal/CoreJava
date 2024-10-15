/* Given the tempereature of a person in ferenhit
- print whether the person has high , normal , low temperature
> 98.6 => high 
98.0> = and <= 98.6 ==> normal 
< 98.0 ==> low 
*/

class If6{
	public static void main( String[]args)
	{
		float f_temp = 100.0f ;
		if( f_temp > 98.6f )
		{
			System.out.println( "Temperature is High") ;
		}
		else if( f_temp >= 98.0f && f_temp <= 98.6f )
		{
			System.out.println( "Temperature is Normal") ;
		}
		else
		{
			System.out.println( "Temperature is Low ") ;
		}
		
	}
}
OTHER WAY :-Best WAY 

class If6{
	public static void main( String[]args)
	{
		float f_temp = 100.0f ;
		if( f_temp > 98.6f )
		{
			System.out.println( "Temperature is High") ;
		}
		else if(f_temp < 98.0f )
		{
			System.out.println( "Temperature is Low") ;
		}
		else
		{
			System.out.println( "Temperature is Normal ") ;
		}
		
	}
}