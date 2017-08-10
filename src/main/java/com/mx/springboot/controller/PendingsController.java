package com.mx.springboot.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.springboot.model.Pending;

@RestController
@CrossOrigin
public class PendingsController {

	public List<Pending> listaPendientes() {

		ArrayList<Pending> pendientes = new ArrayList<Pending>();

		Pending pendiente1 = new Pending(1, "Normal", "Documentacion pendiente entrega", "Media");
		Pending pendiente2 = new Pending(2, "Normal", "Falta Configuracion Impresoras", "Media");
		Pending pendiente3 = new Pending(3, "Normal", "Folios para acceso de nuevos recursos", "Media");
		Pending pendiente4 = new Pending(4, "Normal", "Documentos contables cierre mes ", "Urgente");

		pendientes.add(pendiente1);
		pendientes.add(pendiente2);
		pendientes.add(pendiente3);
		pendientes.add(pendiente4);
		return pendientes;
	}

	@GetMapping("/lista-pendientes")
	@CrossOrigin
	public List<Pending> allPendings() {

		return listaPendientes();
	}
	
	

}
