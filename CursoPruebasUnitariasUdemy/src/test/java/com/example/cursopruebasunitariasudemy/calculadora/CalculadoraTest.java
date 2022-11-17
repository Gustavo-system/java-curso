package com.example.cursopruebasunitariasudemy.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach // Se ejecuta siempre antes de cada metodo, es importante el orden
    public void setUp(){ // nombre descriptivo para el before
        System.out.println("@BeforeEach => setUp()");
        calculadora = new Calculadora();
    }

    @AfterEach // Se ejecuta despues de cada metodo Test
    public void tearDown(){
        // se ejecuta para liberar recursos o alguna actividad despues de cada metodo
        System.out.println("@AfterEach => tearDown()");
        calculadora = null;
    }

    @Test // todos nuestros test debe llevar la etiqueta @Test
    public void calculatorNotNullTest(){
        System.out.println("@Test => calculatorNotNullTest()");
        assertNotNull(calculadora, "Calculadora no instanciado, es null"); // se pude agregar un mensaje al assert
    }

    /**
     * Tipos de assert
     * -> una buena practica es tener un assert por método, si un assert falla el resto de codigo ya no se ejecuta
     * assertEquals();      -> comprobamos que sea igual en valor
     * assertTrue();        -> comprobamos que sea True
     * assertNull();        -> comprobamos que sea null
     * assertNotNull();     -> comprobamos que no sea null
     * assertSame();        -> comprobamos si son los mismo objetos
     * assertNotSame();     -> comprobamos que no sean los mismo objetos
     */

    @Test
    public void calculadoraSumarTest(){

        // 1. incializamos valores que se requieran -> setUp()
        double resultadoEsperado = 30.0;
        double resultadoActual;
        // 2. acctions
        resultadoActual = calculadora.sumar(20.0, 10.0);
        // 3. Assets
        assertEquals(resultadoEsperado, resultadoActual, "El resultado no es el esperado");
        System.out.println("@Test => calculadoraSumarTest() " + resultadoActual);
    }

    @Test
    public void calculadoraSumarVarianteTest(){
        double resultadoEsperado = 30.0;
        double resultadoActual;
        resultadoActual = calculadora.sumar(20.3, 10.0);
        System.out.println("@Test => calculadoraSumarVarianteTest() " + resultadoActual);
        assertEquals(resultadoEsperado, resultadoActual, 0.5, "El resultado esta fuera del rango permitido");
    }

    @Test
    public void calculadoraRestarTest(){
        System.out.println("@Test => calculadoraRestarTest() " + calculadora.restar(20, 10));
        assertEquals(10, calculadora.restar(20, 10));
    }

    @Test
    public void calculadoraMultiplicarTest(){
        System.out.println("@Test => calculadoraMultiplicarTest()");
        assertEquals(10, calculadora.multiplicacion(2, 5));
    }

    @Test
    public void calculadoraDivicionTest(){
        System.out.println("@Test => calculadoraDivicionTest()");
        assertEquals(50, calculadora.divicion(100, 2), "El resultado no es el esperado");
    }

    @Test
    public void calculadoraDivicionPorCeroTest(){
        System.out.println("@Test => calculadoraDivicionPorCeroTest()");
        assertThrows(ArithmeticException.class, ()->calculadora.divicion(2.0, 0.0), "No se puede dividir entre 0");
    }

}