package com.sik.pat.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TestResult{
	
	private String id;
    private String assetId;
    private String name;
    private int customerId;

    public TestResult() {
    	this.id = UUID.randomUUID().toString();
    }

    @Column(name="id")
    public String getId() {
        return id;
    }

    @Column(name="asset_id")
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "cust_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomer(int customerId) {
        this.customerId = customerId;
    }
}
