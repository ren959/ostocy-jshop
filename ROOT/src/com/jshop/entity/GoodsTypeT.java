package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsTypeT generated by hbm2java
 */
public class GoodsTypeT implements java.io.Serializable {

	private String id;
	private String navid;
	private String nname;
	private String ltypeid;
	private String lname;
	private String stypeid;
	private String sname;
	private String fname;
	private String navigation;
	private Date createtime;
	private String creatorid;
	private String state;

	public GoodsTypeT() {
	}

	public GoodsTypeT(String id, Date createtime, String creatorid, String state) {
		this.id = id;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public GoodsTypeT(String id, String navid, String nname, String ltypeid,
			String lname, String stypeid, String sname, String fname,
			String navigation, Date createtime, String creatorid, String state) {
		this.id = id;
		this.navid = navid;
		this.nname = nname;
		this.ltypeid = ltypeid;
		this.lname = lname;
		this.stypeid = stypeid;
		this.sname = sname;
		this.fname = fname;
		this.navigation = navigation;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNavid() {
		return this.navid;
	}

	public void setNavid(String navid) {
		this.navid = navid;
	}

	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getLtypeid() {
		return this.ltypeid;
	}

	public void setLtypeid(String ltypeid) {
		this.ltypeid = ltypeid;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getStypeid() {
		return this.stypeid;
	}

	public void setStypeid(String stypeid) {
		this.stypeid = stypeid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getNavigation() {
		return this.navigation;
	}

	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
