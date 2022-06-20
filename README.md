Exercice : Blu-Ray STORE

Introduction :
Le gérant d’un magasin de vente de Blu-Ray souhaite développer une application permettant de
gérer (à distance) son stock de Blu-Ray.
Pour développer son application, nous allons commencer par créer notre première entité métier,
notre premier service métier et notre premier repository.

Expression générale du besoin
Cette application disposera d'une console Web d'administration qui permettra à
un administrateur de gérer :
- le stock de films
- les informations concernant chaque film proposés
Un film étant représenté par un JavaBean ayant pour propriétés :
- Un titre
- Un nombre d’exemplaires
- Un genre
- Un acteur principal du film
- (Éventuellement les autres acteurs du film)
Configuration du projet
Avant de réaliser notre application, nous allons expérimenter l'architecture cible autour de l'entité
métier « Movie ».
Vous allez créer un projet Java / Maven à l'aide de IntelliJ Community et Java 17.

Le triplet Maven identifiant le projet sera le suivant :
- artifactId : core
- groupId : com.mycompany.bluraystore
- version : 1.0-SNAPSHOT

Première entité métier :
Avant de réaliser concrètement notre application, nous allons expérimenter l'architecture cible
autour de l'entité métier « Movie ».

L'entité métier « Movie » sera matérialisée par une classe java
com.mycompany.bluraystore.entity.Movie au format JavaBean ayant pour l'instant des propriétés
simples :
- title (String)
- genre (String)

Premier service métier :
Créer un nouveau sous-package nommé service et une méthode registerMovie(Movie movie).

Premier repository :
Ajoutez maintenant un sous-package repository et une méthode add (Movie movie).

Exécution :
Pour tester l'ensemble nous allons modifier la classe App qui devrait déjà être présente dans
votre projet. Elle doit disposer d'une méthode main.
Dans cette méthode main on effectuera les opérations suivantes :
1. Demander à l'utilisateur de saisir le titre et le genre du film à ajouter
2. Instancier un film en lui affectant le titre et le genre
3. Instancier MovieService
4. Exécuter la méthode registerMovie