# programacion2-taller-sesion4

Se diseñó e implementó un sistema de nómina aplicando el concepto de herencia en Programación Orientada a Objetos. Se creó la clase padre Empleado, que contiene los atributos y métodos comunes a todos los empleados del INTEP (cédula, nombre, dependencia, resumen y cálculo de pago). A partir de ella se desarrollaron las clases hijas Docente y Administrativo, cada una con atributos y comportamientos específicos. Además, se utilizó sobrescritura de métodos (@Override) para que cada tipo de empleado calcule su pago mensual de forma diferente, evitando la duplicación de código y aprovechando la reutilización mediante extends y super.

preguntas A
1	Aplique la prueba del «es un» a su jerarquía: escriba las dos frases que la justifican. Luego escriba una frase con las mismas clases que no tenga sentido, y explique por qué esa relación sería incorrecta. (4 pts)
R// un Docente es un Empleado y un Administrativo es un Empleado. «Un Empleado es un Docente» no siempre es cierto, porque también puede ser administrativo.
2	Explique qué hace la línea super(cedula, nombre, dependencia); en su código y por qué debe ir en la primera línea del constructor. (4 pts)
R// llama al constructor de Empleado para inicializar cédula, nombre y dependencia. Va primero porque Java exige construir la parte heredada antes que la parte propia.
3	Los atributos de la clase padre quedaron en protected y no en private. Explique qué habría pasado si los dejaba en private, y cuál es la alternativa que evitaría usar protected. (4 pts)
R// permite acceso directo desde las hijas. Con private no podrían acceder; la alternativa es mantener private y usar getters.
4	Explique para qué sirve la anotación @Override y qué error concreto le evita a usted como programador. (3 pts)
R// indica que se redefine un método heredado. Evita errores como escribir mal el nombre o cambiar los parámetros sin querer.
5	En su método resumen() de las clases hijas usted llamó a super.resumen(). Explique qué gana el programa frente a escribir otra vez el texto del padre. (3 pts)
R// reutiliza el texto común, evita duplicación y hace que un cambio en el padre se refleje en las hijas.
¿Qué diferencia hay entre sobrescribir (override) y sobrecargar (overload)? Dé un ejemplo de cada uno tomado de su propio código o del curso. (2 pts)
 R// misma firma en padre e hija, por ejemplo calcularPagoMensual(). Overload: mismo nombre con parámetros distintos, por ejemplo mostrar() y mostrar(String titulo).
