
import java.io.*;
class NumFormat{

        void getData()throws IOException {
                InputStreamReader isr = new InputStreamReader(System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                int data = Integer.parseInt( br.readLine()) ;
                System.out.println( data );
        }
        public static void main( String[]args )throws IOException{
                NumFormat obj = new NumFormat() ;
                obj.getData() ;
        }
}

