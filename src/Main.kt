fun main(args: Array<String>)
{
    println("Hello Kotlin!")

    println(suma_v1(54,57))
    println(suma_v2(23,45))
    suma_v3(54,12)
    suma_v4(34,62)

    Variables_only_for_reading()
    Variables_can_be_changed()
}

fun suma_v1(a: Int, b: Int): Int
{
    return a + b
}

fun suma_v2(a: Int, b: Int) = a + b

fun suma_v3(a: Int, b: Int): Unit
{
    println(a + b)
}

fun suma_v4(a: Int, b: Int)
{
    println(a + b)
}

// Funcționează, dar rezultatul este 1
fun Variables_only_for_reading(): Unit
{
    val a = 1
    val b: Int  = 1
    val c: Int
    c = 1
    c + b + a

    println(c)
}

// Funcția nu a dat o eroare și rezultatul este 30 în loc de 60.
fun Variables_can_be_changed(): Unit
{
    var a = 10
    var b: Int  = 20
    var c: Int
    c = 30
    c += b + a

    println(c)
}

