package practice;

public class Triangle implements Shape{
	int width;
	int height;
	public Triangle(int i, int j) {
		this.width=i;
		this.height=j;
		
	}

	public void getArea() {
		
		int area=width*height/2;
		System.out.println("삼각형의 크기: "+area);
		
	}

	

	

	
	
	

}
