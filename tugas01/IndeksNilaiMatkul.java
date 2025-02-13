fun main() {
    val input = "25"
    val indeksNilai = IndeksNilaiMatkul()
    val hasilIndeks = indeksNilai.hitungIndeks(input)
    println("$hasilIndeks")
}
​
class IndeksNilaiMatkul {
    fun hitungIndeks(nilai: String): String {
        if (nilai.isBlank()) {
            return "Nilai harus diisi!"
        }
​
        val nilaiAkhir = nilai.toDoubleOrNull()
        if (nilaiAkhir == null || nilaiAkhir !in 0.0..100.0) {
            return "Nilai diluar jangkauan!"
        }
​
        return when {
            nilaiAkhir in 80.0..100.0 -> "A"
            nilaiAkhir in 70.0..79.9 -> "AB"
            nilaiAkhir in 60.0..69.9 -> "B"
            nilaiAkhir in 50.0..59.9 -> "BC"
            nilaiAkhir in 40.0..49.9 -> "C"
            nilaiAkhir in 30.0..39.9 -> "D"
            nilaiAkhir in 0.0..29.9 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}