package objectoriented;

public class Musictester {

	public static void main(String[] args) {
		Music m1=new GenreMusic("���亥","���","�����");
		Music m2=new GenreMusic("�","�޽þ�","�����丮��");
		Music m3=new GenreMusic("��ߵ�","���","���ְ�");
		
		Music[] a= {m1,m2,m3};
		System.out.println("--�÷��� ����Ʈ--");
		
		for(int i=0;i<a.length;i++) {
			a[i].printPLaydata();
		}
		

	}

}
