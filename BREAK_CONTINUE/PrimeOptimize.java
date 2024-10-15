class PrimeOptimize{
    public static void main( String[]args ){
        int n = 3;
        int count = 0 ;
        for( int i=2 ; i<=n-1 ; i++){
            if( n % i == 0){
                count++ ;
            }
            if( count > 0){
                break;
            }
        }
        if( count==0){
            System.out.println( "Prime Number");
        }
        else
        {
          System.out.println( " Not a Prime Number");  
        }
      }
}
