package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorService autorService = context.getBean("autorServiceImpl", AutorService.class);
		
		
		//Autor autor = new Autor(0, "Prueba10", "Prueba", "Prueba", "Prueba", "Prueba", "Prueba");
		//autorService.add(autor);
		
		
		
		//for (Cliente item : clientes) {
			
		//	System.out.println(item.toString());
			
		//}
		
		//System.out.println(cliente.toString());

		
		//Cliente cliente2 = new Cliente(0,"17232132131","Darwin", "Loor", "Manabi", "0983291839", "darwinl@gmail.com");
		//clienteService.add(cliente2);
		//clienteDAO.add(cliente2);
		
	
		//Autor autor = new Autor();
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		
		//Cliente cliente3 = new Cliente(40,"17232132131","Darwin", "Loor", "Manabi", "0983291839", "darwinl@gmail.com");
		//autorService.del(0);
		
		
		List<Autor> autores = autorService.findAll();
		

		for (Autor item : autores) {
			
			System.out.println(item.toString());	
			
		}
		
		
		
		//findOne
		
	Autor autor = autorService.findOne(1);
		System.out.println(autor.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}