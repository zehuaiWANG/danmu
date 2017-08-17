package com.danmu.pojo;

import java.util.Date;

public class User {
    private String eamil;

    private String password;

    private Integer role;

    private String company;

    private String phone;

    private Date createttime;

    private Date updatetime;

    public User(String eamil, String password, Integer role, String company, String phone, Date createttime, Date updatetime) {
        this.eamil = eamil;
        this.password = password;
        this.role = role;
        this.company = company;
        this.phone = phone;
        this.createttime = createttime;
        this.updatetime = updatetime;
    }

    public User() {
        super();
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil == null ? null : eamil.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreatettime() {
        return createttime;
    }

    public void setCreatettime(Date createttime) {
        this.createttime = createttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}