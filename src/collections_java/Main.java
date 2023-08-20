package collections_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//Collections.addAllを使用して複数の要素をListに追加
		Collections.addAll(list, "aaa", "bbb", "ccc");
		
		System.out.println(list);
	}
}