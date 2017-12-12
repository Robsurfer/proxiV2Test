*********************


	************************************
*****  	Description de l'application:   	*****
	************************************
ProxiBanqueSI est une application Web destin�e aux conseillers de
ProxiBanque. Elle leur permet d'effectuer des op�rations relatives 
� la gestion de leurs clients et de leurs comptes.

Apr�s une page d'authentification o� le conseiller rentre ses identifiants 
(cf. liste ci-dessous), le conseiller arrive sur une page d'accueil o�
il peut visualiser en un coup d'oeil ses clients particulier et entreprise.
Il peut ensuite rechercher parmi ses clients et s�lectionner un client
sur lequel effectuer une des op�rations suivantes : modifier les informations,
voir les comptes, effectuer un virement.
L'utilisateur peut choisir de se d�connecter � tout moment via l'onglet de la barre
de navigation, dans le coin sup�rieur droit.

Selon l'option choisie, le conseiller est redirig� vers une page lui permettant
de r�aliser l'op�ration.

S'il choisit la modification des informations, un formulaire pr�-rempli sera �
compl�ter ou � modifier, puis, apr�s validation, le ram�nera vers la page d'accueil o� il
pourra observer ses modifications.

S'il choisit la page de visualisation des comptes, il pourra observer l'�tat des
comptes du client ainsi que leur d�tail (decouvert autoris� ou taux de r�mun�ration selon le type de compte.

S'il choisit de r�aliser un virement, apr�s remplissage et validation du
formulaire, le virement sera r�alis� et les comptes mis � jour en cons�quence.
Si le compte �metteur n'a pas de solde suffisant, une erreur est renvoy�e � l'utilisateur
et le virement n'est pas effectu�.
Un historique des virements r�alis�s est en base de donn�es.

Compte conseiller rentr�s en base de donn�es :

Login / Mot de passe
********************
pdupond / toto
jfontaine / tutu
rhoareau / titi
psanchez / tata   <---- Nous vous conseillons d'utiliser ce compte pour profiter de l'ensemble des fonctionnalit�s. 
						Il contient la liste de client la plus fournis.
pierre.sanchez / tyty


Exemple de client avec un compte d�biteur et depuis lequel on ne peut pas faire de virement :
Lucien VIGOT, sous la responsabilit� du conseiller ayant le login psanchez.

	************************************
	Pr�requis
	************************************

Installation Java Runtime Environment 8.
Installation de Apache Tomcat v8.5.23
Installation de Oracle DataBase 11g Express Edition
Installation de Google Chrome Version 62.0.3202.94 de pr�f�rence, pour profiter de toute l'ergonomie de l'application.

	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'doc/'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:

*****Construction de la base de donn�es******

1) Lancez l'application "Run SQL Command Line" de Oracle DataBase 11g Express Edition

2) Si le mot de passe du le compte et le mot de passe respectivement renseign�s lors de l'installation de la base Oracle n'est pas system et bourne,
	ouvrez le fichier proxibanquev2.sql dans un �diteur de texte et remplacez la ligne 
	"connect system/bourne" par "connect [votre identifiant admin oracle]/[votre mot de passe admin]" suivi de votre mot de passe system.
	Enregistrez le sql.

3) Tapez "start " puis glissez-d�posez le fichier proxibanqueV2.sql et appuyez sur entree. Votre base de donn�es est pr�te.

****Configuration du serveur*****

4) Rendez-vous dans le dossier o� Apache Tomcat est install�. Le nom du dossier devrait �tre "apache-tomcat-8.5.23".

5) Rendez-vous dans le dossier "conf" puis ouvrez le ficher server.xml dans un �diteur de texte.

6) Recherchez et remplacez le terme "8080" par "8081" (Ctrl+H dans NotePad++ et dans Bloc-Notes, par exemple)
afin de modifier le port utilis� par TomCat. Enregistrez et quittez.

***D�ploiement de l'application****

7) Copiez le fichier ProxibanqueV2.war que vous avez t�l�charg�, et collez le dans le dossier webapps de TomCat.

8) Rendez-vous dans le dossier "bin" de TomCat. Lancez TomCat en double-cliquant sur le fichier startup.bat.

***Utilisation de l'application****

9) Via votre navigateur internet, Google Chrome de pr�f�rence pour mieux profiter de tout l'ergonomie de l'application, 
rendez-vous sur localhost:8081/ProxibanqueV2/

10) Authentifiez-vous et profitez de l'application.
	
