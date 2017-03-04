package com.ptteng.dao;

import com.ptteng.entity.User;

/**
 * Created by maweijiang on 2017/3/4.
 */
public interface UserDao {
    public void addUser(User u);
    public void deleteUser(int id);
}
