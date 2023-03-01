
package aula07arelacionamentoclasses;

public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade; 
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //MÉTODOS PÚBLICOS
    public void apresentar(){
        System.out.println("=========================================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "anos.");
        System.out.println(this.altura + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + " Kg.");
        System.out.println("Ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas");
        System.out.println("Empatou " + this.getEmpates() + " lutas");
        System.out.println("=========================================");
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
    }
    public void perderLutas(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }
    
    //MÉTODOS ESPECIAIS
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;       
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        setCategotia();
    }
    public String getCategoria(){
        return categoria;
    }
    private void setCategotia(){
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }       
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
    
   



}





