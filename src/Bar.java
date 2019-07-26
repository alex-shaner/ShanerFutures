public class Bar{
	//I actually saw that there was a java "Date" class and was going to use it, but it's deprecated
	public Object Date;
	public Object Time;
	public Object Open;
	public Object High;
	public Object Low;
	public Object Close;
	public Object Up;
	public Object Down;
	
	//constructor
	public Bar(Object Date, Object Time, Object Open, Object High, Object Low, Object Close, Object Up, Object Down) {
		this.Date = Date;
		this.Time = Time;
		this.Open = Open;
		this.High = High;
		this.Low = Low;
		this.Close = Close;
		this.Up = Up;
		this.Down = Down;
	}
	
	//get methods
	public String getDate() {
		return Date.toString();
	}
	public String getTime() {
		return Time.toString();
	}
	public float getOpen(){
		//this feels dirty
		return Float.parseFloat(Open.toString());
	}
	public float getHigh() {
		return Float.parseFloat(High.toString());
	}
	public float getLow(){
		return Float.parseFloat(Low.toString());
	}
	public float getClose() {
		return Float.parseFloat(Close.toString());
	}
	public int getUp() {
		return Integer.parseInt(Up.toString());
	}
	public int getDown() {
		return Integer.parseInt(Down.toString());
	}
}


