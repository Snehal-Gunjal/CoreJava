import java.io.*;
class AccountNotFoundException extends RuntimeException{
        AccountNotFoundException( String str ){
                super( str ) ;
        }
}
class InstagramAc{
        public static void main( String[]args ) throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                String []Id = new String[5] ;
                System.out.println( "Enter Id of Users:" ) ;
                for( int i = 0 ; i<Id.length ; i++ ){
                        Id[i] = br.readLine() ;
                }
                System.out.println( "Display Id:" ) ;
                for( int i = 0 ; i<Id.length ; i++ ){
                        System.out.println( Id[i] ) ;
                }
                System.out.println( "Enter Id Which do you want to find:" ) ;
                String data = br.readLine() ;
                for( int i = 0 ; i<Id.length ; i++ ){
                        int result = data.compareTo(Id[i]) ;
                        System.out.println( result ) ;
                        if( result !=0 ){
                              throw new AccountNotFoundException( "Id Not Found" ) ;
                        }
                }
        }
}
