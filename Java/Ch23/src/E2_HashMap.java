import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class E2_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "james");
		map.put(23, "martin");
		
		//key�� ����ִ� �÷��� �ν��Ͻ� ����
		Set<Integer> ks = map.keySet();
		
		//��ü Ű ���
		for(Integer n : ks)
			System.out.print(n.toString()+'\t');
		System.out.println();
		
		//value ���
		for(Integer n : ks)
			System.out.print(map.get(n).toString()+'\t');
		System.out.println();
		
		for(Iterator<Integer> itr=ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next())+'\t');
		System.out.println();

	}

}