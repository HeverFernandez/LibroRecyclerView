package pe.edu.ilp.appcoleccionlibro

class LibroProvider {

    companion object{
        var libros = listOf<Libro>(
            Libro("Fundamentos de Kali Linux","2010","Latse De la Vega","https://hfg.com/kali.png"),
            Libro("DataBase administrator","2008","Joanes Hullman","https://hfg.com/kali.png"),
            Libro("Kotlin desde cero","2021","Rafael de la fuente vega","https://hfg.com/kali.png"),
            Libro("Fundamento de Java Developer","2015","Patricia Romero","https://hfg.com/kali.png"),
            Libro("Sistemas operativos","2000","Carmen Hurtado","https://hfg.com/kali.png"),
            Libro("Redes neuronales","2015","Futsi Funysshin","https://hfg.com/kali.png"),
        )
    }
}