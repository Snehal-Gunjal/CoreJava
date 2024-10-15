import java.io.*;
class Ex3{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		char[] arr = new char[size] ;
		System.out.println( "Enter a character:");
		for( int i=0 ; i<size ; i++ ){
			arr[i] = (char) br.read();
		}
		System.out.println("Display Index Where Vowel Is Found:" );
		for( int i=0 ; i<arr.length ; i++ ){
	    if( arr[i] =='a' || arr[i] == 'A' || arr[i]== 'e' || arr[i] =='E' || arr[i] == 'i' || arr[i]== 'I' ||arr[i]=='o' ||arr[i]=='O'||arr[i]=='U'||arr[i]=='u' ){
				System.out.println("Vowel Found at index: "+i);

			}
		}
		
	}
}
