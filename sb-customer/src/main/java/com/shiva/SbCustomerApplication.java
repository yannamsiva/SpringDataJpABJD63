package com.shiva;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shiva.pojo.Customer;
import com.shiva.pojo.CustomerRepository;

@SpringBootApplication
public class SbCustomerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbCustomerApplication.class, args);

		CustomerRepository daoImpl = ctx.getBean(CustomerRepository.class);

		/*
		 * //insert record into the database
		 * 
		 * //create Entity Class Customer c=new Customer(); c.setCname("sirisha");
		 * c.setCadd("Hyderabad");
		 * 
		 * Customer cust = daoImpl.save(c); if(cust!=null)
		 * System.out.println("Data inserted SuccessFully"); else
		 * System.out.println("Data is not inserted SuccessFully");
		 */

		/*
		 * // To retrive the data from the database
		 * 
		 * List<Customer> customerRecords = daoImpl.findAll();
		 * 
		 * customerRecords.stream().forEach(c->System.out.println(c.getCid()+"\t"+c.
		 * getCname()+"\t"+c.getCname()));
		 */

		// specific record

		/*
		 * Optional<Customer> byId = daoImpl.findById(10);
		 * 
		 * Customer cust=null; if( byId.isPresent()) { cust=byId.get();
		 * System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getCadd()); }
		 * else System.out.println("Record is not exist");
		 */

		/*
		 * // specific record using cname Optional<Customer> byCname =
		 * daoImpl.findByCname("lilly"); Customer cust = null; if (byCname.isPresent())
		 * { cust = byCname.get(); System.out.println(cust.getCid() + "\t" +
		 * cust.getCname() + "\t" + cust.getCadd());
		 * 
		 * } else System.out.println("Name is not exist");
		 */

		List<String> customerNames = daoImpl.getCustomerNames();
		
		customerNames.stream().forEach(c->System.out.println(c));
		
	}

}
