package practice;

public class Monster {
	private  int hp=1000;
	private int power=100;

	Hunter ht=new Hunter(hp);
	
	
	Monster(){
		this.hp=hp;
	}
	
	public int getHp() {
		return this.hp;
		
	}
	
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	
	public void printInfo() {
		System.out.println("hunter�� Monster��"+power+"�ǿ��� ���� �߽��ϴ�.");
		System.out.println("Monster ü����"+hp+"���ҽ��ϴ�");
	}
	
	
	private void MonsterPrint() {
		// TODO Auto-generated method stub
		
	}


}
