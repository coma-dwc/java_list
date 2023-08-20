package streamAPI_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
//		System.out.println(list.stream());
		//Streamに変換したListを再度Listに戻す
		List<Integer> list2 = list.stream().collect(Collectors.toList());
		System.out.println(list2);
	}
}