package list;

import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.RemoveAll(tarefasParaRemover);
    }

    public int obterTotaldeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList)
    }

    public List<tarefaList> pesquisaDeTarefa (String descricao){
        List<Tarefa> resultadoPesquisa = new ArrayList<>();
        if(!tarefaList.isEmpty()){
            for(Tarefa t: tarefaList){
                if(l.getDescricao.equalsIgnoreCase(descricao)){
                    resultadoPesquisa.add(t);
                }
            }
        }
        return resultadoPesquisa;
    }

    public List<Tarefa> ordenado(){
        List<Tarefa> stringExtensao = new ArrayList<>(tarefaList);
        Collections.sort(stringExtensao);
        return stringExtensao;
    }

    public String toString(){
        return "Tarefas{" + "Descrição= " + tarefaList + "}";
    }

    public int compareTo (Tarefa t){
        return Integer.compare(descricao, t.getDescricao);
    }

    public List<Tarefa> ordenadoComparator(){
        List<Tarefa> stringExtensao = new ArrayList<>(tarefaList);
        Collections.sort(stringExtensao, new Comparatorseila());
        return stringExtensao       
    }
}