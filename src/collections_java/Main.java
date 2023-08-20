package collections_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//Collections.addAllを使用して複数の要素をListに追加
//		Collections.addAll(list, "aaa", "bbb", "ccc");
//		
//		System.out.println(list);
		
		
		//Collections.unmodifiableListを使用して変更不可のListを取得
		list.add("aaa");
		list.add("bbb");
		
		List<String> list2 = Collections.unmodifiableList(list);
		list2.add("ccc");  //この行がエラーになる
	}
}