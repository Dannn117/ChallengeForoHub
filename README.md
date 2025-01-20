# Foro Hub

Foro Hub es un proyecto que replica la funcionalidad de un foro utilizado en plataformas de aprendizaje. Esta API REST permite a los usuarios gestionar tópicos relacionados con cursos y proyectos. Desarrollada en Java utilizando Spring Framework, la API ofrece operaciones CRUD completas.

## Tecnologías Utilizadas

- **Java JDK 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Flyway Migration**
- **Maven**

## Requisitos Previos

- Java JDK 17 instalado.
- Maven configurado en el sistema.
- Servidor de base de datos MySQL en ejecución.

## Configuración del Entorno

### 1. Base de Datos MySQL

Crea la base de datos ejecutando el siguiente comando en tu cliente MySQL:

```sql
CREATE DATABASE foro_hub;
```

### 2. Configuración de `application.properties`

Edita el archivo `src/main/resources/application.properties` y configura los datos de conexión a la base de datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Instalación

1. Clona este repositorio:
   ```bash
   https://github.com/Dannn117/ChallengeForoHub.git
   ```
2. Accede al directorio del proyecto:
   ```bash
   cd foro-hub
   ```
3. Ejecuta el siguiente comando para instalar las dependencias:
   ```bash
   mvn install
   ```
4. Inicia la aplicación:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints de la API

### Crear un nuevo tópico

**POST** `/topicos`

#### Cuerpo de la solicitud:
```json
{
  "titulo": "Título del tópico",
  "mensaje": "Contenido del mensaje",
  "status": "ABIERTO",
  "autor": "Nombre del autor",
  "curso": "Nombre del curso"
}
```

### Listar todos los tópicos

**GET** `/topicos`

#### Respuesta:
```json
[
  {
    "id": 1,
    "titulo": "Título del tópico",
    "mensaje": "Contenido del mensaje",
    "fechaCreacion": "2025-01-14T10:00:00",
    "status": "ABIERTO",
    "autor": "Nombre del autor",
    "curso": "Nombre del curso"
  }
]
```

### Obtener un tópico específico

**GET** `/topicos/{id}`

#### Respuesta:
```json
{
  "id": 1,
  "titulo": "Título del tópico",
  "mensaje": "Contenido del mensaje",
  "fechaCreacion": "2025-01-14T10:00:00",
  "status": "ABIERTO",
  "autor": "Nombre del autor",
  "curso": "Nombre del curso"
}
```

### Actualizar un tópico

**PUT** `/topicos/{id}`

#### Cuerpo de la solicitud:
```json
{
  "titulo": "Nuevo título",
  "mensaje": "Nuevo contenido",
  "status": "CERRADO"
}
```

### Eliminar un tópico

**DELETE** `/topicos/{id}`

## Pruebas

Para probar la API, puedes usar herramientas como [Postman](https://www.postman.com/) o [cURL](https://curl.se/).

