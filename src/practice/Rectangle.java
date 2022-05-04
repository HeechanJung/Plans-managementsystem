package practice;

public class Rectangle implements Shape  {
	int width;
	int height;
	public Rectangle(int i, int j) {
		this.width=i;
		this.height=j;
		
	}
	public void getArea() {
	
		int area=width*height;
		System.out.println("사각형의 크기: "+area);
		System.out.println("사각형의 크기: "+area);
	}

	
	
	

}
