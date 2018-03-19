package com.belstar.dto.callcenter.detail;

import java.io.Serializable;


/**
 * DTO.
 * @author weily
 *
 */
public class AddCustomerListDTO implements Serializable {

  /**
   * 市話1.
   */
  private String homePhone1;
  /**
   * 市話2.
   */
  private String homePhone2;
  /**
   * 手機1.
   */
  private String phone1;
  /**
   * 手機2..
   */
  private String phone2;
  /**
   * 客戶姓名.
   */
  private String name;
  /**
   * 稱謂.
   */
  private String sex;
  /**
   * 區域 類型.
   */
  private String category;
  /**
   * 區域 範圍.
   */
  private String scope;
  /**
   * 公司.
   */
  private String company;
  /**
   * 分公司.
   */
  private String branch;
  /**
   * 部門.
   */
  private String department;
  /**
   * 職稱.
   */
  private String jobTitle;
  /**
   * Mail.
   */
  private String mail;
  /**
   * QQ帳號.
   */
  private String qq;
  /**
   * WeChat帳號.
   */
  private String wechat;


  /**
   * constructor.
   */
  public AddCustomerListDTO() {

  }

  public String getHomePhone1() {
    return homePhone1;
  }

  public void setHomePhone1(String homePhone1) {
    this.homePhone1 = homePhone1;
  }

  public String getHomePhone2() {
    return homePhone2;
  }

  public void setHomePhone2(String homePhone2) {
    this.homePhone2 = homePhone2;
  }

  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }

  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public String getWechat() {
    return wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

}
