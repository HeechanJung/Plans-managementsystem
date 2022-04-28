package objectoriented;

public class Musictester {

	public static void main(String[] args) {
		Music m1=new GenreMusic("베토벤","운명","교향곡");
		Music m2=new GenreMusic("헨델","메시아","오라토리오");
		Music m3=new GenreMusic("비발디","사계","협주곡");
		
		Music[] a= {m1,m2,m3};
		System.out.println("--플레이 리스트--");
		
		for(int i=0;i<a.length;i++) {
			a[i].printPLaydata();
		}
		

	}

}
