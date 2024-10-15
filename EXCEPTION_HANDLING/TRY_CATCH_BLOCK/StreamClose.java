import java.io.*;
class StreamClose{
        public static void main( String[]args )throws IOException{
                BufferedReader br = new BufferedReader( new InputStreamReader( System.in)) ;
                String str = br.readLine() ;
                System.out.println( str ) ;
                br.close() ;
                String str1 = br.readLine() ;
                System.out.println( str1 ) ;
                System.out.println( "Snehal Gunjal" ) ;
        }
}
