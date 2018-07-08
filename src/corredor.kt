package main
import radio
fun main(args:Array<String>){
    var radio = radio()
    var frec: String
    if (radio.getFrecuencia().toString()=="true"){
        frec = "FM"
    }else{
        frec = "AM"
    }
    println("Frecuencia: $frec")
}