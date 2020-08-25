package begginers;

public class Sphere extends shape {
	double pi;
	int radius;
	
	Sphere(double pi,int radius){
		this.pi=pi;
		this.radius=radius;
		
	}
	
	
	
	double area() {
		System.out.println(" Area for Sphere");
		return 4*pi*(radius*radius);
		
	}

}
