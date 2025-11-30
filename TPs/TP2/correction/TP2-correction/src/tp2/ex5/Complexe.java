package tp2.ex5;

public class Complexe {
	
	private double pReal;
	private double pImg;
	
	public Complexe()
	{
		this.pReal = 0.0;
		this.pImg = 0.0;
	}
	
	public Complexe(double pReal, double pImg)
	{
		this.pReal = pReal;
		this.pImg = pImg;
	}

	public double getA()
	{
		return this.pReal;
	}
	
	public void setA(double a)
	{
		this.pReal = a;
	}
	
	public double getB()
	{
		return this.pImg;
	}
	
	public void setB(double b)
	{
		this.pImg = b;
	}
	
	public Complexe add(Complexe complexe)
	{
		return new Complexe(this.pReal + complexe.pReal, this.pImg + complexe.pImg);
	}
	
	public Complexe mul(Complexe c)
	{
		/**
		 * Z1 = a x ib, Z2 = c x id
		 * 
		 * a x c        a x id
		 * ib x c       ib x id = b x d x i^2 = -bd
		 * 
		 * 
		 * Z1 * Z2 = (ac - bd) + i(ad + bc)
		 * 
		 * real = a*c - b*d;
		 * imag = a*d + b*c;
		 * 
		 */
		double real = this.pReal * c.pReal - this.pImg * c.pImg;
		double imaginaire = this.pReal * c.pImg + this.pImg * c.pReal;
		
		return new Complexe(real, imaginaire);
	}
	
	public String toString()
	{
		return "(" + this.pReal + "+ i" + this.pImg + ")";
	}
}
