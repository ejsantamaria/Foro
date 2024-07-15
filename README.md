
# Foro alira

## Descripción

Este proyecto es una bibliteca desarrollado en Java 17 con el uso de Maven, Spring Boot con JPA, Loombook, Jackson, MySQL, spring boot security, flywaydb.

Para visualizar de manera gráfica los resultados se hizo uso del programa postaman.

## Características

- CRUD de topicos o temas para un foro
- CRUD de usuarios y perfiles
- CRUD de cursos
- CRUD de respuestas

## Requisitos

- Java 17
- Maven
- Spring boot Framework
- MySQL

## Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/ejsantamaria/Foro.git
   cd Foro
   ```

## Uso


1. **Interacción con el programa:**

   El programa mostrará un menú de opciones para poder interactuar.

   Capturas de pantalla de la interfaz en consola:
   
   Ejemplo 1: 

   ![Captura 1](https://github.com/ejsantamaria/Foro/blob/main/Documentation/Capture1.png)

   Ejemplo 2:

   ![Captura 2](https://github.com/ejsantamaria/Foro/blob/main/Documentation/Capture2.png)

   Ejemplo 3:
   
   ![Captura 3](https://github.com/ejsantamaria/Foro/blob/main/Documentation/Capture3.png)

  
   
## Estructura del Proyecto

```plaintext
ConversorMoneda/
├── .idea/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── edu/
│   │   │       └── alura/
│   │   │           └── alura/
│   │   │               ├── ForoApplication.java
│   │   │               ├── controller/
│   │   │               ├── entity/
│   │   │               ├── repository/
│   │   │               └──service/
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
│       └── java/
├── target/
├── .gitignore
└── pom.xml
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, haga un fork del repositorio y envíe un pull request con sus cambios.


## Contacto

Para preguntas o soporte, por favor contacte a [ejsantamaria.cu@gmail.com].
