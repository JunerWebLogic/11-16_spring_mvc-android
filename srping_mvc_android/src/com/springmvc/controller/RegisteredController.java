package com.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.entity.UserEntity;

//��һ���϶��ٲ��ˣ�ǰ���н��ܾͲ��ٽ����� 
@Controller
// �������ע��ӿڵĸ�·����ǰ���н���Ҳ���������
@RequestMapping("RegisteredController")
public class RegisteredController {
	// �������ύ����������������ʹ��POST����
	@RequestMapping(value = "/registered_post.json", method = RequestMethod.POST)
	@ResponseBody
	// �˴�@ModelAttribute ���԰�POST������Я����json�ַ����Զ������ɺ�����д��ʵ����
	// ��Ȼ���ֱ�ӿ���ͨ�����UserEntityȡ��Android�˴�����������
	public Object registered(@ModelAttribute UserEntity entity) {
		String username = entity.getUsername();
		String password = entity.getPassword();
		String nickname = entity.getNickname();
		String gender = entity.getGender();
		String age = entity.getAge();
		// ���������Ѿ��õ��ˣ���������ʱ��������Ҫ������Android�������û��Ǽǵ����ݲ��뵽���ݿ��оͺ��ˣ�
		// Ϊ�˷���鿴,���������Ұѷ��ص�����ƴ��һ����
		String string = "�û�����" + username + " - ���룺" + password + " - �ǳƣ�" + nickname + " - �Ա�" + gender + " - ���䣺"
				+ age;
		// ������ݿ����ɹ�Ȼ�󷵻�true���ٸ�Android����һ����Ϣ������Android���Ѿ�ע��ɹ������Խ��е�¼��
		// ����û���漰�����ݿ������������������������ж�һ�����ݲ�Ϊnull��֤��ע��ɹ���
		if (username != null && password != null && nickname != null && gender != null && age != null) {
			// �ɹ�������Ϣ����Android��
			Map<String, String> map = new HashMap<String, String>();
			map.put("msg", "ע��ɹ���");
			return map;
		} else {
			// ʧ�ܷ�����Ϣ����Android��
			Map<String, String> map = new HashMap<String, String>();
			map.put("msg", "ע��ʧ�ܣ�");
			return map;
		}
	}
}
