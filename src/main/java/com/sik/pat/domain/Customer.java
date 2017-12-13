package com.sik.pat.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pat_customers")
public class Customer {
    private int id;
    private String name;
    private String address;
    private String email;
    private Set<TestResults> testResults;

    public Customer(){ }

    public Customer(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="cust_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="cust_addr")
    public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="cust_email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(mappedBy = "testResults", cascade = CascadeType.ALL)
    public Set<TestResults> getTestResults() {
        return testResults;
    }

    public void setTestResults(Set<TestResults> testResults) {
        this.testResults = testResults;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Customer[id=%d, name='%s']%n",
                id, name);
        if (testResults != null) {
            for(TestResults testResults : testResults) {
                result += testResults.toString();
            }
        }

        return result;
    }
}
