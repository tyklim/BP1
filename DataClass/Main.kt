fun main() {
    val a : Human = Human("Tery")
    val b : Human = Human("Kaleb")

    a.email = "tery@gmail.com"
    a.address = "Condongcatur, Sleman, Yogyakarta"

    b.email = "kaleb@yahoo.com"
    b.address = "Klitren, Yogyakarta"

    a.talk()
    b.talk()

    a.introduce()
    b.introduce()

    println(a.verify("tery@gmail.com"))

    println(Lim.name)

    val c : Lim = Lim
    println(c.nationality)
}
