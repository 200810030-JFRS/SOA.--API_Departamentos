# SOA.--API_Departamentos
API.-Departamentos de la asignatura de Arquitectura Orientada a Objetos.
# API-Departamento — Proyecto SOA

## 1. Descripción del proyecto

API-Departamento es un proyecto desarrollado para la asignatura de Arquitectura Orientada a Servicios (SOA). Su objetivo es exponer servicios mediante una API REST para gestionar la información correspondiente al dominio de departamentos y sus recursos asociados.

El proyecto utiliza Java y Spring Boot para implementar la lógica del servidor, Spring Data JPA para el acceso a datos y MySQL como sistema de gestión de bases de datos.

**Estado del proyecto:** [En desarrollo / Funcional, según las pruebas realizadas].

## 2. Funcionalidades

- Consulta y gestión de clientes, según las operaciones implementadas.
- Consulta y gestión de propiedades, según las operaciones implementadas.
- Persistencia de información en MySQL.
- Exposición de endpoints HTTP para la comunicación con el cliente.
- Pruebas funcionales mediante Postman.

> Documentar únicamente las funcionalidades implementadas y verificadas.

## 3. Tecnologías utilizadas

- Java: [versión instalada].
- Spring Boot: [versión del proyecto].
- Maven: administración de dependencias y ejecución.
- MySQL: almacenamiento de datos.
- Spring Data JPA / Hibernate: persistencia de información.
- Postman: pruebas de los endpoints.
- Git y GitHub: control de versiones y publicación del código.
- Visual Studio Code: entorno de desarrollo.

## 4. Requisitos previos

- Java compatible con la versión de Spring Boot del proyecto.
- MySQL instalado y en ejecución.
- Git, si se desea clonar el repositorio.
- Postman para realizar las pruebas.
- Maven instalado o Maven Wrapper incluido en el proyecto.

## 5. Instalación y ejecución

### 5.1 Clonar el repositorio

```bash
git clone [URL_DEL_REPOSITORIO]
cd [CARPETA_DEL_PROYECTO]
```

### 5.2 Crear la base de datos

En MySQL, ejecutar:

```sql
CREATE DATABASE IF NOT EXISTS departamento;
```

### 5.3 Configurar las variables de entorno

Configurar las siguientes variables antes de iniciar el servidor:

- `DB_URL`: URL JDBC de la base de datos.
- `DB_USERNAME`: usuario de MySQL.
- `DB_PASSWORD`: contraseña del usuario de MySQL.

Ejemplo de URL local:

`jdbc:mysql://localhost:3306/departamento?useSSL=false&serverTimezone=UTC`

No publicar credenciales reales en el repositorio.

### 5.4 Ejecutar el proyecto

En Windows PowerShell, desde la carpeta raíz del proyecto:

```powershell
$env:DB_URL="jdbc:mysql://localhost:3306/departamento?useSSL=false&serverTimezone=UTC"
$env:DB_USERNAME="root"
$env:DB_PASSWORD="root1234"

.\mvnw.cmd spring-boot:run

Si no se incluye Maven Wrapper, utilizar `mvn spring-boot:run` con Maven instalado.

El puerto y la dirección definitivos deben comprobarse en la configuración y los registros de inicio de Spring Boot.

## 6. Variables de entorno

| Variable | Descripción |
|---|---|
| `DB_URL` | Dirección JDBC de MySQL. |
| `DB_USERNAME` | Usuario de la base de datos. |
| `DB_PASSWORD` | Contraseña de la base de datos. |

## 7. Endpoints de la API

Método	Endpoint	Descripción	Cuerpo de la Petición (Body / JSON)
GET	/api/clientes	Obtiene la lista completa de todos los clientes registrados.	
GET	/api/clientes/{id}	Consulta la información de un cliente específico según su ID.	
POST	/api/clientes	Registra un nuevo cliente en la base de datos.	Ver JSON de ejemplo abajo
PUT	/api/clientes/{id}	Actualiza la información de un cliente existente por su ID.
DELETE	/api/clientes/{id}	Elimina el registro de un cliente de la base de datos.	

Método Endpoint DescripciónCuerpo de la Petición (Body / JSON)
GET/api/propiedadesObtiene la lista completa de todas las propiedades registradas.
GET/api/propiedades/{id}Consulta la información de una propiedad específica por su ID.
POST/api/propiedadesRegistra una nueva propiedad en el sistema.
PUT/api/propiedades/{id}Actualiza la información de una propiedad existente.
DELETE/api/propiedades/{id}Elimina una propiedad de la base de datos.

## 8. Ejemplos de peticiones y respuestas

### Ejemplo de consulta GET

**Petición:** `[MÉTODO Y URL REAL]`

**Respuesta HTTP:** `[CÓDIGO REAL]`

```json
[PEGAR AQUÍ LA RESPUESTA JSON REAL DE POSTMAN]
```

### Ejemplo de creación POST

**Petición:** `[MÉTODO Y URL REAL]`

**Body → raw → JSON:**

```json
[PEGAR AQUÍ UN JSON VÁLIDO SEGÚN EL MODELO]
```

**Respuesta HTTP:** `[CÓDIGO REAL]`

```json
[PEGAR AQUÍ LA RESPUESTA REAL DEL SERVIDOR]
```

## 9. Pruebas realizadas

Las pruebas se ejecutan mediante Postman y deben documentar los resultados reales de cada operación.

- Consulta de recursos existentes.
- Creación de registros.
- Actualización y eliminación, si están implementadas.
- Validación de solicitudes incorrectas.
- Consulta de identificadores inexistentes.
- Verificación de persistencia en MySQL.

Los resultados y códigos HTTP se completarán después de ejecutar las pruebas.

## 10. Base de datos

**Motor:** MySQL  
**Base de datos:** bd_departamento

Las tablas y sus relaciones deben corresponder a los modelos y a la configuración JPA del proyecto.


Proyecto académico desarrollado para la asignatura de Arquitectura Orientada a Servicios (SOA).
