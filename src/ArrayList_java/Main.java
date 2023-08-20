package ArrayList_java;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(100);  //キャパシティの指定 100
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		System.out.println(list);
//	}
//}


//[アンチパターンj]キャパシティと要素の追加
//キャパの小さいArrayListに対して大量の要素を追加した場合の動作確認

//public class Main {
//	private static void addElements(List<Integer> list, int count) {
//		long start = System.currentTimeMillis();
//		for(int i=1; i<=count; i++) {
//			list.add(i);
//		}
//		System.out.println(String.format("所要時間: %d ms", System.currentTimeMillis() - start));
//	}
//	
//	public static void main(String[] args) {
//		int count = 6000000;
//		//こちらは問題のないコード
//		List<Integer> list1 = new ArrayList<>(count);
//		addElements(list1, count);
//		
//		//こちらは遅いコード
//		List<Integer> list2 = new ArrayList<>(2);
//		addElements(list2, count);
//	}
//}




//[アンチパターン]先頭または中間への要素の追加
//大量の要素を持つArrayListに対して先頭に要素を追加した場合の動作を確認

public class Main {
	private static void addElements(List<Integer> list, int count, boolean bFirst) {
		long start = System.currentTimeMillis();
		for(int i=1; i<=count; i++) {
			if(bFirst) {
				list.add(0, i);
			} else {
				list.add(i);
			}
		}
		System.out.println(String.format("所要時間: %d ms", System.currentTimeMillis() - start));
	}
	
	public static void main(String[] args) {
		int count = 50000;
		List<Integer> list1 = new ArrayList<>(count);
		addElements(list1, count, false); //速い
		addElements(list1, count, true); //遅い
		addElements(list1, count, false); //速い
		addElements(list1, count, true); //遅い
		addElements(list1, count, false); //速い
	}
}