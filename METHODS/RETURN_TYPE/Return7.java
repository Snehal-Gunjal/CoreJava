import java.io.*;
class Return7{
    int Reverse( int x){
        int digit , rev= 0 ;
        while( x > 0 ){
        digit = x % 10 ;
        rev= rev*10 + digit ;
        x = x / 10 ;
        }
        return rev;
    }
    public static void main( String[]args ) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in );
        BufferedReader br = new BufferedReader( isr );
        System.out.println("Enter a number :");
        int num1 = Integer.parseInt( br.readLine());
        Return7 obj = new Return7() ;
        int rev= obj.Reverse( num1 );
        System.out.println( "Reverse of a number is  : " + rev);
    }
}