public class No<T> {
    private T no;
    private No<T> proximo;
    private No<T> anterior;

    public T getNo() {
        return no;
    }

    public void setNo(T no) {
        this.no = no;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "no=" + no +
                ", proximo=" + proximo +
                ", anterior=" + anterior +
                '}';
    }
}
