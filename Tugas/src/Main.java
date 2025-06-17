public class Main {
    public static void main(String[] args) {
        // Ini adalah definisi var untuk kebutuhan kelas Abstract
        Kendaraan kendaraan;
        Mobil mobil = new Mobil();
        Motor motor = new Motor();


        System.out.println("=".repeat(51));
        System.out.println("-".repeat(12) + " Program Kendaraan Beraksi " + "-".repeat(12));
        System.out.println("=".repeat(51));
        System.out.println();

        System.out.println("=".repeat(10) + " Mobil Beraksi Cuy " + "=".repeat(10));
        kendaraan = mobil;
        kendaraan.identitasKendaraan("mobil",4);
        kendaraan.caraMengemudi();
        System.out.println();

        System.out.println("=".repeat(10) + " Motor Beraksi Cuy " + "=".repeat(10));
        kendaraan = motor;
        kendaraan.identitasKendaraan("motor",2);
        kendaraan.caraMengemudi();
        System.out.println();



    }
}