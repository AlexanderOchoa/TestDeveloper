# TestDeveloper

### Contenido
- [Description](#description) 
- [Dependencies](#dependencies) 
- [Pre-requisites to run the application](#prerequisitestoruntheapplication) 
- [Built with](#builtwith) 
- [Exposed endpoints](#exposedendpoints) 

----------
<div id='description'/>

### Description
The project allows:
Get the recent Java articles collected from the Hacker News source.

----------
<div id='dependencies'/>

### Dependencies
- The API "hn.algolia.com" is called to obtain the data

----------
<div id='prerequisitestoruntheapplication'/>

### Pre-requisites to run the application
- Have Java 8 version installed
- Download the sources from GitHub
- Download dependencies (Maven)
- Run the project

----------
<div id='builtwith'/>

### Built with
* ***Java 1.8 (spring boot 2.0.5.RELEASE)*** - Base language of the entire application
	* ***RestTemplate***: Spring class for HTTP requests (Communication with external API's)
* ***Maven*** - Dependency manager

----------
<div id='exposedendpoints'/>

### Exposed endpoints

- Get all items: (GET) http://localhost:8081/v1/articles
- Get articles by author: (GET) http://localhost:8081/v1/articles/javajosh