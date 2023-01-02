import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnStream {
	public static void main(String args[]) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		System.out.println("List: " +strings);
		long count = getCountEmptyStringUsingJava7(strings);
		count = strings.stream().filter(string->string.isEmpty()).count();
	    System.out.println("Empty Strings: " + count);
	    List<String> filtered = deleteEmptyStringsUsingJava7(strings);
	    filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
	}


private static int getCountEmptyStringUsingJava7(List<String> strings) {
    int count = 0;

    for(String string: strings) {
		
       if(string.isEmpty()) {
          count++;
       }
    }
    return count;
 }



private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
    List<String> filteredList = new ArrayList<String>();
		
    for(String string: strings) {
		
       if(!string.isEmpty()) {
           filteredList.add(string);
       }
    }
    return filteredList;
 }
}
