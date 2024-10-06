package tasks_JATTask_6;

public class Circle {
	private int radius;
	private double circum;
	Circle()
	{
		
	}
	Circle(int radius){
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double getCircum() {
		this.circum = 2*radius*Math.PI;
		return circum;
	}
    public String toString() {
    	return "Circumference of the circle for radius "+radius+" :"+circum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(10);
		obj.getRadius();
		obj.getCircum();
        System.out.println(obj);
	}

}
