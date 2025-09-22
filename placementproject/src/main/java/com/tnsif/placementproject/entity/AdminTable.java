package com.tnsif.placementproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class AdminTable {
	
	@Id
	long stdid;
	String stdname;
	String stdpass;
	/**
	 * @return the stdid
	 */
	public long getStdid() {
		return stdid;
	}
	/**
	 * @param stddid the stdid to set
	 */
	public void setStdid(long stdid) {
		this.stdid = stdid;
	}
	/**
	 * @return the stdname
	 */
	public String getStdname() {
		return stdname;
	}
	/**
	 * @param stdname the stdname to set
	 */
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	/**
	 * @return the stdpass
	 */
	public String getStdpass() {
		return stdpass;
	}
	/**
	 * @param stdpass the stdpass to set
	 */
	public void setStdpass(String stdpass) {
		this.stdpass = stdpass;
	}

}
