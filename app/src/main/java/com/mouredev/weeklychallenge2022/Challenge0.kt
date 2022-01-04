package com.mouredev.weeklychallenge2022

/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    (1..100).forEach { println(fizzbuzz(it)) }
}

/**
 * Recibe un entero
 * Si es multiplo de 3 devuelve 'fizz'
 * Si es multiplo de 5 devuelve 'buzz'
 * Si es multiplo de ambos devuelve 'fizzbuzz'
 * Si no es multiplo de ninguno devuelve el entero como string
 */
fun fizzbuzz(number: Int): String {
    // Realizo un shifteo de 1 bit a la izquierda que equivale a multiplicar por 2 del resultado de si es multiplo de 3
    return when(multipleOf3or5(number)){
        3 -> "fizzbuzz"             // 1 + 1*2
        2 -> "fizz"                 // 0 + 1*2
        1 -> "buzz"                 // 1 + 0*2
       	else -> number.toString()   // 0 + 0*2
    }
    // Tenia ganas de complicarla un poco jeje
}

fun multipleOf3or5(n: Int): Int = isMultipleOf(n, 5) + isMultipleOf(n, 3).shl(1)

// Devuelve 1 si 'n' es multiplo de 'm' y 0 si no lo es
fun isMultipleOf(n: Int, m: Int): Int = if(n % m == 0) 1 else 0