import java.io.*;
class Para1{
    static void add( int a , int b ) {
        int c = a + b ;
        System.out.println( c );
    }
    public static void main( String[]args)throws IOException{
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        int num1 = Integer.parseInt( br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        add( num1 , num2 );
    }
    
}