package java_list;

//LinkedListの作成
//import java.util.LinkedList;
//ArrayListの作成
import java.util.ArrayList;
import java.util.List;

//public class Main {
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		System.out.println(list);
//	}

public class Main {
	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
		//整数を扱うListを作成
		//Listに要素の追加
//		List<Integer> list = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
		
		//要素の指定位置への追加
//		list.add(2);
//		list.add(4);
//		
//		list.add(0, 1);
//		list.add(2, 3);
		
		//要素の参照
//		list.add(1);
//		list.add(2);
//		list.add(3);
		
		//要素数の取得
//		list.add(1);
//		list.add(2);
		
		
		//要素の変更
//		list.add(5);
//		list.add(2);
//		list.add(7);
//		list.add(4);
//		
//		
//		list.set(0, 1);
//		list.set(2, 3);
//		System.out.println(list);
		
		//要素の位置の取得
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//3という値が何番目の位置にあるか
		System.out.println(list.indexOf(3));
		
//		System.out.println(list);
		
		//Listの最初の要素と3番目の要素を参照
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.size());
	}
}