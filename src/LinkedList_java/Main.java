package LinkedList_java;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
//		list.add(2);
//		list.add(3);
//		list.add(4);
		
		//addFirstメソッド:Listの先頭に要素を追加
//		list.addFirst(1);
		//addLastメソッド:Listの末尾に要素を追加
//		list.addLast(5);
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//getFirstメソッド:要素の先頭から要素を取得
		System.out.println("先頭: " + list.getFirst());
		//getLastメソッド:要素の末尾から要素を取得
		System.out.println("末尾: " + list.getLast());
	}
}