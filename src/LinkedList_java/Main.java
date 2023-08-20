package LinkedList_java;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		
		//addFirstメソッド:Listの先頭に要素を追加
		list.addFirst(1);
		//addLastメソッド:Listの末尾に要素を追加
		list.addLast(5);
		
		System.out.println(list);
	}
}