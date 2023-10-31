/**
 * Kelas Kubus digunakan untuk menghitung volume sebuah kubus.
 */
public class Kubus {

    /**
     * Menghitung volume kubus berdasarkan panjang sisi.
     *
     * @param sisi Panjang sisi kubus.
     * @return Volume kubus yang dihitung.
     */
    public double hitungVolume(double sisi) {
        // Menghitung volume kubus: V = sisi^3
        double volume = Math.pow(sisi, 3);
        return volume;
    }

    /**
     * Metode utama untuk menjalankan program dan menampilkan hasil perhitungan volume kubus.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        double sisiKubus = 5.0; // Ganti dengan panjang sisi kubus yang diinginkan.
        Kubus kubus = new Kubus();
        double volume = kubus.hitungVolume(sisiKubus);

        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volume);
    }
}
