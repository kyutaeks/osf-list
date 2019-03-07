package test.service;

import java.util.List;
import java.util.Map;

public interface AddressService {
	public List<Map<String, String>> selectAddressList();
	public Map<String,String> selectAddress(Map<String,String> contact);
	
	public boolean insertAddress(Map<String,String> contact);
	public boolean updateAddress(Map<String,String> contact);
	public boolean deleteAddress(Map<String,String> contact);
}
