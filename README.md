PROGRAMACIÓN II - TRABAJO PRÁCTICO 8: INTERFACES Y EXCEPCIONES EN JAVA

Este repositorio contiene las soluciones para el Trabajo Práctico 8, enfocado en el uso de interfaces y manejo de excepciones en Java, reforzando la modularidad, flexibilidad y robustez del código en aplicaciones orientadas a objetos.

Objetivos y Temas Clave

El trabajo se divide en dos grandes partes, cada una con ejercicios prácticos para consolidar los conceptos:

1. Interfaces en un sistema de E-commerce

Interfaz Pagable: Definición de contratos de comportamiento común (calcularTotal()).

Clases Producto y Pedido: Implementación de interfaces y cálculo de totales.

Múltiples interfaces de pago: Pago y PagoConDescuento, con métodos procesarPago(double) y aplicarDescuento(double).

Notificaciones de cambios: Interfaz Notificable para que los clientes reciban avisos sobre cambios de estado en pedidos.

2. Ejercicios sobre Excepciones

División segura: Manejo de ArithmeticException al dividir por cero.

Conversión de cadena a número: Manejo de NumberFormatException al convertir texto a entero.

Lectura de archivo: Manejo de FileNotFoundException al abrir un archivo inexistente.

Excepción personalizada: Creación de EdadInvalidaException y manejo de edades fuera del rango 0-120.

Try-with-resources: Lectura de archivo usando BufferedReader con manejo de IOException.

Estructura del Proyecto

El código está organizado en paquetes y clases según la funcionalidad de cada caso práctico:

Paquete / Caso: interfaces
Clases Principales: Pagable, Producto, Pedido, Pago, PagoConDescuento, Notificable, Cliente
Conceptos Demostrados: Implementación de interfaces, herencia múltiple de comportamiento

Paquete / Caso: excepciones
Clases Principales: Division, Conversion, LeerArchivo, EdadInvalidaException, VerificarEdad
Conceptos Demostrados: Manejo de excepciones checked y unchecked, excepciones personalizadas, try-catch, try-with-resourcesConclusiones Esperadas

Comprender la utilidad de las interfaces para lograr diseños desacoplados y reutilizables.

Aplicar herencia múltiple mediante interfaces para combinar comportamientos.

Utilizar correctamente estructuras de control de excepciones para evitar caídas del programa.

Crear excepciones personalizadas para validar reglas de negocio.

Aplicar buenas prácticas como try-with-resources y uso del bloque finally para manejar recursos y errores.

Reforzar el diseño robusto y mantenible mediante la integración de interfaces y manejo de errores en Java.