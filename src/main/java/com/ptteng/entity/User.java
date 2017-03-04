package com.ptteng.entity;

/**
 * Created by maweijiang on 2017/3/4.
 */
public class User {
    private int user_id;
    private String user_name;
    private String user_password;
    private String create_at;
    private String update_at;

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getCreate_at() {
        return create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password() {
        return user_password;
    }



    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

}
