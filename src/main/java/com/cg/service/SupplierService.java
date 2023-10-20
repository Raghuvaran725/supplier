package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.dao.SupplierDao;
import com.cg.entity.SupplierEntity;


 

public class SupplierService implements SupplierDao {

List<SupplierEntity> supplierList=new ArrayList<>();

 

	
	public String addSupplier(SupplierEntity supplier) {
	supplierList.add(supplier);
    return"Supplier added successfully";
	}

 

 

	public List<SupplierEntity> getSupplierList() {
	return supplierList;
	}


 

}
