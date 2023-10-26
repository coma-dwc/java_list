package duplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static List<Integer> removeDuplicates(List<Integer> input) {
    // TODO 重複を排除したListを返す
	  List<Integer> list = new ArrayList<>(input);
	  List<Integer> list2 = list.stream()
			  .distinct()
			  .collect(Collectors.toList());
	  return list2;
  }
}