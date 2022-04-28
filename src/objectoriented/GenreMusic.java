package objectoriented;

public class GenreMusic extends Music {
	public String genre;
	
	GenreMusic(String name,String song,String genre){
		super(name,song);
		this.genre=genre;
		}
	
	public void getgenre(String genre) {
		this.genre=genre;
		
	}
	
	
	public void printPLaydata() {
		super.printPLaydata();
		System.out.println(this.name+"ÀÇ"+this.song+"("+this.genre+")");
	}

}
