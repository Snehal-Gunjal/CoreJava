
import java.io.*;
class Input1{
        public static void main( String[]args)throws IOException {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
                int x = 0;  
                try{
					x = Integer.parseInt(br.readLine());
                       
                                throw new NumberFormatException( "Wrong data included" ) ;
								
                }catch( NumberFormatException np ){
                        System.out.println( np ) ;
						System.out.println( np.toString()) ;
						System.out.println( np.getMessage()) ;
						System.out.println( Thread.CurrentThread().getMessage()) ;
					

                }
        }
}                                                                                                                                                     