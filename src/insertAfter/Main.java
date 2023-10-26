package insertAfter;

import java.util.List;

public class Main {
	  public static List<String> insertAfter(List<String> input, String target, String toInsert) {
	    // TODO `target`の示す文字列の直後に`toInsert`を挿入する
	    // `target`が見つからない場合は、値の挿入は行わない
		  int i;
		  i = input.indexOf(target);
		  if(-1 == i) {
			  return input;
		  } else {
			  input.add(i + 1, toInsert);
			  return input;
		  }
	  }
	}