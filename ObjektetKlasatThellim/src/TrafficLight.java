//Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
//the duration of the light.Write a program to test the TrafficLight enum so that it displays the
//enum constants and their durations.

public enum TrafficLight {
	
	RED(20),
	GREEN(35),
	YELLOW(15);
	
	private final int kohezgjatjaSek;
	
	TrafficLight(int sek)
	{
		this.kohezgjatjaSek=sek;
	}
	
	
	public int gjejKohezgjatje()
	{
		return kohezgjatjaSek;
	}

}
