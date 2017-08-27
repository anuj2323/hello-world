import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(3);
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()){
			System.out.println("ArrayList"+i.next());
		}
		HashSet<Integer> hs= new HashSet<Integer>(al);
	Iterator<Integer>a=	hs.iterator();
		while(a.hasNext()){
			System.out.println("HashSet"+a.next());
		}
	}

}
