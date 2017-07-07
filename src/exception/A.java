package exception;

import java.util.List;

public class A {
	
	List l;
	public A(List l) throws ArrayLeghtOutofBoundException{
		if(l.size()>=5) throw new ArrayLeghtOutofBoundException("the list cannot geater than 5");
		else this.l=l;
	}

}
