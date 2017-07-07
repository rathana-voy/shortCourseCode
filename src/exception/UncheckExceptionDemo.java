package exception;

import java.util.ArrayList;
import java.util.List;

public class UncheckExceptionDemo {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		//l.add("E");
		A a =new A(l);
		
		l.forEach( s ->{System.out.println(s);});
		
	}
}

