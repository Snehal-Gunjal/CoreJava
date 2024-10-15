import java.io.*;
class ArrayEx{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		System.out.println("Enter array size :");
		int size = Integer.parseInt( br.readLine() );
		int[] arr = new int[size];
		System.out.println( "Insert Elements in array:" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine() );
		}
		System.out.println( "Display Array Elements:");
		for( int i=0 ; i<arr.length ; i++){
			System.out.println( arr[i] );
		}
	}
}
/*
D:\Programs\Java\ARRAY\Exercise1>javac ArrayEx.java

D:\Programs\Java\ARRAY\Exercise1>java ArrayEx
Enter array size :
10
Insert Elements in array:
10
20
30
40
50
60
70
80
90
100
Display Array Elements:
10
20
30
40
50
60
70
80
90
100
*/