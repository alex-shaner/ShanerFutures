public class Bar{
	//I actually saw that there was a java "Date" class and was going to use it, but it's deprecated
	public String Date;
	public String Time;
	public float Open;
	public float High;
	public float Low;
	public float Close;
	public int Up;
	public int Down;
	
	//constructor
	public Bar(String Date, String Time, float Open, float High, float Low, float Close, int Up, int Down) {
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


