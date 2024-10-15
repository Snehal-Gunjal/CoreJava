class ArmImp{
	public static void main( String[]args){
		int N  = 351 ;
		int sum =0 ;
		int temp1 = N ;
		int temp2 = N ;
		int count = 0 ; 
		while( temp1 >0 ){              //count find.                 
			count++ ;                      
			temp1 = temp1 / 10 ;            
		}
		 while( N !=0 ){            // digit multiplication         
			 int rem = N % 10 ;     
			 int multi = 1 ;      
			 for( int i=1 ; i<=count ;i++ ){  
				 multi = multi * rem ;      
				 
			 }
			 sum = sum + multi ;   
			 N = N / 10 ;         
		 }
		 if( temp2 == sum ){   //sum check with original number 
			 System.out.println( "Armstrong") ;
		 }
		 else
		 {
			 System.out.println( "Not Armstrong" ) ;
		 }
	}
}
		 
		 
			