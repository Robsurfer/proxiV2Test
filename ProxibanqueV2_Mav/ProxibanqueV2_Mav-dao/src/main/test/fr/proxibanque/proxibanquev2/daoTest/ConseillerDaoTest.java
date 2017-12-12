package fr.proxibanque.proxibanquev2.daoTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import fr.proxibanque.proxibanquev2.dao.ConseillerDao;
import fr.proxibanque.proxibanquev2.dao.Dao;
import fr.proxibanque.proxibanquev2.domaine.Conseiller;

public class ConseillerDaoTest
{

	ConseillerDao consdao;
	Connection cnx;
	
	@Before
	public void initialisation()
	{
		System.out.println("Donnees Personne scenario ");
		consdao= new ConseillerDao();
		cnx = Dao.seConnecter();
	}
	
	@Test
	public void monScenario1() {
		System.out.println("Test scenario 1");
		fail("Not yet implemented");
	}
	
	
	@Test
	public void getConsByLogin(){
		System.out.println("Test scenario 2");
		System.out.println("Test de la recupération d'un conseiller avec son login");
		Conseiller cons = (Conseiller) consdao.getConsByLogin("pdupond");
		String consAttendu = "Dupond";
		assertThat(consAttendu, equalTo(cons.getNomCons()));
	}
	
	
}
