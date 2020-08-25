package begginers;

public class Circle extends shape {
	double pi;
	int radius;
	
	Circle(double pi,int radius){
		this.pi=pi;
		this.radius=radius;
		
	}
	
	
	
	double area () {
		System.out.println(" Area for Circle");
		return pi*radius*radius;
		
	}

}
