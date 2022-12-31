package code;

public class Point2D 
{
	private int x;
	private int y;
	
	
	public Point2D(int x,int y)
	 {
		 this.x=x;
		 this.y=y;
		 
	 }
	
	public String Show()
	{
		
		return "x: "+this.x+" y: "+this.y;
		
	}
	 public boolean isEqual(Point2D pt)
	 {
		 if(this.x == pt.x && this.y == pt.y)
		 return true;
		 else
			return false;
	 }
	public double CalDist(Point2D p2)
	{
		double dist = Math.sqrt((p2.y - this.y)*(p2.y - this.y) +(p2.x - this.x)*(p2.x - this.x));
		return dist;
	}
}
