package practice;

public class Rectangle implements Shape  {//부모 클래스 Shape를 인터페이스 선언을 하여 extends 대신 implements 사용
	int width;
	int height;
	public Rectangle(int i, int j) {//width와 height가 각각 parameter 안에 있는 i,j임을 정의한다.
		this.width=i;
		this.height=j;
		
	}
	public void getArea() {
	
		int area=width*height;//사각형의 넓이
		
		System.out.println("사각형의 크기: "+area);
	}

	
	
	

}
