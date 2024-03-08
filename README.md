# Proyecto-2: Gestion de un hotel
Grupo conformado por Maria Daniela Cuervo, Anabella Jaua y Alexandra Lecuna
Correr el archivo Main para iniciar el programa

El problema: Un reconocido Hotel de la Ciudad ha contratado a su equipo de trabajo para construir un sistema en Java para la administración de las reservas.  El sistema deberá implementar una solución con uso eficiente de los recursos del computador.  

Requerimientos funcionales:

- Registro de clientes. El usuario podrá conocer los clientes que actualmente se encuentran hospedados en el hotel; para lo cual se deberá introducir el apellido del cliente y el nombre, para luego obtener el número de la habitación en la que se encuentra alojado. La solución para tal requerimiento deberá tener una complejidad en tiempo lo más cercano posible a O(1).
  
- Búsqueda de reservación: Dada la cédula de identidad del cliente, el recepcionista podrá conocer los datos de la reservación, en caso de existir.  La solución para tal requerimiento deberá tener una complejidad en tiempo de O(log N). Deberá utilizar un ABB.
  
- Historial de habitación: dado el número de una habitación, el sistema emitirá una lista de los clientes que alguna vez se hospedaron en ella.  La solución para tal requerimiento deberá tener una complejidad en tiempo lo más cercano a O(log N). Deberá utilizar un ABB.
  
- Check-in: Un cliente con reservación llega para comenzar su estadía. En ese momento, el recepcionista le asignará una habitación, de manera que la reservación pasa al registro de los huéspedes del hotel.
  
- Check-out: Al terminar su estadía, el recepcionista cierra el registro del cliente, quedando libre la habitación y actualizándose el historial de la habitación utilizada.

  
Requerimientos Técnicos:
- La solución debe ser implementada con base en la utilización de tablas de dispersión y ABB. Puede, sin embargo, utilizar otros TDA auxiliares.
- La aplicación debe ofrecer una interfaz gráfica al usuario.
- Al comenzar el sistema, los datos de las reservaciones, de los huéspedes y del histórico de las habitaciones debe cargarse automáticamente. En una hoja de cálculo podrá encontrar la información requerida para cumplir con este requerimiento: datos

