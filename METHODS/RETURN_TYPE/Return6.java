import java.io.*;
class Return6{
    int SumOfDigit( int x){
        int digit , sum = 0 ;
        while( x > 0 ){
        digit = x % 10 ;
        sum = sum + digit ;
        x = x / 10 ;
        }
        return sum ;
    }
    public static void main( String[]args ) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in );
        BufferedReader br = new BufferedReader( isr );
        int num1 = Integer.parseInt( br.readLine());
        Return6 obj = new Return6() ;
        int sum = obj.SumOfDigit( num1 );
        System.out.println( "Sum Of Digit is : " + sum );
    }
}