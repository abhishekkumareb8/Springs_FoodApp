package com.ty.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {("com.ty.foodapp.dao")})
public class Configr {
	
	@Bean("emf")
	public EntityManagerFactory getEmf() {
		return Persistence.createEntityManagerFactory("foodapp");
	}
	
	@Bean("em")
	public EntityManager getEm() {
		return getEmf().createEntityManager();
	}
	
	@Bean("et")
	public EntityTransaction getEt() {
		return getEm().getTransaction();
	}
	
	@Bean("menudao")
	public MenuDao getMenuDao()
	{
		return new MenuDao();
	}
	
	@Bean("foodorderdao")
	public FoodOrderDao getfoodDao()
	{
		return new FoodOrderDao();
	}

}
