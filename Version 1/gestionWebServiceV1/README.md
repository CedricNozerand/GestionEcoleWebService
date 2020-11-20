# gestionWebService V1

Ce projet est le Webservice Restful contenant le dao du projet GestionEcole

## Prérequis

- JDK 8
- Maven 3.6.3
- Apache Tomcat 9 configuré sur le port 8080
- Les identifiant de votre base de données doivent être: login: "root" mot de passe: "" (vide).

## Installation

PARTIE BASE DE DONNEES 

Si vous avez déjà fait la partie BASE DE DONNEES de la section gestionWebClient V1 vous pouvez passer directement à la partie PROJET car celle ci est identique que la précédente.

1. Récupérez le fichier .sql présent à la racine du projet
2. Créez une base de données au nom de 'jpagestionensup'
3. A partir de cette nouvelle base de données, dans la section SQL, collez le contenu du fichier .sql que vous venez de récupérer.

PARTIE PROJET

Clonez le dépôt
1. Compilez le projet: Pour ce faire, rendez-vous à la racine du projet, ouvrez une invite de commande et tapez la commande mvn clean package.
2. Une fois le projet compilé, copier le fichier gestionWebServiceV1\web\target\web.war dans le dossier webapps de votre serveur Tomcat.
3. Lancer le serveur Tomcat à l'aide du fichier startup.bat.
4. Ouvrez un navigateur web et entrez l'adresse http://127.0.0.1:8080/web dans la barre d'URL pour accéder à l'application

Les identifiants de l'application sont:
- login: admin
- mot de passe: admin
