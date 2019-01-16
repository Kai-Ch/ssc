/**
 * @Auther: KaiCh
 * @Date: 2018/12/17 10:54
 * @Description:
 */
package com.ssc.code.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String id;

    private String userName;

    private String passWord;

    private Integer uType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }

    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

}
