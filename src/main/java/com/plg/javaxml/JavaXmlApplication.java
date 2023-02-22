package com.plg.javaxml;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.plg.javaxml.enumeration.TypeCompte;
// import com.plg.javaxml.models.Banque;
import com.plg.javaxml.models.*;
import com.plg.javaxml.services.Converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JavaXmlApplication implements CommandLineRunner {

	// @Autowired(required = true)
	// private Converter converter;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SpringApplication.run(JavaXmlApplication.class, args);

		Person person = new Person(1, "PLG");
		try {
			Converter.convertJavaToXml(person, "person.xml");
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}

		// JAXBContext context = JAXBContext.newInstance(Compte.class);
		// Compte compte = new Compte(1, 65000, new Date(), TypeCompte.COURANT);
		// Marshaller marshaller = context.createMarshaller();
		// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// marshaller.marshal(compte, System.out);

	}

	@Override
	public void run(String... args) throws Exception, JAXBException {
		log.info("Serveur run");
		// Banque banque = new Banque();
		// List<Compte> comptes = banque.getComptes();
		// comptes.add(new Compte(1, 65000, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(2, 75000, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(3, 125000, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(4, 4500, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(5, 25000, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(6, 1500, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(7, 5000, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(8, 450000, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(9, 950, LocalDate.now(), TypeCompte.COURANT));
		// comptes.add(new Compte(10, 45000, LocalDate.now(), TypeCompte.COURANT));
		// this.converter.convertJavaToXml(banque, "");
	}

}
