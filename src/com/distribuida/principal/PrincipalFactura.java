package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Cliente;

public class PrincipalFactura {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		Cliente cliente2 = clienteDAO.findOne(2);
		Factura factura2 = new Factura(0,"FAC-000111",new Date(),164.30,0.12,170.12, cliente);
		facturaDAO.add(factura2);
//		Factura factura3 = new Factura(39,"1754326178","David","Sanchez","Quito","0981222541", "dfernan@gmail.com");
//		facturaDAO.up(cliente3);
		
//		facturaDAO.del(39);
		
		List<Factura> facturas = facturaDAO.findAll();
		
		Factura factura = facturaDAO.findOne(1);
		
		
		for (Factura item : facturas) {
			System.out.println(item.toString());
		}
		
//		System.out.println(cliente.toString());
		
		context.close();
				
		
	}

}
