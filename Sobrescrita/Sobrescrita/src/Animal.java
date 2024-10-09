/**
 * Classe para demonstrar o recurso de linguagem chamado Sobrescrita de métodos
 * @author 2830482311021
 */
public class Animal {
    protected String raça, cor;
    protected Integer idade;
    
    //Construtor da classe Animal
    public Animal(String raça, String cor, Integer idade){
        this.raça = raça;
        this.cor = cor;
        this.idade = idade;
    }
    
    //Construtor vazio
    public Animal(){}
    
    //Método comum para exibir os dados de um animal
    public void exibirDadosAnimal(){
        System.out.println("Raça: " + raça);
        System.out.println("Cor predominante: " + cor);
        System.out.println("Idade do animal: " + idade);
    }
    
    //Método para exibir a alimentação do Animal
    public void alimentarAnimal(){
        System.out.println("O animal se alimenta");
    }
}
