import java.io.* ;
class MultipleCatch{
        public static void main( String[]args )throws IOException {
            InputStreamReader isr = new InputStreamReader( System.in) ;
            BufferedReader br = new BufferedReader(isr);
            int num = 0;
            try{
               num = Integer.parseInt( br.readLine()) ;
            }catch( IllegalArgumentException obj){
                   //parent class
               System.out.println( "Plz Enter a Integer" ) ;
                num = Integer.parseInt( br.readLine()) ;
            }catch( NumberFormatException obj1 ){
                    //child class
               System.out.println( "Plz Enter a Integer" ) ;
                num = Integer.parseInt( br.readLine()) ;
            }
        }
}
