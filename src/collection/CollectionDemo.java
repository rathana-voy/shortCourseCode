package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> map =new TreeMap<String,Integer>(Collections.reverseOrder());
		map.put("A",12);
		map.put("G",1);
		map.put("E",14);
		map.put("J",2);
		map.put("B",5);

		System.out.println("=========original Map=============");
		for(Map.Entry<String, Integer> m:map.entrySet()){
			System.out.println(m.getKey()+"-> " +m.getValue());
		}
		
		map.remove("B");
		System.out.println("=========after remove=============");
		for(Map.Entry<String, Integer> m:map.entrySet()){
			System.out.println(m.getKey()+"-> " +m.getValue());
		}
	}
	
	/*class SortMap implements Comparator<Map.Entry<String, Integer>>{

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			if(o1.getValue()<o2.getValue())return 1;
			else if(o1.getValue()<o2.getValue()) return 0;
			else return -1;
		}
		
	}*/
}
