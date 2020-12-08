public class Carro{
    int gas; //atributo -> estado
    int gasMax;
    int pass;
    int passMax;
    int km;

    //parametros
    Carro(int pass, int gas, int km){
        this.gas = gas;
        this.gasMax = gas;
        this.pass = pass;
        this.passMax = pass;
        this.km = km;
    }

    void in() {
        pass += 1;
        if (pass > 2) {
            System.out.println("limite de pessoas atingido");
            pass = 2;
        }
    }

    void out() {
            pass -= 1;
            if (pass < 0) {
                System.out.println("nao ha ninguem no carro");
                pass = 0;
            }
    }
    void abastecer (int gas) {
        this.gas += gas;
        if (this.gas > 100) {
            this.gas = 100;
        }
    }

    void dirigir(int km) {
        this.km += km;

        if (gas > km && pass >= 1) {
            gas -= km;
        }
        else if (pass == 0) {
            this.km -= km;
            System.out.println("nao ha ninguem no carro");
        }
        else if (gas == 0 && km > 1) {
            System.out.println("tanque vazio");
            this.km -= km;
        }
        else { 
            System.out.println("tanque vazio apos andar " + gas);
            this.km -= km;
            this.km += gas;
            gas = 0;
        }
    }
    //metodo que informa como o meu objeto deve ser convertido para Texto
    public String toString() {
        return "pass:" + pass + " gas:" + gas + " km:" + km;
    }

    public static void main(String[] args) { 
        //tipo nome_da_referencia;
        Carro vroom = new Carro(0, 0, 0);
        System.out.println(vroom);
        vroom.in();
        vroom.in();
        System.out.println(vroom);
        vroom.in();
        System.out.println(vroom);
        vroom.out();
        vroom.out();
        vroom.out();
        System.out.println(vroom);
        vroom.abastecer(60);
        System.out.println(vroom);
        vroom.dirigir(10);
        vroom.in();
        vroom.dirigir(10);
        System.out.println(vroom);
        vroom.dirigir(70);
        vroom.dirigir(10);
        System.out.println(vroom);
        vroom.abastecer(200);
        System.out.println(vroom);
    }
}