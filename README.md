# heroku-spring
Para poder utilizar el servicio Cargado en la nube de Heroku por favor consumir los servicios de la siguiente URL: https://sucospp-desarrolladores.herokuapp.com/

Los servicios se desarrollaron con la ayuda de listas, las mismas que se utilizan para modificar, crear, eliminar y listar los datos de los desarrolladores.

El Desarrollo consta de tres capas las cuales son: La capa de controller la cual contiene la clase RestControl que se encarga de crear los servicios Rest para poder ser consumidos.

La capa de repository la cual contiene las clases que se encargan de realizar los almacenamientos y procesar la data. La capa de service que se encarga de hacer los llamados
a los repositorios, en este caso se utilizaron solo para esto ya que no se requería realizar ningún tipo de operacion con la data.

Se creó un Objeto llamado persona el mismo que contiene toda la informacion del desarrollador y es utilizado en la capa repositorio para poder obtener los diferentes
campos que lo componen.

# Uso de servicios. 
Los servicios se consumen tal cual dice el pdf del ejercicio enviado, por ejemplo: 
#GET lista todos los desarrolladores en formato JSON 
URL= https://sucospp-desarrolladores.herokuapp.com/developers

#POST 
URL=https://sucospp-desarrolladores.herokuapp.com/developers
JASON ENVIADO { "id":11, "nombre": "Juan Torres", "tecnologia": ["php","java"], "linkgit": "Juangmail.com" }
ingresa el usuario con identificador 11, nombre Juan Torres, tecnología php y java, además del link de git Juanmail.com 
el sistema valida que no se ingresen desarrolladores con id iguales y que los tipos de datos sean correctos

#PUT 
URL= https://sucospp-desarrolladores.herokuapp.com/developers/12 
JASON ENVIADO  { "id":12, "nombre": "Juan Torres", "tecnologia": ["php","java"], "linkgit": "Juangmail.com" }

En este caso se modifica el cliente de identificador 12 con los nuevos datos, este método se podría usar sin la necesidad de agregar el
identificador a la URL pero como en las especificaciones del ejercicio estaba el identificador en la URL, se desarolló de esa manera.
Tambien valida la existencia del cliente.

#DELETE 
URL= https://sucospp-desarrolladores.herokuapp.com/developers/12 
En este caso se envía el identificador en la URL y se elimina el desarrollador. Valida la existencia del cliente.


# Dockerfile
El dockerfile contiene la descripcion de los comantos en el propio archivo.
Para poder crear la imagen se ejecuta el comando en la consola de docker

docker build -t java-develop   C:\Users\SUCOSPP\Desktop\heroku\registrar-desarrolladores-spring

java-develop es el nombre de la imagen por lo que puede ser cambiado  y el path C:\Users\SUCOSPP\Desktop\heroku\registrar-desarrolladores-spring es la ubicacion del dockerfile
que siempre debe estar en la raiz del proyecto.

Una vez creada la imagen se debe correr con lo cual ejecutamos el siguiente comando:
docker run -d -p 9000:8080 java-develop

el puerto 9000 es el puerto local el cual puede cambiarse y el puerto 8080 es el expuesto de la imagen por lo que se debe mantener.

Verificar que la imagen este corriendo con docker ps y esperar 5 minutos para que se compile el proyecto y corra en el contenedor.

Ingresar a un browser e ingresar al localhost:9000 y verificar que se ya se encuentra corriendo el servidor


