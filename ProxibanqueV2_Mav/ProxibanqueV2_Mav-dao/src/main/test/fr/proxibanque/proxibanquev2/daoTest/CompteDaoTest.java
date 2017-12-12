package fr.proxibanque.proxibanquev2.daoTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.proxibanque.proxibanquev2.dao.ClientDao;
import fr.proxibanque.proxibanquev2.dao.CompteDao;
import fr.proxibanque.proxibanquev2.dao.Dao;
import fr.proxibanque.proxibanquev2.domaine.ClientEntreprise;
import fr.proxibanque.proxibanquev2.domaine.ClientParticulier;
import fr.proxibanque.proxibanquev2.domaine.Compte;



public class CompteDaoTest
{
	ClientDao cldao;
	CompteDao comptedao;
	Connection cnx;
	
	
	@Before
	public void initialisation()
	{
		System.out.println("Donnees Personne scenario ");
		comptedao= new CompteDao();
		cnx = Dao.seConnecter();
		cldao= new ClientDao();
	}
	
	@Test
	public void testComptesClient() {
		System.out.println("Test pour recuperer le nombre de compte d'un client");
		ClientEntreprise clientE = (ClientEntreprise) cldao.getClientByIdcli(12);
		List<Compte> listeCompte = comptedao.getComptesByIdcli(clientE);
		assertEquals(3,listeCompte.size());
	}
}
