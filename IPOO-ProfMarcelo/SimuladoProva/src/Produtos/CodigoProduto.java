package Produtos;

public class CodigoProduto  {
    private String codigo;
    private String id;

    public CodigoProduto(String codigo, String id) {
        setCodigo(codigo);
        setId(id);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo!=null && !codigo.trim().isEmpty()){
            this.codigo = codigo;
        }else{
            System.out.println("ERRO: O Código do produto está inválido!");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id!=null && !id.trim().isEmpty()){
            this.id = id;
        }else{
            System.out.println("ERRO: ID do produto está inválido!");
        }
    }
}
