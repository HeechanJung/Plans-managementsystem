package objectoriented;

public class Music {
	String name;
	String song;
	
	Music(String name,String song){
		this.name=name;
		this.song=song;
	}
	
	Music(){
		System.out.println("--�÷��� ����Ʈ--");
	}
	
	public void getName(String name) {
		this.name=name;
		
	}
	
	public void getSong(String song) {
		this.song=song;
	}
	
	public void printPLaydata() {
		System.out.println(this.name+"��"+this.song);
	}
	
	
	
	

}
