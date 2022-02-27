import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
	Pattern pattern = Pattern.compile("(?:(?!for|while|if)(^.s*\\w+)(\\(((\\.*s*\\w+\\s*\\:\\s*\\w+.*\\s*\\,*\\s*){1,}|\\((\\s*\\w+\\:[\\s*\\w+,<>\\(\\)\\[\\]@\\\"_?.]){1,})*\\)))");
	Matcher matcher = pattern.matcher("displayTable(a:string()) : void{");
	boolean matchFound = matcher.find();
	if(matchFound) {
	System.out.println("Match found");
	} else {
	System.out.println("Match not found");
	}
	}
	

}
