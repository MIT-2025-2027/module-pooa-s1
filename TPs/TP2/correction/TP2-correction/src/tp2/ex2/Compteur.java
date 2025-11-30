package tp2.ex2;

public class Compteur {
	
	private Integer value;
	
	public Compteur()
	{
		this.value = 0;
	}
	
	public void raz()
	{
		this.value = 0;
	}
	
	public void up()
	{
		this.value++;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return "" + this.value.toString();
	}
}
