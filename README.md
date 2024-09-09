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

