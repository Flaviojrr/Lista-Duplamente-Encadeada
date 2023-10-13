public class ListaDuplamenteEncadeada3<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private No<T> anterior;
    private int tamanho=0;
    public void addImparComeco(T elemento){
        No<T> celula = new No<T>();
        celula.setNo(elemento);
        if(primeiro==null&&ultimo==null){
            primeiro=celula;
            ultimo=celula;
            celula.setAnterior(null);
            tamanho++;
        }else if(tamanho<15){
            primeiro.setAnterior(celula);
            celula.setProximo(primeiro);
            primeiro=celula;
            celula.setAnterior(null);
            tamanho++;
        }else{
            System.out.println("Lista cheia!!!");
        }
    }
    public void addImparFim(T elemento){
        No<T> celula = new No<T>();
        celula.setNo(elemento);
        if(primeiro==null&&ultimo==null){
            primeiro=celula;
            ultimo=celula;
            celula.setAnterior(null);
            tamanho++;
        }else if(tamanho<15){
            ultimo.setProximo(celula);
            celula.setAnterior(ultimo);
            ultimo=celula;
            celula.setProximo(null);
            tamanho++;
        }
        else{
            System.out.println("Lista cheia!!!");
        }
    }
    public void removerImparInicio(){
        if(primeiro==null){
            System.out.println("Lista vazia!!!");
        }else{
            primeiro=primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        tamanho=tamanho-1;
    }
    public void removerImparFim(){
        if(ultimo==null){
            System.out.println("Lista vazia!!!");
        }else{
            ultimo=ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        tamanho=tamanho-1;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> current = primeiro;
        while (current != null) {
            sb.append(current.getNo());
            if (current.getProximo() != null) {
                sb.append(" ");
            }
            current = current.getProximo();
        }
        return sb.toString();
    }
}
