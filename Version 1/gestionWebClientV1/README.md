# gestionWebClient V1
Ce projet est le client du WebService contenant le site web du projet GestionEcole

## Prérequis

- JDK 8
- Maven 3.6.3
- Apache Tomcat 9 configuré sur le port 8080
- Serveur de base de données installé

## Installation

PARTIE BASE DE DONNEES

1. Récupérez le fichier .sql présent à la racine du projet
2. Créez une base de données au nom de 'jpagestionensup'
3. A partir de cette nouvelle base de données, dans la section SQL, collez le contenu du fichier .sql que vous venez de récupérer.

PARTIE PROJET

Clonez le dépôt
1. Compilez le projet: Pour ce faire, rendez-vous à la racine du projet, ouvrez une invite de commande et tapez la commande mvn clean package.
2. Une fois le projet compilé, copier le fichier gestionWebClientV1\webclient\target\webclient.war dans le dossier webapps de votre serveur Tomcat.
3. Lancer le serveur Tomcat à l'aide du fichier startup.bat.
4. Ouvrez un navigateur web et entrez l'adresse http://127.0.0.1:8080/webclient dans la barre d'URL pour accéder à l'application
