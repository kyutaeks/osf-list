package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.contoller.FoodController;

//osf.list
// - contoller
// - dao
// - service 
// - vo
public class Execute {
	public static void main(String[] args) {
		FoodController fc = new FoodController();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();
		req.put("cmd", "food");
		req.put("number", "2");
		fc.doGet(req, res);
		System.out.println(res);
		
		res =new HashMap<>();
		
		req.put("cmd", "insert");
		req.put("number", "5");
		req.put("name", "연어");
		req.put("price", "25,000");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>(); //초기화시켜주지않아도 상관없다.
		res = new HashMap<>();

		req.put("cmd", "foodlist");
		fc.doGet(req, res);
		System.out.println(res);
	}
}
//- FoodContoller <- FoodService 의존성
//- FoodService <- FoodDAO 의존성

//- doGet 어떤데이터를 받아와야할때
//- doPost 뭔가를 보낼때  (저장 / 생성)
//- doPut 집어넣을때 (수정)
//- doDelete 삭제 

//- 우리가 현재 할건 두가지 
//- doGet 조회(리스트[0개이상], 단건[한가지])
//- doPost 저장, 수정, 삭제