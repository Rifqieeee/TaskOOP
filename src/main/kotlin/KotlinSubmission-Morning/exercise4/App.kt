package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    checkMyCar()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun checkMyCar() {

    val car = listOf(
        "Mazda",
        "Civic",
        "Mustang",
        "Alphard",
        "Fortuner",
        "Dodge Charger"
    )
        try {
            println(car[10])
        } catch (e:Exception) {
            println("Index tidak ditemukan")
        }
}