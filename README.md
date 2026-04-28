# distribuidora-alimentos-APK

Hola! Este es el repositorio de mi proyecto para la Semana 6. El objetivo fue desarrollar una aplicación nativa en Android que solucione la gestión de accesos y logística para una distribuidora, integrando servicios en la nube y cálculos de precisión.

🚀 Lo que logré implementar:

- Autenticación Real con Firebase: Diseñé una pantalla de Login que utiliza el SDK de Firebase para validar usuarios mediante correo y contraseña. Como puedes ver en los archivos, integré el google-services.json directamente en el módulo de la app para asegurar la conexión con el backend.

- Infraestructura de Datos: Configuré una RealTime Database. Aunque el sistema está listo para escalar, ya dejé el "puente" construido entre el código Kotlin y la base de datos en tiempo real.

- Compilación Exitosa: Superé los errores de dependencias depurando el proyecto, lo que me permitió generar el APK final de 5,7 MB que es totalmente instalable.

📁 Guía de archivos en este Repo:

- MainActivity.kt: El cerebro de la app donde está la lógica del login y los cálculos.
- google-services.json: El archivo de identidad que vincula esta app con mi proyecto en la consola de Firebase.
- build.gradle.kts: Aquí configuré todas las librerías necesarias para que Android Studio reconozca los servicios de Google.
