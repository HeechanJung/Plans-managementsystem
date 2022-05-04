package practice;

public class Circle implements Shape {
	int radius;
	public Circle(int i) {
		this.radius=i;
		
	}

	public void getArea() {
		
		
		
		double pi=3.14;
		double area=radius*radius*pi;
		System.out.println("원의 크기: "+area);
		
	}

	

}
