package practice;

public class Hunter {
	

	
	private static int hp=1000;
	
	private static int power=100;
	
	
	Hunter(int power){
		this.power=power;
	}
	
	public void attack() {
		hp=hp-power;
		System.out.println("hunter�� Monster��"+power+"�ǿ��� ���� �߽��ϴ�.");
		System.out.println("Monster ü����"+hp+"���ҽ��ϴ�");
	}
	
}

