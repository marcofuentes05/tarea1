class radio (private var estado: Boolean= false, //false para apagado y true para encendido
             private var frecuencia:Boolean = true, //true para FM, false para AM
             private var volumen: Int =0,
             private var estacion: Double= 87.0){

    fun getEstado():String{
        var p: String
        if (estado == true){
            p = "Encendido"
        }else{
            p = "Apagado"
        }
        return p
    }
    fun getFrecuencia(): String {
        var a : String
        if (frecuencia==true){
            a="FM"
        }else{
            a= "AM"
        }
        return a
    }
    fun getVolumen():Int{
        return volumen
    }
    fun getEstacion():Double{
        return estacion
    }


    fun encenderApagar(){
        if(estado == true){
            estado = false
        }else if (estado == false){
            estado=true
        }
    }

    fun cambiarFrecuencia(){
        if (frecuencia==true){
            frecuencia = false
            estacion = 1000.0
        }else{
            frecuencia = true
            estacion = 87.0
        }
    }
    fun subirVolumen(){
        volumen = volumen + 5
    }
    fun bajarVolumen(){
        volumen = volumen - 5
    }
    fun subirEstacion(salto: Double){
        estacion = estacion + salto
    }
    fun bajarEstacion(salto: Double){
        estacion = estacion - salto
    }


}