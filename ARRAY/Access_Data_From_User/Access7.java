import java.io.*;
class Access7{
    public static void main( String[]args )throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String[] arr = new String[5];
        System.out.println( "Insert elements in a String array : ");
        for( int i =0 ; i<5 ; i++ ){
            arr[i] = br.readLine();
            }
        System.out.println( "Display String array Elements : ");
        for( int i=0 ; i<5 ; i++ ){
            System.out.println( arr[i]);
        }
    }
}