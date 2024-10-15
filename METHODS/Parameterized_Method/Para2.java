import java.io.*;
class Para2{
    static void add( int a , int b ) {
        int c = a + b ;
        System.out.println( "Addition is = " + c );
    }
    static void Sub( int a , int b ){
        int c = a - b ;
        System.out.println( "Substraction is = " + c );
    }
    static void Multi( int a , int b ){
        int c = a * b ;
        System.out.println( "Multiplication is = "+ c );
    }
    static void Div( int a , int b ){
        int c = a / b ;
        System.out.println( " Division is = "+ c );
    }
    public static void main( String[]args)throws IOException{
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        int num1 = Integer.parseInt( br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        add( num1 , num2 );
        Sub( num1 , num2 );
        Multi( num1 , num2 );
        Div( num1 , num2 );

    }
    
}




