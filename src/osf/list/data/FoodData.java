package osf.list.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodData {
	public static final List<Map<String, String>> FOOD_LIST = new ArrayList<>();
	static {
		Map<String, String> map = new HashMap<>();
		map.put("번호", "1");
		map.put("이름", "만두");
		map.put("가격", "10,000");
		FOOD_LIST.add(map);
		map = new HashMap<>();
		map.put("번호", "2");
		map.put("이름", "냉면");
		map.put("가격", "20,000");
		FOOD_LIST.add(map);
		map = new HashMap<>();
		map.put("번호", "3");
		map.put("이름", "잔치국수");
		map.put("가격", "30,000");
		FOOD_LIST.add(map);
		map = new HashMap<>();
		map.put("번호", "4");
		map.put("이름", "냉모밀");
		map.put("가격", "40,000");
		FOOD_LIST.add(map);
	}
}
