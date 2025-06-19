package com.example.myapplication

fun main(){

}

fun ifVoto(edad:Int){
    if(edad >= 18){
        println("La persona puede realizar su voto")
    }else{
        println("La persona no puede votar")
    }
}

fun comparaNumeros(num1:Int, num2: Int){
    if (num1 > num2){
        println("numero 1 es mayor")
    }else if (num2 > num1){
        println("numero 2 es mayor")
    }else{
        println("Los numeros son iguales")
    }
}

fun numeroPositivo(num:Int){
    if (num > 0){
        println("El numero es positivo")
    }
}


fun notaAlumno(nota: Int){
    val notaFinal = nota
    val calificacion = when (notaFinal){
           in 1..5 -> "Reprobado"
           in 6..7 -> "Regular"
           in 8..9 -> "Bueno"
           in 9..10 -> "Aprobado"
           else -> "Nota no valida"
    }
}

fun cicloUnoACien(){
    for (i in 1..100){
        println(i)
    }
}

fun whileContador(){
    var numero = 1
    while(numero < 50){
        println(numero)
        numero++
    }
}

fun cicloDoWhileIntentos(){
    var turno = 1
    do{
        turno++
    } while (turno <= 5)
}

fun Mostrararreglo(){
    val animales = arrayOf("gato", "perro", "caballo")
    for (i in animales){
        println(i)
    }
}

fun mostrarLista(){
    val numeros = listOf(1,2,3,4,5)
    for (i in numeros){
        println(i)
    }
}

