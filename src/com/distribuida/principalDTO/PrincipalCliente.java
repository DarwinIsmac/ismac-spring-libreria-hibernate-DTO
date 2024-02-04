package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteService clienteService = context.getBean("clienteServiceImpl", ClienteService.class);
	
		
//		for (Cliente item : clientes) {
			
//		System.out.println(item.toString());
			
//		}
		
//		System.out.println(cliente.toString());
		
		
//		Cliente cliente2 = new Cliente(0,"17232132131","Darwin", "Loor", "Manabi", "0983291839", "darwinl@gmail.com");
//		clienteService.add(cliente2);
//		clienteDAO.add(cliente2);
		
//		Cliente cliente3 = new Cliente(40,"17232132221","Darwin", "Loor", "Manabi", "0983291830", "darwinl@gmail.com");
//		clienteDAO.up(cliente3);
//		clienteService.up(cliente3);
		
		
//		Cliente cliente3 = new Cliente(40,"17232132131","Darwin", "Loor", "Manabi", "0983291839", "darwinl@gmail.com");
//		clienteService.del(41);
		
		
		List<Cliente> clientes = clienteService.findAll();
		
		
//		Cliente cliente = clienteService.findOne(1);
		
		
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());	
			
		}
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}
