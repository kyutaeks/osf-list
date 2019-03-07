package osf.list.data;

import java.util.ArrayList;
import java.util.List;

import osf.list.vo.FoodVO;

public class FoodData {
	public static final List<FoodVO> FOOD_LIST = new ArrayList<>();
	static {
		FoodVO food = new FoodVO();
		food.setNumber(1);
		food.setName("만두");
		food.setPrice(1010);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		
		food.setNumber(2);
		food.setName("김밥");
		food.setPrice(2020);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		
		food.setNumber(3);
		food.setName("라면");
		food.setPrice(3030);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		
		food.setNumber(4);
		food.setName("주먹밥");
		food.setPrice(4040);
		FOOD_LIST.add(food);
		
		
		
	}
}
