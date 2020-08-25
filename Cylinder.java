package begginers;

public class Cylinder extends shape {
	
	double pi,height;
	int radius;
	Cylinder(double pi,double height,int radius){
		this.pi=pi;
		this.height=height;
		this.radius=radius;
		
		
	}
	
	
	
	
	double area() {
		System.out.println(" Area for Cylinder");
		return (22*radius*(radius+height))/7;
		
	}

}
