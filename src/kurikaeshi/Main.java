package kurikaeshi;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add("Item-" + i);
		}
//		for(String item : list) {
//			System.out.println(item);
//		}
		
		//Iteratorを使う
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String item = it.next();
//			System.out.println(item);
//		}
		
		//forEach
		list.forEach(item -> {
			System.out.println(item);
		});
	}
}