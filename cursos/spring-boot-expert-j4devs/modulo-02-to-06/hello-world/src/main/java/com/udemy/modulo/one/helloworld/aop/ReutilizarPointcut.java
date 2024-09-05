package com.udemy.modulo.one.helloworld.aop;

import org.aspectj.lang.annotation.Pointcut;

public class ReutilizarPointcut {



    /**
     * Todas las formas de implementar pointcuts
     * @Pointcut("within(com.udemy.modulo.one.helloworld.aop.*)") aplica en los paquetes
     * @Pointcut("within(com.udemy.modulo.one.helloworld.aop..*)") aplica sobre todos los sub paquetes
     * @Pointcut("within(TarjetObject)") aplica solo para una clase siempre y cuando este en el mismo paquete
     * @Pointcut("within(InterfaceName+)")  se aplica para todas las clases que hereden de esa interfaz
     * @Pointcut("@annotation(CoustomAnnotation)") se aplica solo para las clases que tengan esa anotacion
     */

    /**
     * Esta clse se crea para reutilizar el los aspectos en caso de que llegue a cambiar uno solo se modifique en una sola clase y se aplique en todos lo metodos
     * @Pointcut("execution(* com.udemy.modulo.one.helloworld.aop.TarjetObject.*(..))")
     */
    @Pointcut("@annotation(CoustomAnnotation)")
    public void tarjetObjectReutilizandoPointcut () {}
}
