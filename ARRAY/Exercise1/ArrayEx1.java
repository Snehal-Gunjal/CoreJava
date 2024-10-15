import java.io.*;
class ArrayEx1{
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
		System.out.println( "Display Even Array Elements:");
		for( int i=0 ; i<arr.length ; i++){
			if( arr[i] %2 == 0 ){
			System.out.println( arr[i] );
			}
		}
	}
}
/*
D:\Programs\Java\ARRAY\Exercise1>javac ArrayEx1.java

D:\Programs\Java\ARRAY\Exercise1>java ArrayEx1
Enter array size :
10
Insert Elements in array:
10
11
12
13
14
15
16
17
18
19
Display Even Array Elements:
10
12
14
16
18
*/