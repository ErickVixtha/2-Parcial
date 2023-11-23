package Clases

class Koopa:
    Enemigo("Koopa", 2){
    override fun collision(collider: String) {
        //super.collision(collider)
        when(collider){
            "Weapon" -> {
                var state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemigo" -> changeDirection()
        }
        println("Usando la colisión de la clase Enemy")
    }
}