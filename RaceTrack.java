//Problem 1 : Accelerate the Car (20 Marks)

class RaceTrack{
	
	public static void main(String[] args){
		Car c1 = new Car(2018,"Mahindra XUV300",15.0);
		Car c1 = new Car(2020,"Mahindra XUV500",13.0);
		Car c1 = new Car(2022,"Mahindra XUV700",10.0);
		
		System.out.println(c1.getYear()+" "+c1.getSpeed()+" "+c1.getMake());
		System.out.println(c2.getYear()+" "+c2.getSpeed()+" "+c2.getMake());
		System.out.println(c3.getYear()+" "+c3.getSpeed()+" "+c3.getMake());

		c1.Accelerate();
		c2.Accelerate();
		c3.Accelerate();

		System.out.println(c1.getSpeed());
		System.out.println(c2.getSpeed());
		System.out.println(c3.getSpeed());
	}
}