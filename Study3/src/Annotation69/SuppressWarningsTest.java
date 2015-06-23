package Annotation69;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
/**
 * Ñ¹ÖÆ¾¯¸æ
 * @author Trasen
 *
 */
public class SuppressWarningsTest {
	
	@SuppressWarnings({"unchecked", "deprecation"})
	public static void main(String[] args) {
		Map map = new TreeMap();
		
		map.put("hello", new Date());
		
		System.out.println(map.get("hello"));
		
		Date date = new Date();
		
		System.out.println(date.toLocaleString());
	}
}
