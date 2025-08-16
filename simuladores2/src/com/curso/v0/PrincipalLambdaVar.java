package com.curso.v0;

public class PrincipalLambdaVar {

}

class LambdaScopeExample {

    public static void main(String[] args) {
        // Variable declarada en el ámbito de 'main' (ámbito envolvente)
        
        String message = "Hola desde fuera!";
        int outerVariable = 10;

        // --- Ejemplo 1: Intento de redeclarar una variable del ámbito envolvente (CAUSA ERROR DE COMPILACIÓN) ---
        // Descomenta el siguiente bloque para ver el error de compilación
        
        Runnable invalidLambda = () -> {
            // ERROR DE COMPILACIÓN: 'outerVariable' ya está definida en el ámbito envolvente.
            // No puedes declararla de nuevo como una variable local dentro de la lambda.
            //int outerVariable = 20; // Esto daría un error de compilación
            System.out.println("Dentro de la lambda inválida: " + outerVariable);
        };
        invalidLambda.run();
        //int outerVariable = 10;
        //outerVariable = 20;
        // --- Ejemplo 2: Uso válido de una variable del ámbito envolvente (Variable 'effectively final') ---
        // Las lambdas pueden acceder a variables locales del ámbito envolvente
        // siempre y cuando sean 'final' o 'effectively final' (no se modifiquen después de su inicialización).
        Runnable validLambda1 = () -> {
            System.out.println("Lambda válida 1: Accediendo a outerVariable = " + outerVariable);
            System.out.println("Lambda válida 1: Accediendo a message = " + message);
        };
        validLambda1.run();
        System.out.println("---");

        // --- Ejemplo 3: Declaración de una nueva variable DENTRO de la lambda con un nombre diferente ---
        // Esto es perfectamente válido porque 'innerVariable' no existe en el ámbito envolvente.
        Runnable validLambda2 = () -> {
            int innerVariable = 50; // Esta es una nueva variable, local a esta lambda.
            System.out.println("Lambda válida 2: innerVariable = " + innerVariable);
            // Todavía podemos acceder a 'outerVariable' si es necesario
            System.out.println("Lambda válida 2: Accediendo también a outerVariable = " + outerVariable);
        };
        validLambda2.run();
        System.out.println("---");

        // --- Ejemplo 4: Parámetros de la lambda (que son nuevas variables locales para la lambda) ---
        // Los parámetros de la lambda son como nuevas declaraciones de variables,
        // y deben tener nombres únicos *dentro del contexto de los parámetros y el cuerpo de la lambda*
        // Y no pueden chocar con variables del ámbito envolvente.
        MyFunctionalInterface adder = (a, b) -> {
            // int outerVariable = 30; // Si intentaras esto, también sería un error de compilación
            return a + b + outerVariable; // 'a' y 'b' son nuevas variables locales para esta lambda
        };
        System.out.println("Resultado del adder (a=5, b=7, outerVariable=10): " + adder.add(5, 7));
        System.out.println("---");

        // --- Ejemplo 5: Otro intento inválido con un parámetro de lambda que colisiona (CAUSA ERROR DE COMPILACIÓN) ---
        // Descomenta el siguiente bloque para ver el error de compilación
        /*
        MyFunctionalInterface problematicAdder = (outerVariable, b) -> { // ERROR DE COMPILACIÓN: 'outerVariable' ya definida
            return outerVariable + b;
        };
        */
    }
}

// Interfaz funcional para el ejemplo 4
@FunctionalInterface
interface MyFunctionalInterface {
    int add(int num1, int num2);
}
