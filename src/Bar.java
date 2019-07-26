public class Bar{
	//I actually saw that there was a java "Date" class and was going to use it, but it's deprecated
	public String Date;
	public String Time;
	public Float Open;
	public Float High;
	public Float Low;
	public Float Close;
	public Integer Up;
	public Integer Down;
	
	//constructor
	public Bar(Object Date, Object Time, Object Open, Object High, Object Low, Object Close, Object Up, Object Down) {
		this.Date = Date.toString();
		this.Time = Time.toString();
		this.Open = Float.parseFloat(Open.toString());
		this.High = Float.parseFloat(High.toString());
		this.Low = Float.parseFloat(Low.toString());
		this.Close = Float.parseFloat(Close.toString());
		this.Up = Integer.parseInt(Up.toString());
		this.Down = Integer.parseInt(Down.toString());
	}
	
	//get methods
	public String getDate() {
		return Date;
	}
	public String getTime() {
		return Time;
	}
	public float getOpen(){
		return Open;
	}
	public float getHigh() {
		return High;
	}
	public float getLow(){
		return Low;
	}
	public float getClose() {
		return Close;
	}
	public int getUp() {
		return Up;
	}
	public int getDown() {
		return Down;
	}
}


