class QuizFor4{
	public static void main( String[]args ){
		int var1 = 10 ;
		for( System.out.println(var1) ; var1 < 15 ; System.out.println(var1) , var1++ ){
			if( var1 == 12 )
				System.out.println( var1 );
		}
	}
}
/*
10 
10<15 yes 
body .....10 
var1++ = 11 
11<15 yes 
body.....11
.
.
.
14 