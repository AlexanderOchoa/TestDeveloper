# TestDeveloper

### Content
- [Descripción](#markdown-header-descripcion)  
- [Comunicación con otros proyectos](#markdown-header-comunicacion-con-otros-proyectos)
- [Pre-requisitos para correr la aplicación](#markdown-header-pre-requisitos-para-correr-la-aplicacion)   
- [Construido con](#markdown-header-construido-con)
- [Endpoints](#markdown-header-endpoint-expuestos)

----------

### Descripción
El proyecto permite:

Obtener los artículo recientes de Java en la fuente Hacker News.

----------

### Comunicación con otros proyectos
- Se invoca a la api "hn.algolia.com" para obtener la data.

----------

### Pre-requisitos para correr la aplicación
- Tener instalada la verión de Java 8.
- Descargar las fuentes de GitHub.
- Descargar las dependencias (Maven, mvn clean install).
- Correr el proyecto.

----------

### Construido con
* ***Java 1.8 (spring boot 2.0.5.RELEASE)*** - Lenguaje base de toda la aplicación
	* ***RestTemplate***: Clase de Spring para peticiones HTTP (Comunicación con API's externas)
* ***Maven*** - Gestor de dependencias

----------

### Endpoint expuestos

- Obtener todos los artículos: (GET) http://localhost:8081/v1/articles
- Obtener los artículos por autor: (GET) http://localhost:8081/v1/articles/javajosh