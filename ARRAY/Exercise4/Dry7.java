import java.io.*;
class Dry7{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		char ch[][] = new char[2][2] ;
		System.out.println( "Insert Array Elements :" );
		for( int i=0 ; i<ch.length ; i++ ){
			for( int j=0 ; j<ch[i].length ; j++ ){
				ch[i][j] = ( char ) br.read() ;
				br.skip( 2 );
			}
		}
		System.out.println( "Display Vowels and consonants separately:");
		int vowel=0 , con=0 ;
		for( int i=0 ; i<ch.length ; i++ ){
			for( int j=0 ; j<ch[i].length ; j++ ){
				if( ch[i][j] =='a'||ch[i][j] =='A'||ch[i][j] =='e'||ch[i][j] =='E'||ch[i][j] =='i'||ch[i][j] =='I'||ch[i][j] =='o'||ch[i][j] =='O'||ch[i][j] =='u'||ch[i][j] =='U'){
					vowel++ ;
			}
			else
				con++ ;
		    }
		}
		System.out.println( "Count Of Vowel is : " + vowel );
		System.out.println( "Count of Consonants is :" + con );
	}
}
