public class NoAluno<T>{
    private Aluno no;
    private NoAluno<T> proximo;
    private NoAluno<T> anterior;

    public NoAluno<T>getAnterior() {
        return anterior;
    }

    public void setAnterior(NoAluno<T> anterior) {
        this.anterior = anterior;
    }

    public Aluno getNo() {
        return no;
    }

    public void setNo(Aluno no) {
        this.no = no;
    }

    public NoAluno<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoAluno<T> proximo) {
        this.proximo = proximo;
    }
}
