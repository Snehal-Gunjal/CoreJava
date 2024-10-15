import java.io.*;
class Input4{
    public static void main( String[]args )throws IOException{
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        char[] ch[] = new char[3][3] ;
        System.out.println("Insert Array Elements : ");
        for( int i=0 ; i<ch.length ; i++ ){
            for( int j=0 ;j<ch[i].length; j++){
                ch[i][j] = ( char )br.read() ;
                br.readLine(); 
                
            }
        }
        System.out.println( "Display Array Elements : ");
        for( int i=0 ; i<ch.length ; i++ ){
            for( int j=0 ;j<ch[i].length; j++){
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}

		
	