*********************


	************************************
*****  	Description de l'application:   	*****
	************************************
ProxiBanqueSI est une application Web destinée aux conseillers de
ProxiBanque. Elle leur permet d'effectuer des opérations relatives 
à la gestion de leurs clients et de leurs comptes.

Après une page d'authentification où le conseiller rentre ses identifiants 
(cf. liste ci-dessous), le conseiller arrive sur une page d'accueil où
il peut visualiser en un coup d'oeil ses clients particulier et entreprise.
Il peut ensuite rechercher parmi ses clients et sélectionner un client
sur lequel effectuer une des opérations suivantes : modifier les informations,
voir les comptes, effectuer un virement.
L'utilisateur peut choisir de se déconnecter à tout moment via l'onglet de la barre
de navigation, dans le coin supérieur droit.

Selon l'option choisie, le conseiller est redirigé vers une page lui permettant
de réaliser l'opération.

S'il choisit la modification des informations, un formulaire pré-rempli sera à
compléter ou à modifier, puis, après validation, le ramènera vers la page d'accueil où il
pourra observer ses modifications.

S'il choisit la page de visualisation des comptes, il pourra observer l'état des
comptes du client ainsi que leur détail (decouvert autorisé ou taux de rémunération selon le type de compte.

S'il choisit de réaliser un virement, après remplissage et validation du
formulaire, le virement sera réalisé et les comptes mis à jour en conséquence.
Si le compte émetteur n'a pas de solde suffisant, une erreur est renvoyée à l'utilisateur
et le virement n'est pas effectué.
Un historique des virements réalisés est en base de données.

Compte conseiller rentrés en base de données :

Login / Mot de passe
********************
pdupond / toto
jfontaine / tutu
rhoareau / titi
psanchez / tata   <---- Nous vous conseillons d'utiliser ce compte pour profiter de l'ensemble des fonctionnalités. 
						Il contient la liste de client la plus fournis.
pierre.sanchez / tyty


Exemple de client avec un compte débiteur et depuis lequel on ne peut pas faire de virement :
Lucien VIGOT, sous la responsabilité du conseiller ayant le login psanchez.

	************************************
	Prérequis
	************************************

Installation Java Runtime Environment 8.
Installation de Apache Tomcat v8.5.23
Installation de Oracle DataBase 11g Express Edition
Installation de Google Chrome Version 62.0.3202.94 de préférence, pour profiter de toute l'ergonomie de l'application.

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

*****Construction de la base de données******

1) Lancez l'application "Run SQL Command Line" de Oracle DataBase 11g Express Edition

2) Si le mot de passe du le compte et le mot de passe respectivement renseignés lors de l'installation de la base Oracle n'est pas system et bourne,
	ouvrez le fichier proxibanquev2.sql dans un éditeur de texte et remplacez la ligne 
	"connect system/bourne" par "connect [votre identifiant admin oracle]/[votre mot de passe admin]" suivi de votre mot de passe system.
	Enregistrez le sql.

3) Tapez "start " puis glissez-déposez le fichier proxibanqueV2.sql et appuyez sur entree. Votre base de données est prête.

****Configuration du serveur*****

4) Rendez-vous dans le dossier où Apache Tomcat est installé. Le nom du dossier devrait être "apache-tomcat-8.5.23".

5) Rendez-vous dans le dossier "conf" puis ouvrez le ficher server.xml dans un éditeur de texte.

6) Recherchez et remplacez le terme "8080" par "8081" (Ctrl+H dans NotePad++ et dans Bloc-Notes, par exemple)
afin de modifier le port utilisé par TomCat. Enregistrez et quittez.

***Déploiement de l'application****

7) Copiez le fichier ProxibanqueV2.war que vous avez téléchargé, et collez le dans le dossier webapps de TomCat.

8) Rendez-vous dans le dossier "bin" de TomCat. Lancez TomCat en double-cliquant sur le fichier startup.bat.

***Utilisation de l'application****

9) Via votre navigateur internet, Google Chrome de préférence pour mieux profiter de tout l'ergonomie de l'application, 
rendez-vous sur localhost:8081/ProxibanqueV2/

10) Authentifiez-vous et profitez de l'application.
	
