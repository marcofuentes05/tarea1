class radio (private var onoff: Boolean= false, //false para apagado y true para encendido
             private var frecuencia:Boolean = true, //true para FM, false para AM
             private var volumen: Int =10,
             private var estacion: Double=87.0,
             private var estado: Boolean = false){

    fun getFrecuencia(): Boolean {
        return frecuencia
    }
    fun getVolumen():Int{
        return volumen
    }
    fun getEstacion():Double{
        return estacion
    }


    fun encender(){
        estado = true
    }
    fun apagar (){
        estado = false
    }
    fun cambiarFrecuencia(){
        if (frecuencia==true){
            frecuencia = false
        }else{
            frecuencia = true
        }
    }
    fun subirVolumen(){
        volumen = volumen + 5
    }
    fun bajarVolumen(){
        volumen = volumen - 5
    }
    fun subirEstacion(){

    }


}