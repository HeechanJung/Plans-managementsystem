
public class Planner {
	String yearplan;
	String Monthplan;
	String weekplan;
	String dailyplan;
	
	public Planner() {
		
	}
	
	public Planner(String yearplan,String Monthplan) {
		this.yearplan=yearplan;
		this.Monthplan=Monthplan;
	}
	
	public Planner(String yearplan,String Monthplan,String weekplan,String dailyplan) {
		this.yearplan=yearplan;
		this.Monthplan=Monthplan;
		this.weekplan=weekplan;
		this.dailyplan=dailyplan;
		
	}
	 
	

	public void printInfo() {
		System.out.println("yearplan:"+yearplan+"Monthplan"+Monthplan+"weekplan"+weekplan+"dailyplan"+dailyplan);
		
	}

	


	
}
