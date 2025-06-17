public class TabGadget implements PowerBank{
    int baterai;

    @Override
    public int getBaterai() {
        return baterai;
    }

    @Override
    public void setBaterai(int persen) {
        this.baterai = persen;
    }

    @Override
    public String getNamaPerangkat() {
        return "Tab Gadget";
    }
}