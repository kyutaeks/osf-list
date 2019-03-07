package test;

import java.util.HashMap;
import java.util.Map;

import test.controller.AddressController;

public class Execute {
	public static void main(String[] args) {
		AddressController ac = new AddressController();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();
		req.put("cmd", "contact");
		req.put("name", "이모씨");
		ac.doGet(req, res);
		System.out.println(res);

		req = new HashMap<>();
		res = new HashMap<>();

		req.put("cmd", "insert");
		req.put("name", "강모씨");
		req.put("address", "계양구");
		req.put("phone", "017");
		ac.doPost(req, res);
		System.out.println(res);
	
		req = new HashMap<>();
		res = new HashMap<>();
		
		req.put("cmd", "update");
		req.put("phone", "017");
		req.put("name", "장모씨");
		ac.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		
		req.put("cmd", "delete");
		req.put("phone", "017");
		ac.doPost(req, res);
		System.out.println(res);
		
		req.put("cmd", "AddressList");
		ac.doGet(req, res);
		System.out.println(res);

	}
}
