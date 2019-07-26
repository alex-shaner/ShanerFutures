import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShanerFutures {
	public static void main(String[] args)  throws IOException{
		File file = new File("C:\\Users\\Owner\\eclipse-workspace\\ShanerFutures\\atES.txt");
		List<Bar> barList = GetBars(file);
	}
	
	public static List<Bar> GetBars(File file)  throws IOException{
		//a function to create a list of Bars from the text file
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		List<Bar> barList = new ArrayList<Bar>();
		
		//the Josh bool allows us to skip the first line of the txt file by iterating past it
		Boolean Josh = false;
		
		while ((st = br.readLine()) != null) { 
			if (Josh == true) {
				barList.add(makeBar(st));
			}
			else {
				Josh = true;
			}
			
		}
		
		br.close();
		return barList;
		
	}
	public static Bar makeBar(String st) {
		//a function to create a new Bar object given a line from the data file
		List<String> barStrings = Arrays.asList(st.split(","));
		List<Object> barVars = new ArrayList<Object>();
		for(int index = 0; index < barStrings.size(); index++) {
			if(index < 2) {
				barVars.add(barStrings.get(index));
			}
			else if(index < 6) {
				float f = Float.parseFloat(barStrings.get(index));
				barVars.add(f);
			}
			else{
				int i = Integer.parseInt(barStrings.get(index));
				barVars.add(i);
			}
			
			
		}
		
		
		//Bar newBar = new Bar(Date, Time, Open, High, Low, Close, Up, Down);
		Bar newBar = new Bar(barVars.get(0), barVars.get(1), barVars.get(2), barVars.get(3), barVars.get(4), barVars.get(5), barVars.get(6), barVars.get(7));
		System.out.println(newBar.getDown());
		return newBar;
	}
}
