package begginers;

public class Address {
	public static void main(String[]args) {
		shape s = new shape();
		Rectangle r= new Rectangle(15,30);
		Triangle t= new Triangle(20,25);
		Circle c= new Circle(3.1416,5);
		Cylinder y= new Cylinder(3.1416,10,5);
		Sphere p=new Sphere(3.1416,5);
		
		
		System.out.println(s.area());
		System.out.println(r.area());
		System.out.println(t.area());
		System.out.println(c.area());
		System.out.println(y.area());
		System.out.println(p.area());
				
		
		
		
		
		
	}
	

}
