package test.controller;

import java.util.HashMap;
import java.util.Map;

import test.service.AddressService;
import test.service.impl.AddressServiceImpl;

public class AddressController {
	private AddressService as = new AddressServiceImpl();

	public void doGet(Map<String, String> req, Map<String, Object> res) {
		String cmd = req.get("cmd");
		String name = req.get("name");
		Map<String, String> contact = new HashMap<>();
		contact.put("이름", name);
		if ("AddressList".equals(cmd)) {
			res.put("AddressList", as.selectAddressList());
		} else if ("contact".equals(cmd)) {
			res.put("AddressList", as.selectAddress(contact));
		}
	}

	public void doPost(Map<String, String> req, Map<String, Object> res) {
		String cmd = req.get("cmd");
		String name = req.get("name");
		String address = req.get("address");
		String phone = req.get("phone");
		Map<String,String> contact = new HashMap<>();
		contact.put("이름", name);
		contact.put("주소", address);
		contact.put("전화번호", phone);
		
		if("insert".equals(cmd)) {
			res.put("insert", as.insertAddress(contact));
		}else if("update".equals(cmd)) {
			res.put("update", as.updateAddress(contact));
		}else if("delete".equals(cmd)) {
			res.put("delete", as.deleteAddress(contact));
		}
	}

}
