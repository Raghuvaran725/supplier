package com.cg.dao;



import java.util.List;

import com.cg.entity.SupplierEntity;


public interface SupplierDao {
	
	public String addSupplier(SupplierEntity supplier);
	
	public List<SupplierEntity> getSupplierList();

}
