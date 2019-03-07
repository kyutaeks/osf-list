package osf.list.dao;

import java.util.List;

import osf.list.vo.FoodVO;

public interface FoodDAO {
	public List<FoodVO> selectFoodList();//c
	public FoodVO selectFood(FoodVO food);//c
	
	public boolean insertFood(FoodVO food);//c
	public boolean updataFood(FoodVO food);//u
	public boolean deleteFood(FoodVO food);//d
}
