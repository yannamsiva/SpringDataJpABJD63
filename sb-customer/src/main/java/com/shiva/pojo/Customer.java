package com.shiva.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_DTLs")
public class Customer {

	
	@Id
	@Column(name = "CID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column(name = "CNAME")
	private String cname;
	@Column(name = "CADD")
	private String cadd;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
