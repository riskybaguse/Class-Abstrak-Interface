public interface PowerBank {
    int getBaterai();
    void setBaterai(int persen);
    String getNamaPerangkat();

    default void isiDaya(int bateraiAwal) {
        setBaterai(bateraiAwal); // Gunakan setter untuk mengatur baterai awal
        System.out.println("Baterai awal " + getNamaPerangkat() + " adalah: " + getBaterai() + "%");
        System.out.println(getNamaPerangkat() + " sedang mengisi daya...");

        setBaterai(100); // Set baterai jadi 100
        System.out.println("Baterai Penuh!");
        System.out.println("Baterai " + getNamaPerangkat() + " sekarang adalah: " + getBaterai() + "%");
    }
}
