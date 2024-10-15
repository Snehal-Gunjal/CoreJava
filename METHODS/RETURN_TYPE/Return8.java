import java.io.*;
class Return8{
    int Reverse( int x){
        int num = x;
        int flag = 0 ;
        int digit , rev= 0 ;
        while( x > 0 ){
        digit = x % 10 ;
        rev= rev*10 + digit ;
        x = x / 10 ;
        }
        if( num == rev ){
            return flag + 1 ;
        }
        else{
            return flag ;
        }
    }
    public static void main( String[]args ) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in );
        BufferedReader br = new BufferedReader( isr );
        System.out.println("Enter a number :");
        int num1 = Integer.parseInt( br.readLine());
        Return8 obj = new Return8() ;
        int rev= obj.Reverse( num1 );
        if( rev==1 ){
            System.out.println("The Number is palindrome ");
        }
        else{
            System.out.println( "The number is not a Palindrome Number ");
        }
     
    }
}