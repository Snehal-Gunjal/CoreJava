import java.io.*;
class Array{
    public static void main( String[]args )throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        int[] arr = new int[10];

        System.out.println( "Insert elements in array : ");
        for( int i=0 ; i<10 ; i++){
            arr[i]= Integer.parseInt( br.readLine()) ;
        }

        System.out.println( "Display only even  elements : ");
         for( int i=0 ; i<10 ; i++){
            if( arr[i] % 2 == 0 ){
               System.out.println( "Even : " + arr[i]);
            }
            else{
                System.out.println( "Odd: " + arr[i]);
            }
        }

    }
}