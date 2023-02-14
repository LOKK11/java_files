package elaimet;
public class DynDemo_Main {
    public static void main(String[] args) {
        Koira tessu = new Koira();
        Hevonen loscad = new Hevonen();
        Elain sesse = new Koira();
        Elain markku = new Hevonen();
        
        System.out.println(tessu.aantele());
        System.out.println(loscad.aantele());
        System.out.println(sesse.aantele());
        System.out.println(markku.aantele());

        System.out.println(tessu.tervehdi());
        System.out.println(loscad.tervehdi());
        System.out.println(sesse.tervehdi());
        System.out.println(markku.tervehdi());

        tessu.liiku();
        loscad.liiku();
        sesse.liiku();
        markku.liiku();

        System.out.println(Koira.ruokaile());
        System.out.println(Hevonen.ruokaile());
        System.out.println(Elain.ruokaile());
        System.out.println(Elain.ruokaile());

        System.out.println(loscad.ihanOmaMetodi());
    }
}