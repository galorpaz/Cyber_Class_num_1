
public class ClassCode {
	
	public static void main(String[] args) {
		//
		int [] instagramLikes;
		instagramLikes = new int [] {3, 5, 50, 8};
		
		int popular = findPopularInInstagram(instagramLikes);
	    System.out.println("most popular user is: "+ popular);
	    char [] cArr1 = new char[] {'H','i'};
	    char [] cArr2 = new char[] {'S','w','e','e','t','y'};
	    System.out.println(concat(cArr1, cArr2));
	    
		//printrectangle(50,100);
	
	}
	public static int findPopularInInstagram(int [] instagramLikes) {
	    int max_likes = instagramLikes[0];
		int index_of_popular = 0;
		for (int i=1; i<4; i++) {
		    if (instagramLikes[i] > max_likes){
		        max_likes = instagramLikes[i];
		        index_of_popular = i;
		    }
		}
		return index_of_popular;
	}
	
	public static int Exceptions() {
	    int number1 = 589;
	    int number2 = 785246;
	    int number3 = Integer.MAX_VALUE;
	    return number1+number3;
	}
	
	public static void StringsAndChars() {
	    char c = 'g';
	    char [] cArr = new char [] {c,c};
	    String s1 = "Taninanai";
	    String s2 = new String (cArr);
	    System.out.println(s1.charAt(4));
	    System.out.println(s2);
	    
	}
	
	public static String concat(char [] str1, char [] str2) {
	    int stringLenght =  str1.length + str2.length;
	    char [] concatChar = new char[stringLenght+1];
	    int i;
	    for (i=0; i<str1.length; i++) {
	        concatChar[i] = str1[i];
	    }
	    concatChar[i] = ' ';
	    i++;
	    for (int j=0; j<str2.length; j++) {
	    
	        concatChar[i+j] = str2[j];
	    }
	    String s = new String (concatChar);
	    return s;
	}
}
