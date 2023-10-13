public class ListaDuplamenteEncadeada <T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private No<T> anterior;

    public void adicionarComeco(T elemento){
        No<T> celula = new No<>();
        celula.setNo(elemento);
        if(primeiro==null&&ultimo==null){
            primeiro=celula;
            ultimo = celula;
            celula.setAnterior(null);
        }else{
            primeiro.setAnterior(celula);
            celula.setProximo(primeiro);
            primeiro=celula;
            celula.setAnterior(null);
        }
    }
    public void adicionarFim(T elemento){
        No<T> celula = new No<>();
        celula.setNo(elemento);
        if(primeiro==null&&ultimo==null){
            primeiro=celula;
            ultimo = celula;
            celula.setAnterior(null);
        }else{
            ultimo.setProximo(celula);
            celula.setAnterior(ultimo);
            ultimo=celula;
            celula.setProximo(null);
        }
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
        };
        return sb.toString();
    }
}
