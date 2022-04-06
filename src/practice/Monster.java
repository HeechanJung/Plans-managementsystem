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
		System.out.println("hunter가 Monster을"+power+"피워로 공격 했습니다.");
		System.out.println("Monster 체력이"+hp+"남았습니다");
	}
	
	
	private void MonsterPrint() {
		// TODO Auto-generated method stub
		
	}


}
