import java.util.Map;
import java.util.TreeMap;

public class testDate {

	public static void main(String[] args) {
		Date d1 = new Date(1, 10, 2009);
		Date d2 = new Date(2, 20, 2004);
		Date d3 = new Date(7, 26, 2005);
		Date d4 = new Date(5, 14, 2006);
		
		
	//PROBLEM #3
		TreeMap<Date, String> syllabus = new TreeMap(); // use compare to as basis
		syllabus.put(d1, "java");
		syllabus.put(d2, "python");
		syllabus.put(d3, "c++");
		syllabus.put(d4, "java Script");
		
		 for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + " does not fall in September 2001");
			}
			System.out.println(topic.getKey() + "," + topic.getValue());
		} 
	
	}
	
}	