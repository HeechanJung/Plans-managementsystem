import java.util.*;

public class Fourweek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("T��H �� �ϳ��� �Է� �Ͻþ�: ");
        String user= input.nextLine();
        
        int pc=(int)(Math.random()*2);
        
        if(user.equals("H")) {
        	if(pc==0)
        	{
        		System.out.println("T�� ���Գ׿�.");
        		System.out.println("Ʋ�Ƚ��ϴ٤̤�");        	}
        
        else if (pc==1) {
        	System.out.println("H�� ���Գ׿�.");
        	System.out.println("�����Դϴ�^^");
        }
        }
        else if(user.equals("T")) {
        	
        	if (pc==0)
        	{
        		System.out.println("T�� ���Գ׿�.");
        		System.out.println("�����Դϴ�^^");
        		
        	}
        	else if (pc==1)
        	{
        		System.out.println("H�� ���Գ׿�.");
        		System.out.println("Ʋ�Ƚ��ϴ٤̤�");
        	}
        	
        }
        else 
        {
        	System.out.println("�߸� �Է��߽��ϴ�");
        }
	
	
        
        
        
        

       
        
		

	}

}
