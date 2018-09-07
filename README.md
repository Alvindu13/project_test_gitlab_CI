# Projet *Standard* <small>(*Remplacer par numéro ou sujet du TP*)</small>

- Année : **M1 iWOCS**
- Matière: *matière*
- TP : *numéro ou sujet du TP*

# Auteur(s)

|Nom|Prénom|
|--|--|
*Nom 1er auteur* | *Prénom 1er auteur*|
*Nom 2eme auteur* | *Prénom 2eme auteur*|


## User Story

- *Quels sont les fonctionnalités apportées par ce projet ?*
- *A remplacer avec la description de votre projet.*

Ce projet une une base pour la réalisation de TP et projets dans différentes matières en informatique.

Ses principales fonctionnalités sont :

- Gestion de la compilation et des dépendances avec Maven (on peut utiliser [Maven Wrapper](https://github.com/takari/maven-wrapper) et la commande `mvnw` pour s'assurer de la compatibilité)
- Framework de tests configuré pour tester les fonctionnalités du projet avec JUnit (voir les exemple dans `src/test/...`).
- Exécution des tests avec maven `./mvnw test`
- Intégration continue avec GitLab (voir fichier `.gitlab-ci.yaml`)

## Usage 

*Comment utiliser ce projet ?*

En utilisant maven on peut compiler et exécuter les tests du projet.

```sh
./mvnw clean compile test
```





This template is based on the  [`junit5-jupiter-starter-maven`](https://github.com/junit-team/junit5-samples/tree/r5.3.0/junit5-jupiter-starter-maven) project demonstrator.

Please note that this project uses the [Maven Wrapper](https://github.com/takari/maven-wrapper).
Thus, to ensure that the correct version of Maven is used, invoke `mvnw` instead of `mvn`.