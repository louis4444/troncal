# troncal

Servidor utilizado : tomcat 9.0
java : jdk 1.8

Base de datos: empresa

Tablas: administradores, clientes, ordenadores


Usado Model MVC 
Vista = jsf
Controlador = spring 
Modelo= jpa

el proyecto tiene dos archivos beans uno administra clientes y administradores y el otro solo los ordenadores
los beans se encargan de comunicarse con los xhtml..


tiene tres clases de datos jpa Administradores, Clientes, Ordenadores uno de ellos serializable los otros dos no 

tiene un .java empresaservice la cual se llama desde el beans 
que se encarga de las conexiones a la base de datos.

tiene 6 xhtmls llamados home, index, pcsauto, correcto, error, editar .. la cual tiene
estilos utilizados son primefaces, jsf, jquery y css bootstrap

Plugins necesarios del eclipse marketplace 

Jboss tools, Spring tools, payara tools (opcional)

se crea un maven project en el eclipse con archetype quick-start

se especifica en el pom.xml las libererias necesarias 

en el web-inf se crean los archivos que ayudaran a la vista

en el web.xml se pone la pagina de indice ademas de especificar el faces y el mapping de los archivos.. por ejemplo nosotros ponemos .xhtml ademas de otros parametros necesarios para la vista

en el aplication.context se pone el tipo de enlace a utilizar para conectarse a la base de datos en nuestro caso es eclipse link pero se puede cambiar al gusto.
