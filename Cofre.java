package cofre;

enum Moeda {
    M10(0.10, 1),
    M25(0.25, 2),
    M50(0.50, 3),
    M100(1.00, 4);

    double valor;
    int volume;

    Moeda(double valor, int volume) {
        this.valor = valor;
        this.volume = volume;
    }

    public String toString() {
        return "Valor: " + valor + " Volume: " + valor;
    }
}

class Item {
    String descricao;
    int volume;

    Item (String descricao, int volume) {
        this.descricao = descricao;
        this.volume = volume;
    }
}

public class Cofre {
    String itens;
    double valor;
    int volume;
    int volumeMax;
    boolean estaQuebrado = false;
    
    Cofre(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    void addMoeda(Moeda moeda){
    if(estaQuebrado == false){
        if(moeda == Moeda.M10){
            this.valor += 0.10;
            this.volume += 1;
        }
        if(moeda == Moeda.M25) {
            this.valor += 0.25;
            this.volume += 2;
        }
        if(moeda == Moeda.M50) {
            this.valor += 0.50;
            this.volume += 3; 
        }
        if(moeda == Moeda.M100) {
            this.valor += 0.100;
            this.volume += 4;
        }
    }
    else {
        System.out.println("vixe, tá quebrado");
    }
}

    void addItem(Item item){
    if(estaQuebrado == false){
        this.descrição = descricao;
        this.volume += volume; 
    }
    else {
        System.out.println("vixe, tá quebrado");
    }
}

    void quebrar(){
    if(estaQuebrado != true) {
        estaQuebrado = true;
    }
    else {
        System.out.println("vixe, já tá quebrado");
    }
}

    void pegarMoedas(){
    if(estaQuebrado == true){
        this.valor = null;
    }
    else {
        System.out.println("puts, quebra antes kk");
    }
}

    void pegarItens(){
    if(estaQuebrado == true){
        this.itens = null;
        }
    else {
        System.out.println("puts, quebra antes kk");
    }
}

    public String toString() {
        return "Itens: " + itens + " Valor: " + valor + " Volume: " + volume + "/" + this.volumeMax + " Quebrado?: " + estaQuebrado;
    }

    public static void main(String[] args) {
        Cofre porco = new Cofre(20);
        System.out.println(porco); //I:() M:0 V:0/20 EQ:false
        porco.addMoeda(Moeda.M10);
        porco.addMoeda(Moeda.M50);
        System.out.println(porco); //I:() M:0.6 V:4/20 EQ:false

        porco.addItem(new Item("ouro", 3));
        System.out.println(porco); //I:(ouro) M:0.6 V:7/20 EQ:false

        porco.addItem(new Item("passaporte", 2));
        System.out.println(porco); //I:(ouro, passaporte) M:0.6 V:9/20 EQ:false

    }

}
