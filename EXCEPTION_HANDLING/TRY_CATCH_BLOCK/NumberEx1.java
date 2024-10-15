import java.io.*;
class Ari{
        public static void main( String[]args )throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader( System.in)) ;
                String str1 = null;
				
                try{
                str1 = br.readLine() ;
                }catch(NumberFormatException obj ){
                        System.out.println( "Plz Enter a String" ) ;
                        str1 = br.readLine() ;
                        System.out.println( str1 ) ;
                }
                 System.out.println( str1 ) ;
                int num = 0;
				
                try{
                  num = Integer.parseInt( br.readLine()) ;
                }catch( NumberFormatException obj1 ){
                        System.out.println( "Plz Enter a Integer" ) ;
                        num = Integer.parseInt( br.readLine()) ;
                        System.out.println( num ) ;
                }
                System.out.println( num ) ;
        }
}

