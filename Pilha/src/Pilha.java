public class Pilha {
    Elemento topo;
    int tamanho;

    public Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }
    //adiciona elemento no topo da lista
    public void push(char elemento){
        Elemento e = new Elemento(elemento);
        e.proximo = topo;
        topo = e;
        tamanho++;
    }
    //remove elemento do topo
    public char pop(){
        if(empty()){
            System.out.println("Pilha vazia!");
            return '\0';
        }
        Elemento e = topo;
        char c = e.valor;
        topo = topo.proximo;
        tamanho--;
        return c;
    }

    //
    public int size(){
        return tamanho;
    }

    public boolean empty(){
        return tamanho == 0;
    }

    public void imprimirPilha(){
        if(!empty()){
            Elemento atual = topo;
            while(atual != null){
                System.out.print(atual.valor);
                if(atual.proximo != null){
                    System.out.print("=>");
                }
                atual = atual.proximo;
            }
        }else{
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println();
    }
}
