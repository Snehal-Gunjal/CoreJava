import java.io.*;
class Access6{
    public static void main( String[]args )throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        char[] arr = new char[5];
		
        System.out.println( "Insert elements in a char array : ");
        for( int i =0 ; i<5 ; i++ ){
            String str  = br.readLine();
            if( str.length() == 1 ){
                arr[i] = str.charAt(0);
            }
        }
		
        System.out.println( "Display char array Elements : ");
        for( int i=0 ; i<5 ; i++ ){
            System.out.println( arr[i]);
        }
    }
}
/*

The length() function is a method in the String class that returns the number of character in a string .
It is useful for determining size of String , such as validating input length or iterating over character in the String ;

Example 

String str = "Hello World ";
int length = str.lenght() ;    //str.length = return the number of charcaters in a string ( also include space );
System.out.println( "Length of String is " + length );

charAt( int index ) Function is a method in the String class that returns the character at a specific index ;
example:
char fifthchar = str.charAt(4);

*/