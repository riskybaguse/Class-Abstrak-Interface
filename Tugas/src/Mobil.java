public class Mobil extends Kendaraan{
    @Override
    void identitasKendaraan(String namaKendaraan, int jumlahRoda) {
        System.out.println("Nama Kendaraan: " + namaKendaraan);
        System.out.println("Jumlah roda: " + jumlahRoda);
    }
    @Override
    void caraMengemudi() {
        System.out.println("Cara mengemudi mobil:");
        System.out.println("Pegang setir, masukkan kopling, lalu injak gas!!");
    }
}
