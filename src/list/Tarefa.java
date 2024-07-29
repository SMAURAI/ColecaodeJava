package list;

public class Tarefa implements Comparable<Tarefa> {
    // Atributos
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao
    }
}

class Comparatorseila implements Comparator<Tarefa> {
    public int compare(Tarefa t1, Tarefa t2) {
        return String.compare (t1.getDescricao, t2.getDescricao)
    }
}