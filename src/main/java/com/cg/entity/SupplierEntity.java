package com.cg.entity;

import javax.persistence.Entity;

@Entity
public class SupplierEntity {
  private String sname;
   private int sid;
   
   public SupplierEntity() {}
   
public SupplierEntity(String sname, int sid) {
	super();
	this.sname = sname;
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
@Override
public String toString() {
	return "SupplierEntity [sname=" + sname + ", sid=" + sid + "]";
}
  
   
}
