# miniProyectTaskGestor

Este es un gestor de tareas muy básico desarrollado en Java y ejecutado desde consola. Su propósito principal es servir como punto de partida para un proyecto más completo que irá evolucionando con nuevas funciones.

## Estado actual del proyecto

El programa ya permite:

- Agregar tareas indicando cuántas se desean.
- Evitar agregar tareas vacías.
- Mostrar una lista numerada de las tareas ingresadas.
- Utiliza un menú simple con opciones (1) Agregar tarea, (2) Mostrar tareas, (3) Salir.

Se resolvió un problema con el `Scanner` que dejaba caracteres pendientes en el buffer (`nextLine()`).

## Próximas tareas por implementar

- Manejo de excepciones.
- Validar entradas del usuario (por ejemplo, no permitir letras donde se espera un número).
- Agregar prioridades a las tareas.
- Almacenar las tareas como objetos (crear una clase `Task`).
- Guardar tareas en archivos.
- Crear una interfaz gráfica o migrar a Spring Boot (en el futuro).

## Estructura actual

- `TaskGestor`: clase principal con los métodos `addTask()`, `showTasks()` y `taskMenu()`.

---

El objetivo es seguir mejorando este programa paso a paso mientras se aprende más sobre programación orientada a objetos en Java
