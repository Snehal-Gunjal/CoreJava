import java.io.*;
class Access8{
    public static void main( String[]args )throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        long[] arr = new long[5];
        System.out.println( "Insert elements in a Long array : ");
        for( int i =0 ; i<5 ; i++ ){
            arr[i] =Long.parseLong( br.readLine());
            }
        System.out.println( "Display  Long array Elements : ");
        for( int i=0 ; i<5 ; i++ ){
            System.out.println( arr[i]);
        }
    }
}