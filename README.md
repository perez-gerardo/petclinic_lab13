# PetClinic CI Lab

Aplicación Spring Boot de PetClinic configurada para Integración Continua (CI) con Jenkins, Maven y GitHub.

## Tecnologías

- Java 17
- Spring Boot 3.5.6
- Maven
- Jenkins
- MySQL

## Información del Proyecto

- **GroupId**: `com.miempresa`
- **ArtifactId**: `petclinic-ci-lab`
- **Versión**: `0.0.1-SNAPSHOT`
- **Paquete base**: `com.miempresa.petclinicci`

## Requisitos

- Java 17
- Maven 3.8+
- MySQL 8.0+
- Jenkins

## Ejecutar el Proyecto

```bash
mvn clean install
mvn spring-boot:run
```

## Tests

```bash
mvn test
```

## Pipeline Jenkins

El proyecto incluye un `Jenkinsfile` configurado para Windows con las siguientes etapas:

1. Checkout
2. Build
3. Test
4. Package

## Autor

Gerardo
