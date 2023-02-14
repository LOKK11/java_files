package elaimet;
abstract class Elain {
    private int svuosi;
    private String asuinmaa;
    private String vari;
    Elain(){}
    void liiku(){
        System.out.println("Liikehdintää.");
    }
    abstract String aantele();
    abstract String tervehdi();
    static String ruokaile(){
        return "Äpöst";
    }
    int getSvuosi() {
        return svuosi;
    } 
    void setSvuosi(int svuosi) {
        this.svuosi = svuosi;
    }
    String getAsuinmaa(){
        return asuinmaa;
    }
    void setAsuimaa(String asuinmaa) {
        this.asuinmaa = asuinmaa;
    }
    String getVari(){
        return vari;
    }
    void setVari(String vari) {
        this.vari = vari;
    }
}

class Koira extends Elain {
    Koira(){}
    String aantele(){
        return "Hau Hau!";
    }
    String tervehdi(){
        return "Woof woof lääh lääh!";
    }
    void liiku(){
        System.out.println("Koira käveleepi.");
    }
}

class Hevonen extends Elain {
    Hevonen(){}
    String aantele(){
        return "Ihahaa!";
    }
    String tervehdi(){
        return "Yo wassup cuh?";
    }
    void liiku(){
        System.out.println("Hevonen laukkaa.");
    }
    static String ruokaile() {
        return "Äpöst bruh!";
    }
    String ihanOmaMetodi(){
        return "Jesse, Timo, Lokki, Joonas, Joonatan, Niko";
    }
}
