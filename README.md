<h1 align="center"> Conversor de Monedas en Java</h1>

<p align="center">
   Proyecto desarrollado como parte del programa ONE (Oracle Next Education) + Alura Latam
</p>

---

##  Descripción del Proyecto

Este proyecto es un **conversor de monedas en Java** que permite al usuario realizar conversiones entre distintas divisas utilizando **tasas de cambio en tiempo real**, obtenidas a través de la **ExchangeRate API**.

La aplicación funciona mediante una **interfaz textual en consola**, donde el usuario puede seleccionar opciones numéricas, ingresar un monto y obtener el valor convertido de manera precisa.

---

##  Estado del Proyecto

 Proyecto finalizado  
 Funcional y listo para demostración

---

##  Funcionalidades

- Menú interactivo en consola
- Conversión entre monedas:
  - USD ↔ ARS
  - USD ↔ BRL
  - USD ↔ COP
- Consumo de API externa con `HttpClient`
- Procesamiento de JSON con Gson
- Validación de opciones del usuario
- Opción para salir del programa

---

##  Demostración

Ejemplo de ejecución en consola:
Sea bienvenido/a al Conversor de Moneda =]

Dólar >> Peso argentino

Peso argentino >> Dólar

Dólar >> Real brasileño

Real brasileño >> Dólar

Dólar >> Peso colombiano

Peso colombiano >> Dólar

Salir

Ingrese una opción: 1
Ingrese el monto a convertir: 25

Resultado: 25.00 USD = 20293.75 ARS

## Cómo ejecutar el proyecto

- Abre el proyecto en IntelliJ IDEA

- Asegúrate de usar Java 17 o superior

- Agrega tu API KEY de ExchangeRate en la clase Menu

- Ejecuta la clase Principal

 ## Tecnologías Utilizadas

- Java 17

- IntelliJ IDEA

- Gson

- HttpClient (Java estándar)

- ExchangeRate API

- Git & GitHub


## Referencias

- ExchangeRate API Documentation

- Artículo: Cómo escribir un README increíble en GitHub – Alura Latam

- Documentación oficial de Java
