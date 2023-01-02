import java.util.ArrayList;

import org.testng.annotations.Test;

public class Stream {
	
	@Test
	public void regular(){
		ArrayList<String> names=new ArrayList<String>();
		names.add("Karan");
		names.add("Seema");
		names.add("Verma");
		names.add("sonam");
		names.add("Kareena");
		int COUNT=0;
		
		
		for(int i=0;i<names.size();i++) {
			String store=names.get(i);
			if(store.startsWith("K")) {
				COUNT++;
			}
		}
		System.out.println("The number of letters starts with K is : "+ COUNT);
	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
		

	}


