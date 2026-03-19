public class Elevador {
    private boolean portafechada;
    private double andaratual;
    private double andarmaximo;
    private double andarminimo;

    public Elevador(boolean portafechada, double andaratual, double andarmaximo, double andarminimo){
        this.portafechada = portafechada;
        this.andaratual = andaratual;
        this.andarmaximo = andarmaximo;
        this.andarminimo = andarminimo;
        VerAndarAtual();
    }

    public void subir(double andaresasubir){
        System.out.println("--------");
        if (andaratual > andarmaximo){
            System.out.println("Seu andar ("+andaratual+") é inválido pois é maior que o máximo (" + andarmaximo+")");
            return;
        }
        if (andaratual < andarminimo){
            System.out.println("Seu andar ("+andaratual+") é inválido pois é menor que o mínimo (" + andarminimo+")");
            return;
        }
        if (portafechada == false){
            System.out.println("Feche a porta antes de subir.");
            return;
        }
        if ((andaratual+andaresasubir) > andarmaximo){
            System.out.println("Não é possível subir essa quantidade, não existe um andar "+(andaratual+andaresasubir));
            return;
        }
        System.out.println("Subindo "+andaresasubir+" andares.");
        andaratual+=andaresasubir;
        System.out.println("--------");
    }

    public void descer(double andaresadescer){
        System.out.println("--------");
        if (andaratual > andarmaximo){
            System.out.println("Seu andar ("+andaratual+") é inválido pois é maior que o máximo (" + andarmaximo+")");
            return;
        }
        if (andaratual < andarminimo){
            System.out.println("Seu andar ("+andaratual+") é inválido pois é menor que o mínimo (" + andarminimo+")");
            return;
        }
        if (portafechada == false) {
            System.out.println("Feche a porta antes de descer.");
            return;
        }
        if ((andaratual-andaresadescer) < andarminimo){
            System.out.println("Não é possível descer essa quantidade, não existe um andar "+(andaratual-andaresadescer));
            return;
        }
        System.out.println("Descendo "+andaresadescer+" andares.");
        andaratual-=andaresadescer;
        System.out.println("--------");
    }

    public void VerAndarAtual(){
        if (andaratual > andarmaximo){
            System.out.println("Seu andar ("+andaratual+") é inválido pois é maior que o máximo (" + andarmaximo+")");
            return;
        }
        if (andaratual < andarminimo){
            System.out.println("Seu andar ("+andaratual+") é inválido pois é menor que o mínimo (" + andarminimo+")");
            return;
        }
        System.out.println("Andar atual: " +andaratual);
        System.out.println("Andar máximo: "+ andarmaximo);
        System.out.println("Andar mínimo: "+ andarminimo);
    }

    public void abrirporta(){
        if (portafechada==false){
            System.out.println("A porta já está aberta");
            return;
        }
        portafechada = false;
        System.out.println("A porta foi aberta");
    }

    public void fecharporta(){
        if (portafechada==true){
            System.out.println("A porta já está fechada");
            return;
        }
        portafechada = true;
        System.out.println("a porta foi fechada");
    }

    public void VerPorta(){
        System.out.println("A porta está: " +(portafechada ? "Fechada" : "Aberta"));
    }
}
