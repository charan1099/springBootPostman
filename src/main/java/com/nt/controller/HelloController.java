package com.nt.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.domain.Product;

@RestController
public class HelloController {
	Product p=new Product();
	@RequestMapping(value="/home")
	
public String display(ModelMap map)
{
	map.put("message","hai charan");
	return "wel";
}
	
	@GetMapping(value="/product/{pid}",produces=MediaType.APPLICATION_JSON_VALUE)
public String view(@PathVariable("pid") Integer pid)
{
		
		if(pid==101)
		{
			p.setPid(101);
			p.setName("charan");
			p.setPrice(3000);
			
		}
		
	return "success";
}
	@PostMapping(value="/add")
	public int create(@RequestBody Product pro)
	{
		if(pro.getPid()==1010)
		{
			p.setPid(pro.getPid());
			p.setName(pro.getName());
			p.setPrice(pro.getPrice());
			System.out.println(p.getPid());
			return p.getPid();
		}else
		{
			p.getPid();
			return 0;
		}
	}
	
	/* testing */
}
