package fr.proxibanque.proxibanquev2.daoTest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.IsEqual.*;

import fr.proxibanque.proxibanquev2.dao.ClientDao;
import fr.proxibanque.proxibanquev2.dao.ConseillerDao;
import fr.proxibanque.proxibanquev2.dao.Dao;
import fr.proxibanque.proxibanquev2.domaine.Client;
import fr.proxibanque.proxibanquev2.domaine.ClientParticulier;
import fr.proxibanque.proxibanquev2.domaine.Conseiller;

public class ClientDaotest
{

	ClientDao cldao;
	Connection cnx;
	ConseillerDao consdao;
	List<Client> listeCli;
	
	@Before
	public void initialisation()
	{
		System.out.println("Donnees Personne scenario ");
		cldao= new ClientDao();
		cnx = Dao.seConnecter();
		consdao= new ConseillerDao();
	}
	
	@Test
	public void monScenario1() {
		System.out.println("Test scenario 1");
		fail("Not yet implemented");
	}
	
	@Test
	public void getClientByIdcli() {
		System.out.println("Test scenario 2");
		System.out.println("Foster est en majuscule dans la base de données donc test faux");
		ClientParticulier client = (ClientParticulier) cldao.getClientByIdcli(3);
		String nomAttendu = "Foster";
		assertThat(nomAttendu, equalTo(client.getNomCli()));
	}
	
	
	@Test
	public void getClientByIdcli2() {
		System.out.println("Test scenario 3");
		System.out.println("FOSTER est en majuscule dans la base de données donc test vrai");
		ClientParticulier client = (ClientParticulier) cldao.getClientByIdcli(3);
		String nomAttendu2 = "FOSTER";
		assertThat(nomAttendu2, equalTo(client.getNomCli()));
	}
	
	@Test
	public void getListCliByCons() {
		System.out.println("Test scenario 4");
		System.out.println("Test de la recupération du nombre de clients avec le login d'un conseiller");
		Conseiller cons = consdao.getConsByLogin("psanchez");
		List<Client> listeCli = cldao.getListCliByCons(cons);
		assertEquals(9, listeCli.size());
	}
	
}
