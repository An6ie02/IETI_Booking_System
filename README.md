# IETI_Booking_System
## Proyecto de curso en IETI: Servicios Web RESTful con Java y Spring Boot

## Primera parte: Implementando mi primer servicio con Spring Boot y Java :smile:

Imagen que evidencia el funcionamiento de la aplicación: ✅

![Test](./img/image.png)/

## Segunda parte: Implementando el controlador y servicio de API REST para la aplicación de reservas de laboratorios

Se realizó la implementación de los métodos de la API REST para la aplicación de reservas de laboratorios. Se implementaron los métodos de POST, GET, PUT y DELETE para la creación, consulta, actualización y eliminación de usuarios. A continuación se muestra el funcionamiento de cada uno de los métodos:

* 💡 Creación de un usuario:
![post](./img/image-1.png)
* 🔍 Consulta de todos los usuarios:
![get](./img/image-2.png)
* 🔍 Consulta de un usuario por su id:
![getid](./img/image-4.png)
* 🔍 Consulta de un usuario no existente:
![getnotid](./img/image-3.png)
* 🔄 Actualización de un usuario: 
![put](./img/image-5.png)
* ⛔ Eliminación de un usuario no existente:
![deletenot](./img/image-6.png)
* ⛔ Eliminación de un usuario:
![delete](./img/image-7.png)
⛔ Prueba de que se elimino el usuario:
![getfinish](./img/image-8.png)

## Tercera Parte: Implementando la capa de persistencia con Spring Data MongoDB 📚

Se ha hecho la configuración requerida para poder conectar el proyecto a MongoDB: Crear cluster, usuario con acceso a la base de datos, configurar el archivo application.properties con las credenciales de acceso a la base de datos.
* Creación de el usuario: 👤\
![CreateUser](/img/image-9.png)\
Luego de implementar el documento users y repositorios para almacenar los datos en MongoDB se obtiene el siguiente resultado:
* Se crearon 2 usuarios en la base de datos: 👥✅\
![UsersRegisters](./img/image-10.png)
* Se consultaron los usuarios de la base de datos: ✅\
![DBUsers](./img/image11.png)

## Autor 🔆

* **Angie Natalia Mojica** [Perfil GitHub](https://www.linkedin.com/in/angienataliamojica/)