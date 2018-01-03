package com.shsxt.service;

/**
 * Created by Administrator on 2018/1/3.
 */
public interface UserService {

    /**
     * 用户登录
     * @param userName
     * @param password
     */
    public void login (String userName, String password) ;

    /**
     * 用户退出
     * @param userName
     * @param password
     */
    public void loginout (String userName ,String  password);

}
