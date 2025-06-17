public class Main {
    public static void main(String[] args) {
        PowerBank smartPhone = new Smartphone();
        PowerBank tabGadget = new TabGadget();

        System.out.println("=".repeat(58));
        System.out.println("-".repeat(12) + " Program Power Bank Pengisian Daya" + "-".repeat(12));
        System.out.println("=".repeat(58));
        System.out.println();

        System.out.println("=".repeat(20) + " SMARTPHONE " + "=".repeat(20));
        smartPhone.isiDaya(30);
        System.out.println();

        System.out.println("=".repeat(20) + " TAB GADGET " + "=".repeat(20));
        tabGadget.isiDaya(15);
        System.out.println();

    }
}