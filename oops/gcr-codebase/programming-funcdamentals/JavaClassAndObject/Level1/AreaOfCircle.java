class Circle{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	void area(){
		System.out.println(3.14*radius*radius);
	}
}
public class AreaOfCircle{
		public static void main(String args[]){
			Circle c = new Circle(3);
			c.area();
		}
}