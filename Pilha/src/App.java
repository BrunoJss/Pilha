public class App {
    public static void main(String[] args) throws Exception {

        Pilha p1 = new Pilha();
        p1.push('a');
        p1.push('b');
        p1.push('z');
        p1.push('y');
        p1.push('b');

        p1.imprimirPilha();
        
        p1.pop();
        
        p1.imprimirPilha();
    }
}
