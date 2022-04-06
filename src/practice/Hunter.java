package practice;

public class Hunter {
	

	
	private static int hp=1000;
	
	private static int power=100;
	
	
	Hunter(int power){
		this.power=power;
	}
	
	public void attack() {
		hp=hp-power;
		System.out.println("hunter가 Monster을"+power+"피워로 공격 했습니다.");
		System.out.println("Monster 체력이"+hp+"남았습니다");
	}
	
}

