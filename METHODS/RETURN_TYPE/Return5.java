import java.io.*;
class Return5{
    int Greater( int x , int y ){
        if( x > y ){
            return x ;
        }
        else {
            return y ;
     }
    }
    public static void main( String[]args ) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in );
        BufferedReader br = new BufferedReader( isr );
        int num1 = Integer.parseInt( br.readLine());
        int num2 = Integer.parseInt( br.readLine());
        Return5 obj = new Return5() ;
        int ans = obj.Greater( num1 , num2 );
        System.out.println( "Greater Number is : " + ans );
    }
}