/**
 * Classe que herda todos os atributos e métodos da classe Animal
 * Também cria objetos do tipo Anfíbio
 * @author 2830482311021
 */
public class Anfíbio extends Animal{
    Boolean pular, venenoso;
    Float temperatura;
    
    public Anfíbio(String raça, String cor, Integer idade, Boolean pular, Boolean venenoso, Float temperatura){
        super(raça, cor, idade);
        this.pular = pular;
        this.venenoso = venenoso;
        this.temperatura = temperatura;
    }
    
    //Método sobrescrito para exibir os dados de um Anfíbio
    @Override
    public void exibirDadosAnimal(){
        System.out.println("Esse anfíbio " + (pular==true?"pula":"não pula") + ", " + (venenoso?"é venenoso":"não é venenoso") + " e sua temperatura é de " + temperatura);
    }
    
    public void alimentarAnimal(String alimento){
        System.out.println("Essa raça " + raça + " se alimenta de " + alimento);
    }
}
