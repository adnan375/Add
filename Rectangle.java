package begginers;

public class Rectangle extends shape {
	double length,width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
		
	}
	
	
	
	double area() {
		System.out.println(" Area for Rectangle");
		return length*width;
		
	}
	

}
