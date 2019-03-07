package test.service.impl;

import java.util.List;
import java.util.Map;

import test.dao.AddressDAO;
import test.dao.impl.AddressDAOImpl;
import test.service.AddressService;

public class AddressServiceImpl implements AddressService {

	private AddressDAO adao = new AddressDAOImpl();
	
	@Override
	public List<Map<String, String>> selectAddressList() {
		return adao.selectAddressList();
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> contact) {
		return adao.selectAddress(contact);
	}

	@Override
	public boolean insertAddress(Map<String, String> contact) {
		return adao.insertAddress(contact);
	}

	@Override
	public boolean updateAddress(Map<String, String> contact) {
		return adao.updateAddress(contact);
	}

	@Override
	public boolean deleteAddress(Map<String, String> contact) {
		return adao.deleteAddress(contact);
	}

}
