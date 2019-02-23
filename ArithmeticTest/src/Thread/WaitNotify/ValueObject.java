package Thread.WaitNotify;

import java.util.ArrayList;
import java.util.List;

public class ValueObject {
	public static List<Integer> list = new ArrayList<Integer>();
	public static void getList() {
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
	}

}
