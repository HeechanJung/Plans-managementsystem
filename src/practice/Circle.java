package practice;

public class Circle implements Shape {//부모 클래스 Shape를 인터페이스 선언을 하여 extends 대신 implements 사용
	int radius;
	public Circle(int i) {
		this.radius=i;//원의 반지름 radius가 i임을 선언해야 main 함수에서 올바르게 출력된다.
		
	}

	public void getArea() {
		
		
		
		double pi=3.14;
		double area=radius*radius*pi;//원의 넓이=(pi)*r^2
		System.out.println("원의 크기: "+area);
		
	}

	

}
