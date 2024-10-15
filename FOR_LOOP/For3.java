class  For3{
	public static void main( String[]args ){
		int n = 6 ;
		for(int i = 1 ; i<=n ; i++ ){
			if( i % 2 != 0 ){
				System.out.println( i ) ;
			}
		}
	}
}
/*
Other Approach :
i=i+2( condition ) ;

DRY RUN :
i=1 ; 1<=6 yes 
if( 1 % 2 !=0 yes )
	SOP 1 ;

i=2 ; 2<=6 yes 
if( 2 % 2 != 0 No )
	
i++ ;
i=3 ; 3<=6 yes 
if( 3 % 2 !=0 yes )
	SOP 3 ;
i++;
i=4 ; 4<=6 yes 
if( 4 % 2 !=0 no )

i++ ;
i=5 ; 5<=6 yes 
if( 5 % 2 !=0 yes )
	SOP 5 
i++ ;
i=6 ; 6<=6 yes 
6%2 != 0 no 
STOP 

o/p 
1
3
5

*/