# Java


## ¿Qué es una Variable en Java?

Una variable en Java es un contenedor de datos que almacena valores de datos durante la ejecución de un programa Java. A cada variable se le asigna un tipo de dato que designa el tipo y la cantidad de valor que puede contener. La variable es un nombre de ubicación de memoria de los datos. Las variables de Java tienen principalmente tres tipos: Local, Instancia y Estática.

Para usar una variable en un programa, necesitas realizar 2 pasos:

* **Declaración de Variable**
```
// ejemplo de declaracion de variables

int a, b, c;

float pi;

double d;

char a;
```
* **Inicialización de Variable**

```
// ejemplo de inicializacion correcta

pi = 3.14f;

do = 20.22d;

a = "hola";
```

## Tipos de variables

En Java, hay tres tipos de variables:

* Variables Locales
* Variables de Instancia
* Variables Estáticas

1) **Variables Locales**

Las variables locales son variables que se declaran dentro del cuerpo de un método.

2) **Variables de Instancia**

Las variables de instancia se definen sin la palabra clave STATIC. Se definen fuera de una declaración de método. Son específicas de objeto y se conocen como variables de instancia.

3) **Variables Estáticas**

Las variables estáticas se inicializan solo una vez, al inicio de la ejecución del programa. Estas variables deben inicializarse primero, antes de la inicialización de cualquier variable de instancia.

```
class MyFristClass {

    static int a = 1; //static variable  
    int data = 99; //instance variable  

    void method() {
        int b = 90; //local variable  
    }

}
```

## ¿Qué son los Tipos de Datos en Java?

Los tipos de datos en Java se definen como especificadores que asignan diferentes tamaños y tipos de valores que pueden almacenarse en la variable o un identificador. Java tiene un amplio conjunto de tipos de datos. Los tipos de datos en Java se pueden dividir en dos partes:

* **Tipos de Datos Primitivos:** Incluyen enteros, caracteres, booleanos y flotantes.
* **Tipos de Datos No Primitivos:** Incluyen clases, arreglos e interfaces.

1. tipos de datos primitivos: 
- byte
- short
- int
- long
- char
- float
- double
- boolean

## Casting de variables o Conversion de tipos

1) Una variable de menor capacidad se puede asignar a otra variable de mayor capacidad.

2) Una variable de mayor capacidad se puede asignar a otra variable de menor capacidad.

En tales casos, debes especificar explícitamente el operador de conversión de tipo. Este proceso se conoce como Conversión de Tipo. En caso de que no especifiques un operador de conversión de tipo, el compilador genera un error. Dado que esta regla es impuesta por el compilador, hace que el programador sea consciente de que la conversión que está a punto de realizar puede causar alguna pérdida de datos y evita pérdidas accidentales.

```
// ejemplo de casting
double d = 10;
int i;

i = (int) d;
```

### ejemplo practico de variables
```
class Demo {
	public static void main(String args[]) {
		byte x;
		int a = 270;
		double b = 128.128;
		System.out.println("int converted to byte");
		x = (byte) a;
		System.out.println("a and x " + a + " " + x);
		System.out.println("double converted to int");
		a = (int) b;
		System.out.println("b and a " + b + " " + a);
		System.out.println("\ndouble converted to byte");
		x = (byte)b;
		System.out.println("b and x " + b + " " + x);
 	}
}

// salida
int converted to byte
a and x 270 14
double converted to int
b and a 128.128 128

double converted to byte
b and x 128.128 -128
```

## Enum

Los enum sin un tipo de dato especial que una variable sea un conjunto de constantes predefinidas, debido a que son constantes, los nombres de los campos de tipo **enum** se deben definir en **mayusculas**.

Se debe usar tipos **enum** siempre que se necesite representar un conjunto fijo de constantes

```
publuc enum DiaSemanas {
    DOMINGO, LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO
}
```


## Condicionales

1) Utiliza ***if*** para especificar un bloque de código que se ejecutará si se cumple una condición determinada.
```
if (day == "Monday") // Condition
{
	// Decision
	System.out.println("Go to School");
}
```

2) Utiliza ***else*** para especificar un bloque de código que se ejecutará si la misma condición es falsa.
```
String myDay = "Llueve"

// Condition
if (myDay == "Soleado"){
	System.out.println("Go to School");
}
else {
	System.out.println("Don´t go to School");
}
```
3) Utiliza ***else if*** para especificar una nueva condición que se probará; si la primera condición es falsa.
```
String myDay = "nublado"


if (myDay == "Soleado") {
	System.out.println("Go to School");
}
else if(myDay == "nublado") {
	System.out.println("Maybe you can go to School");
}
else {
	System.out.println("Don´t go to School");
}
```
4) Utiliza ***switch*** para especificar muchos bloques alternativos de código que se ejecutarán.
La sentencia ***default*** se ejecutara cunado no haga mach con ningun caso
```
int myDay = 4;

switch (myDay) {
	case 1:
		System.out.println("Read in the Library");
		break;
	case 2:
		System.out.println("Read at Home");
		break;
	case 3:
		System.out.println("Read in the Garden");
		break;
	default:
		System.out.println("Get some Sleep");
		break;
}
```
5) Utiliza el operador ***?,:*** para especificar una condición de una sola línea.
```
// condicion ? expresión_si_verdadero : expresión_si_falso;

int edad = 19;

String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad"
```


## Bucles en Java

En la programación de computadoras, los bucles se utilizan para repetir un bloque de código. Por ejemplo, si deseas mostrar un mensaje 100 veces, en lugar de escribir el mismo código 100 veces, puedes usar un bucle.

En Java, hay tres tipos de bucles:

* **for**

1) La **inicializacion** inicializa y/o declara variables y se ejecuta solo una vez.

2) Se evalúa la **condición**. Si la **condición** es **verdadera**, se ejecuta el cuerpo del bucle for.

3) La **expresión** de actualización actualiza el valor de la expresión inicial "**inicializacion**".

4) Se evalúa nuevamente la condición. El proceso continúa hasta que la condición sea **falsa**.

```
// sintax
for (inicializacion; condicion; exprecion) {
    // body of the loop
}
```

```
// ejemplo
int n = 5;

for (int i = 1; i <= n; ++i) {
	System.out.println("Java is fun");
}

// salida
Java is fun
Java is fun
Java is fun
Java is fun
Java is fun
```

* **while**

1) un bloque de código repetidamente mientras se cumpla una determinada condición. Es decir, mientras la condición sea verdadera, el código dentro del bucle se ejecutará una y otra vez

```
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

* **do...while**

- un bloque de código al menos una vez y luego repetirlo mientras se cumpla una determinada condición. Es decir, el código dentro del bucle se ejecuta primero y después se verifica si la condición es verdadera para repetirlo

```
do {
  // Código a ejecutar
} while (condición);
```

1) Ejecución inicial: El código dentro del bloque do se ejecuta al menos una vez, sin importar si la condición es verdadera o falsa.

2) Verificación de la condición: Después de ejecutar el código, se evalúa la condición especificada en la cláusula while.

3) Repetición: Si la condición es verdadera, el código dentro del bloque do se vuelve a ejecutar y se vuelve a evaluar la condición. Este proceso continúa hasta que la condición sea falsa.

```
int numero;

do {
	System.out.println(i);
	i++;
} while (i <= 10);
```

