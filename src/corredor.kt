package main
import radio
fun main(args:Array<String>){

    var radio = radio()
    var frec: String
    var estado:String
    var estacion:Double
    var volumen:Int

    estado = radio.getEstado()
    frec = radio.getFrecuencia()
    estacion = radio.getEstacion()
    volumen = radio.getVolumen()


    var control : Boolean = true
    do{
        println(imprimirMenu(estado, frec, estacion, volumen))
        println("¿Que opción deseas ingresar?")

        var respuesta: String = readLine()!!
        if (respuesta == "1") {
            radio.encenderApagar()
            estado = radio.getEstado().toString()
        } else if (respuesta == "2") {
            radio.cambiarFrecuencia()
            frec = radio.getFrecuencia()
            estacion = radio.getEstacion()
        } else if (respuesta == "3") {
            if (volumen < 95) {
                radio.subirVolumen()
                volumen = radio.getVolumen()
            }

        } else if (respuesta == "4") {
            if (volumen >= 5) {
                radio.bajarVolumen()
                volumen = radio.getVolumen()
            }
        } else if (respuesta == "5") {
            if (frec == "AM") {
                if (estacion <= 1399.9) {
                    radio.subirEstacion()
                }
            } else if (frec == "FM") {
                if (estacion <= 103.9) {
                    radio.subirEstacion()
                }
            }
            estacion = radio.getEstacion()
        } else if (respuesta == "6") {
            if (frec == "AM") {
                if (estacion >= 100.1) {
                    radio.bajarEstacion()
                }
            } else if (frec == "FM") {
                if (estacion >= 87.1) {
                    radio.bajarEstacion()
                }
            }
            estacion = radio.getEstacion()
        } else if (respuesta == "7") {
            control = false
        } else {
            println("Ese no es un dato valido, intentalo de nuevo...")
        }

    }while (control)
    println("Hasta luego!")


}

fun imprimirMenu(estado: String, frec: String, estacion: Double, volumen: Int): String {
    return """
     -------------------------------------
    |                                     |
    |             $estado                 |
    |           Frecuencia: $frec            |
    |           Estación: $estacion            |
    |           Volumen: $volumen                |
    |                                     |
     -------------------------------------

    1 para apagar/encender
    2 para cambiar de frecuencia AM/FM
    3 para subir 5 de volumen
    4 para bajar 5 de volumen
    5 para subir 0.1 de estacion
    6 para bajar 0.1 de estacion
    7 para salir
"""
}