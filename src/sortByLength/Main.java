package sortByLength;

import java.util.Collections;
import java.util.List;

public class Main {
  public static List<String> sortByLength(List<String> input) {
    // TODO 文字列の長い順でソートして返す。(文字列長が同じ場合は辞書順とする)
	  Collections.sort(input);
	  input.sort((a, b) -> b.length() - a.length());
	  return input;
  }
}