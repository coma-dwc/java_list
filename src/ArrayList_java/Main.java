package ArrayList_java;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(100);  //キャパシティの指定 100
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
	}
}