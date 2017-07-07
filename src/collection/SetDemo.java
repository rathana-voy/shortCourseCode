package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import inheritance.Car;

public class SetDemo {

	public static void main(String[] args) {
		
		/*Set hashSet=new HashSet<>();
		hashSet.add("hello");
		hashSet.add("guy");
		
		System.out.println("======original HashSet========");
		
		Iterator i=hashSet.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("======duplicate value HashSet========");
		
		hashSet.add("hello");
		
		for(Object item : hashSet){
			System.out.println(item);
		}
		
		System.out.println("======remove HashSet========");
		hashSet.remove("hello");
		
		hashSet.forEach( a-> { System.out.println(a);});
		
		//tree
		
		Set treeSet=new TreeSet<>(Collections.reverseOrder());
		treeSet.add("rulor");
		treeSet.add("book");
		treeSet.add("pen");
		System.out.println("========treeSet===========");
		for(Object item:treeSet){
			System.out.println(item);
		}
		
		
		Car car=new Car();
		Car car2=new Car();
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
		
		//Map 
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("CODE", "401");
		map.put("DATA","name");
		map.put("STATUS", true);
		map.put(null, true);
		
		

		for(Map.Entry<String, Object> item: map.entrySet()){
			System.out.println(item.getKey() +"->"+ item.getValue());
			
		}
		
		map.remove(null);
		for(Map.Entry<String, Object> item: map.entrySet()){
			System.out.println(item.getKey() +"->"+ item.getValue());
			
		}
		
		Map<String ,Object> treeMap=new TreeMap<>(Collections.reverseOrder());
		treeMap.put("CODE", "401");
		treeMap.put("DATA","name");
		treeMap.put("STATUS", true);
		treeMap.put("a", null);
		treeMap.put("b", null);
		//treeMap.put(null,true);
		
		System.out.println("======treeMap==========");
		
		for(Map.Entry<String, Object> item:treeMap.entrySet()){
			System.out.println(item.getKey() +"->"+ item.getValue());
			
		}
		*/
		
		Map<String ,Object> hashTable =new Hashtable<>();
		Car car=new Car();
		car.setColor("white");
		car.setModel("2017");
		
		hashTable.put("CODE", 500);
		//hashTable.put("null", null);
		hashTable.remove("CODE");
		hashTable.put("DATA", car);
		hashTable.put("MESSAGE","get car success");
		
		
		hashTable.remove("DATA");
		
		System.out.println("{");
		for(Map.Entry<String, Object> item:hashTable.entrySet()){
				if(item.getKey().equals("DATA")){
					Car c =null;
					if(item.getValue() instanceof Car){
						c =(Car) item.getValue();
					}
					System.out.println(
						"DATA : {"+
							"color\'"+c.getColor()	+"\',"+
							"model\'"+c.getModel()	+"\'"+
						"}"
					);	
				}else{
					System.out.println(item.getKey() +
							":" +"\'"+
							item.getValue()+ 
							"\',"
					);
				}
			System.out.println();
		}
		System.out.println("}");
	}
}
