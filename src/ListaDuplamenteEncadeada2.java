public class ListaDuplamenteEncadeada2<T> {
    private NoAluno<T> primeiro;
    private NoAluno<T> ultimo;
    private NoAluno<T>Anterior;
    private int tamanho=0;

    public void addAlunoComeco(Aluno elemento){
        NoAluno<T> celula = new NoAluno();
        celula.setNo(elemento);
        if(primeiro==null&&ultimo==null){
            primeiro=celula;
            ultimo=celula;
            celula.setAnterior(null);
        }else if(tamanho<7){
            primeiro.setAnterior(celula);
            celula.setProximo(primeiro);
            primeiro=celula;
            celula.setAnterior(null);
        }else{
            System.out.println("Lista cheia!!!");
        }
        tamanho++;
    }
    public void addAlunoFim(Aluno elemento){
        NoAluno<T> celula = new NoAluno<>();
        celula.setNo(elemento);
        if(primeiro==null&&ultimo==null){
            primeiro=celula;
            ultimo=celula;
            celula.setAnterior(null);
        }else if(tamanho<7){
            ultimo.setProximo(celula);
            celula.setAnterior(ultimo);
            ultimo=celula;
            celula.setProximo(null);
        }
        else{
            System.out.println("Lista cheia!!!");
        }
        tamanho++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoAluno<T> current = primeiro;

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
