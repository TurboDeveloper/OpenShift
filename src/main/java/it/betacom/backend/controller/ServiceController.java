package it.betacom.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.betacom.backend.model.Contatto;

@RestController
public class ServiceController {
	@RequestMapping("api")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","MimmoMario"));
		lista.add(new Contatto("Luigi","Verdi","MimmoLuigi"));
		lista.add(new Contatto("Xavi","Bianchi","MimmoXavi"));
		return lista;
	}
}
