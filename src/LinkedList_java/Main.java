package LinkedList_java;

import java.util.LinkedList;
import java.util.List;

//public class Main {
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
////		list.add(2);
////		list.add(3);
////		list.add(4);
//		
//		//addFirstメソッド:Listの先頭に要素を追加
////		list.addFirst(1);
//		//addLastメソッド:Listの末尾に要素を追加
////		list.addLast(5);
//		
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		//getFirstメソッド:要素の先頭から要素を取得
////		System.out.println("先頭: " + list.getFirst());
//		//getLastメソッド:要素の末尾から要素を取得
////		System.out.println("末尾: " + list.getLast());
//		
//		
//		//removeFirstメソッド:要素の先頭から要素を削除
//		System.out.println("先頭: " + list.removeFirst());
//		//removeLastメソッド:要素の末尾から要素を削除
//		System.out.println("末尾: " + list.removeLast());
//		System.out.println(list);
//				
//	}
//}


public class Main {
	private static void reference(List<Integer> list, int index) {
		long start = System.currentTimeMillis();
		int n = list.get(index);
		System.out.println(String.format("要素: %d, 所要時間: %d ms", n, System.currentTimeMillis() - start));
	}
	
	public static void main(String[] args) {
		int count = 8000000;
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=1; i<=count; i++) {
			list.add(i);
		}
		reference(list, 0); //速い
		reference(list, count / 2); //遅い
		reference(list, list.size() - 1); //速い
	}
}