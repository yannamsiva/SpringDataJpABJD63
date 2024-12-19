package com.shiva.pojo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//findByXXX
	Optional<Customer> findByCname(String cname);
	
	Optional<Customer> findByCadd(String cadd);
	
	Optional<Customer> findByCnameAndCadd(String cname,String cadd);
	
	//Custom query
	
	//@Query(value="select cname from Customer")
	@Query(value="select cname from CUSTOMER_DTLs" ,nativeQuery = true)
	public List<String> getCustomerNames();

}
