import java.io.*;
class Multicatch1{
        public static void main( String[]args )throws IOException {
            InputStreamReader isr = new InputStreamReader( System.in) ;
            BufferedReader br = new BufferedReader(isr);
            int num = 0;
            try{
               num = Integer.parseInt( br.readLine()) ;
            }catch( IllegalArgumentException obj){
                   //child class
               System.out.println( "Plz Enter a Integer" ) ;
                num = Integer.parseInt( br.readLine()) ;
            }catch( Exception e ){
                  //parent class
                System.out.println( "Plz Enter a Integer" ) ;
                num = Integer.parseInt( br.readLine()) ;
            }
        }
}

