Este proyecto automatiza el proceso de reserva en la página de Despegar.com utilizando las siguientes herramientas:

- **Lenguaje**: Java
- **Proyecto**: Maven
- **Framework de ejecución**: JUnit con Serenity
- **Framework de pruebas**: Selenium con Cucumber
- **Navegador**: Chrome
- **Arquetipo**: Page Object Model (POM)

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

despegar-automation
│
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── automated
│ │ │ └── qa
│ │ │ └── pages
│ │ │ ├── HomePage.java
│ │ │ ├── SearchResultsPage.java
│ │ │ ├── BookingPage.java
│ │ │ └── PaymentPage.java
│ │ └── resources
│ ├── test
│ │ ├── java
│ │ │ └── com
│ │ │ └── automated
│ │ │ └── qa
│ │ │ └── tests
│ │ │ ├── BookingTest.java
│ │ │ ├── StepDefinitions.java
│ │ │ └── TestRunner.java
│ │ └── resources
│ │ └── features
│ │ └── booking.feature
│
├── pom.xml
└── README.md

### Prerrequisitos

Asegúrate de tener instalados los siguientes software:

- **Java 11 o superior**
- **Maven 3.6.3 o superior**
- **Chrome y ChromeDriver**

### Configuración del Proyecto

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu-usuario/despegar-automation.git
   cd despegar-automation
Configura los drivers automáticamente al compilar el proyecto. Esto se hace automáticamente cuando ejecutas Maven.

Puedes configurar detalles adicionales, como la ruta del ChromeDriver, en el archivo application.properties ubicado en src/main/resources.

Ejecución de las Pruebas
Para ejecutar las pruebas automatizadas, usa el siguiente comando:

bash
Copiar código
mvn clean verify
Este comando ejecutará todas las pruebas y generará un reporte detallado en target/site/serenity.

Características de la Automatización
Selección aleatoria de características: La automatización permite seleccionar aleatoriamente entre Alojamiento, Vuelos o Paquetes.
Filtrado por precio: Se selecciona un resultado cuyo precio esté por debajo de un presupuesto específico.
Diligenciamiento de datos: Todos los campos obligatorios para la reserva y el pago son diligenciados automáticamente.
Frameworks y Librerías: El proyecto utiliza Serenity y Cucumber para facilitar la escritura y ejecución de pruebas.
Desarrollo
HomePage.java: Contiene los métodos para interactuar con la página principal de Despegar.
SearchResultsPage.java: Gestiona la interacción con los resultados de búsqueda.
BookingPage.java: Contiene los métodos para diligenciar la información de reserva.
PaymentPage.java: Gestiona los datos de pago con tarjeta de crédito.
BookingTest.java: (Opcional) Clase que puede ser utilizada para pruebas directas.
TestRunner.java: Ejecuta todas las pruebas definidas en los archivos .feature.
StepDefinitions.java: Contiene la implementación de los pasos en Gherkin.
Recomendaciones
Personaliza los datos en el archivo application.properties según tu entorno de ejecución.
Asegúrate de actualizar el ChromeDriver si Chrome se actualiza en tu máquina.
Contribuciones
Las contribuciones son bienvenidas. Puedes crear un fork de este repositorio, hacer tus cambios, y enviar un pull request.

### Desglose

- **Introducción**: Describe el propósito del proyecto y las tecnologías utilizadas.
- **Estructura del Proyecto**: Muestra la estructura de carpetas y archivos para facilitar la navegación.
- **Prerrequisitos**: Lista el software necesario para ejecutar el proyecto.
- **Configuración del Proyecto**: Instrucciones para clonar el repositorio y configurar el entorno.
- **Ejecución de las Pruebas**: Cómo ejecutar las pruebas automatizadas y generar informes.
- **Características de la Automatización**: Resumen de las capacidades de automatización implementadas.
- **Desarrollo**: Detalles sobre las clases principales y sus funciones.
- **Recomendaciones**: Consejos útiles para personalizar y mantener el proyecto.
- **Contribuciones**: Explicación de cómo contribuir al proyecto.
- **Licencia**: Indicación sobre la licencia del proyecto.
