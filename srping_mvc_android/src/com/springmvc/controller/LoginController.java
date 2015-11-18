package com.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springmvc.entity.UserEntity;

//��һ���϶��ٲ��ˣ�ǰ���н��ܾͲ��ٽ����� 
@Controller
// ������ʵ�¼�ӿڵĸ�·����ǰ���н���Ҳ���������
@RequestMapping("LoginController")
public class LoginController {

	// ·������{name}�����û�����{pass}�������롣��������ΪGET����
	@RequestMapping(value = "/login_get.json/{name}/{pass}", method = RequestMethod.GET)
	// ��ǰ���ܹ����Ͳ��ٽ����ˡ�
	@ResponseBody
	// ��ʹ��@RequestMapping URI template ��ʽӳ��ʱ�� �� /login_get.json/{name}/{pass},
	// ��ʱ��name��pass��ͨ�� @Pathvariableע�������������ֵ�������Ĳ����ϡ�
	public Object login(@PathVariable String name, @PathVariable String pass) {
		// ��������Ϊ�˼򵥾Ͳ�ȥ���ݿ��ѯ�ˣ���������ʱ�������Ҫ�Ѵ��������û���������������ݿ�����в�ѯ��
		// �����������ݿ����û�����admin����Ϊ123456
		if (name.equals("admin") && pass.equals("123456")) {
			// ���������˵�����ǵ�¼�ɹ��ˣ���ʱ�����Ǿ�Ҫ��Android�˷�������û�����Ϣ
			// ��������Ҳ����д��������
			UserEntity entity = new UserEntity();
			entity.setUsername("admin");
			entity.setPassword("123456");
			entity.setNickname("����");
			entity.setGender("��");
			entity.setAge("22");

			return entity;// ��ʱ���ش��û�ʵ����
		} else {
			Map map = new HashMap();
			map.clear();
			map.put("msg", "��¼ʧ��");
			UserEntity entity = new UserEntity();
			entity.setUsername("admin");
			entity.setGender("��");
			map.put("data", entity);
			return map;// ��¼ʧ�ܸ�Android�˷���һ��������Ϣ�����û�
		}

	}

}
