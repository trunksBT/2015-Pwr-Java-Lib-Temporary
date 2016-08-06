package bt.collections.elems;

public class Student extends Player{

	public Student(String surname, double averageRate) {
		super(surname, averageRate);
	}
	
	public double getAverageRate()
	{
		return super.getPoints();
	}
}
