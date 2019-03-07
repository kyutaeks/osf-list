package test.dao.impl;

import java.util.List;
import java.util.Map;

import test.dao.AddressDAO;
import test.data.AddressData;

public class AddressDAOImpl implements AddressDAO {

	@Override
	public List<Map<String, String>> selectAddressList() {
		return AddressData.ADDRESS_LIST;
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> contact) {
		for (int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			if (a.get("이름").equals(contact.get("이름"))) {
				return a;
			}

		}
		return null;
	}

	@Override
	public boolean insertAddress(Map<String, String> contact) {
		return AddressData.ADDRESS_LIST.add(contact);
	}

	@Override
	public boolean updateAddress(Map<String, String> contact) {
		for (int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("전화번호").equals(contact.get("전화번호"))) {
				if(contact.get("이름") != null) {
					a.put("이름", contact.get("이름"));
				}
				if(contact.get("주소")!= null) {
					a.put("주소",contact.get("주소"));
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteAddress(Map<String, String> contact) {
		for (int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("전화번호").equals(contact.get("전화번호"))) {
				AddressData.ADDRESS_LIST.remove(i);
				return true;
			}
		}
		return false;
	}

}
