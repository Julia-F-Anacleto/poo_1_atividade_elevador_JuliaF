public class Main {
    public static void main(String[] args) {
        Elevador e1 = new Elevador(false, 0, 10, 0);
        //Escolha quantos andares você deseja subir ou descer
        e1.descer(2);
        e1.VerPorta();
        e1.fecharporta();
        e1.VerPorta();
        e1.descer(2);
        e1.subir(5);
        e1.VerAndarAtual();
        e1.subir(6);
        e1.VerAndarAtual();
        e1.subir(5);
        e1.VerAndarAtual();
        e1.fecharporta();
        e1.abrirporta();
        e1.VerPorta();
        e1.descer(6);
        e1.fecharporta();
        e1.descer(6);
        e1.VerAndarAtual();
        //Testes
    }
}
