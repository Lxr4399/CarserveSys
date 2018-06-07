package com.css.dao;

import com.css.entity.Users;
import com.css.util.PageData;

public interface UsersDao {
	/**
	 * ��ѯ�����û�,ģ����ҳ��ѯ
	 * 
	 * @return
	 */
	public PageData<Users> queryUsers(int page, int pagesize);

	/**
	 * ����һ���û�
	 * 
	 * @param user
	 *            �û�
	 * @return
	 */
	public boolean addUsers(Users user);
	
	
	public Users queryId (String userName);
	
	/**
	 * �û���¼
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	public Users Login (String userName,String userPwd);
}