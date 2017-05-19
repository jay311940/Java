package Ex6Classes;
import java.util.regex.*;
public class Regex {
	
	public static void main(String[] args){
		
		String longString = "Jamie O Brien D18 tnj4prez@gmail.com 0877777775";
		String strangeString = "$$$$%%^^&&**** ** $$ ^^";
		
		regexChar("[A-Za-z0-9]{2,20}", longString);
		regexChar("\\$%&*[A_Za-z]{2,20}\\s", strangeString);
		
	}
	public static void regexChar(String theRegex, String str2Check){
		
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() !=0){
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index "+regexMatcher.start());
			
		}
	}
}
