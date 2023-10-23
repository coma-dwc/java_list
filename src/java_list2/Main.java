package java_list2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	  public static List<Integer> reverseList(List<Integer> input) {
	    // TODO 逆順にしたListを返す
	    List<Integer> out_list = new ArrayList<>();
	    int i, l = input.size();
	    for(i=l-1;i>=0;i--) {
	      out_list.add(input.get(i));
	    }
	    return out_list;
	  }
	  
	  public static void main(String[] args) {
	    List<Integer> list1 = new ArrayList<>();
	    list1.add(1);
	    list1.add(2);
	    list1.add(3);
	    
	    List<Integer> list2 = new ArrayList<>();
	    list2.add(-1);
	    list2.add(10);
	    list2.add(100);
	    list2.add(-1000);
	    
	    List<Integer> list3 = new ArrayList<>();
	    list3.add(-4);
	    list3.add(-3);
	    list3.add(-2);
	    list3.add(-1);
	    list3.add(0);
	    list3.add(1);
	    list3.add(2);
	    list3.add(3);
	    list3.add(4);
	    
	    List<Integer> reversedList1 = reverseList(list1);
	    List<Integer> reversedList2 = reverseList(list2);
	    List<Integer> reversedList3 = reverseList(list3);
	    
	    System.out.println("Original List 1: " + list1);
	    System.out.println("Reversed List 1: " + reversedList1);
	    System.out.println("Original List 2: " + list2);
	    System.out.println("Reversed List 2: " + reversedList2);
	    System.out.println("Original List 3: " + list3);
	    System.out.println("Reversed List 3: " + reversedList3);
	  }
	}