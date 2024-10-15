import java.io.*;
class Return9{
    void Prime( int x ){
        int flag = 0 ;
        for( int i=2 ; i<x ; i++ ){
            if( x % i ==0 ){
            flag = 1 ;
            break;
            }
        }
        if( flag == 1 ){
            System.out.println( " The Number is Not a Prime number ");
        }
        else{
            System.out.println("the number is a Prime number ");
        }
    }
  
    public static void main( String[]args ) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in );
        BufferedReader br = new BufferedReader( isr );
        System.out.println("Enter a number :");
        int num1 = Integer.parseInt( br.readLine());
        Return9 obj = new Return9() ;
        obj.Prime( num1 );   
     
    }
}