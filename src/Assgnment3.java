import java.util.HashSet;
public class Assgnment3 {

	public static void main(String[] args) {
		
		//HashSet<String> values = new HashSet<String>();
		String poem ="Flower 2 "
				+"When I know your name,"
				+"you become a neightbor."
				+"When I know your colors,"
				+" you become friends."
				+"Once I Know your shape,"
				+"you become a lover"
				+"Ah, this is a secret";
		String[] words=poem.split(" ");
		
		System.out.println(poem.length());
		System.out.println(poem.toLowerCase());
		
		HashSet<String> values = new HashSet<String>();
		values.add ("Flower 2 ");
		values.add("When I know your name,");
		values.add("you become a neightbor.");
		values.add("When I know your colors,");
		values.add(" you become friends.");
		values.add("Once I Know your shape,");
		values.add("you become a lover");
		values.add("Ah, this is a secret");
	
		
	   for (String val:values) {
		   System.out.println(val);
	   }


			
		}
		

	}


