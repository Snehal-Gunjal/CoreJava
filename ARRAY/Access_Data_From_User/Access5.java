import java.io.*;
class Array{
    public static void main( String[]args )throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        Boolean[] arr = new Boolean[10];
		
        System.out.println( "Insert elements in a boolen array : ");
        for( int i =0 ; i<10 ; i++ ){
            arr[i] = Boolean .parseBoolean (br.readLine() );
        }
		
        System.out.println( "Display Boolean array Elements : ");
        for( int i=0 ; i<10 ; i++ ){
            System.out.println( arr[i]);
        }
    }
}
