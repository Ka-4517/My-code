import java.util.ArrayList;

import org.testng.annotations.Test;

public class OptimizeSream {
	
	@Test
	public void regular(){
		ArrayList<String> names=new ArrayList<String>();
		names.add("Karan");
		names.add("Seema");
		names.add("Verma");
		names.add("sonam");
		names.add("Kareena");
       // int count=0;
        
		Long c=names.stream().filter(s->
		
		{
			s.startsWith("K");
			return true;
		}).count();
		
       // Long c=names.stream().filter(s->s.startsWith("h")).count();
		System.out.println("The number of letters starts with K is : "+ c);
	}
}

//long c=	Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
//{
//	s.startsWith("A");
//    return true;
//}).count();
//System.out.println(c);


