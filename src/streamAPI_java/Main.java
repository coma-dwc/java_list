package streamAPI_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
			list.add(i);
		}
		
		System.out.println(list);
//		System.out.println(list.stream());
		
		//Streamに変換したListを再度Listに戻す collect(Collectors.toList)
//		List<Integer> list2 = list.stream().collect(Collectors.toList());
//		System.out.println(list2);
		
		//整数のListから偶数のみを取り出す(filterメソッド)
//		List<Integer> list2 = list.stream()
//				.filter(v -> v % 2== 0)
//				.collect(Collectors.toList());
//		System.out.println(list2);
		
		
		//重複のあるListから重複を取り除く(distinctメソッド）
		List<Integer> list2 = list.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(list2);
	}
}