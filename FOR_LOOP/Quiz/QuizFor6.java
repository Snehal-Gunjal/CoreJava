class QuizFor6{
	public static void main( String[]args){
		for( int var1 = 10 ; System.out.println( var1 ) ; var1++ ){
			if( var1 == 12 ){
				System.out.println( var1 );
			}
		}
	}
}
/*
error: Incompatible types :  void cannot be converted to booleans 
In the for loop , the conditional statement must be a boolean value 

Here , Return type of SOP function is void so it will not convert into booleans*/