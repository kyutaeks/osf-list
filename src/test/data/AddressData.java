package test.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {
	public static final List<Map<String, String>> ADDRESS_LIST = new ArrayList<>();
	static {
		Map<String, String> map = new HashMap<>();
		map.put("이름", "이모씨");
		map.put("주소", "서울");
		map.put("전화번호", "010");

		ADDRESS_LIST.add(map);
		map = new HashMap<>();

		map.put("이름", "김모씨");
		map.put("주소", "인천");
		map.put("전화번호", "011");

		ADDRESS_LIST.add(map);
		map = new HashMap<>();

		map.put("이름", "강모씨");
		map.put("주소", "경기");
		map.put("전화번호", "016");
		ADDRESS_LIST.add(map);

	}

}
