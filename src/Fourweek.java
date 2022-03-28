import java.util.*;

public class Fourweek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("T와H 중 하나를 입력 하시어: ");
        String user= input.nextLine();
        
        int pc=(int)(Math.random()*2);
        
        if(user.equals("H")) {
        	if(pc==0)
        	{
        		System.out.println("T가 나왔네요.");
        		System.out.println("틀렸습니다ㅜㅜ");        	}
        
        else if (pc==1) {
        	System.out.println("H가 나왔네요.");
        	System.out.println("정답입니다^^");
        }
        }
        else if(user.equals("T")) {
        	
        	if (pc==0)
        	{
        		System.out.println("T가 나왔네요.");
        		System.out.println("정답입니다^^");
        		
        	}
        	else if (pc==1)
        	{
        		System.out.println("H가 나왔네요.");
        		System.out.println("틀렸습니다ㅜㅜ");
        	}
        	
        }
        else 
        {
        	System.out.println("잘못 입력했습니다");
        }
	
	
        
        
        
        

       
        
		

	}

}
