package sort_java;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		
		System.out.println(list);
		
//		list.sort(null);
//		System.out.println(list);
		
		
		//Comparatorを使う(整数のリストを逆順にソートする)
		list.sort((a, b) -> b - a);
		System.out.println(list);
	}
}