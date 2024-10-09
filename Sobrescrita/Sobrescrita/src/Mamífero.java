
import javax.swing.JOptionPane;

/**
 * Classe que herda TODOS os atributos e métodos da superclasse Animal 
 * Também é demonstrado a "sobrescrita de métodos"
 * @author 2830482311021
 */
public class Mamífero extends Animal{
    Boolean pelagem;
    Integer qtdePatas, tetos;
    
    //Construtor de animal do tipo Mamífero
    public Mamífero(String raça, String cor, Integer idade, Boolean pelagem, Integer qtdePatas, Integer tetos){
        super(raça, cor, idade);
        this.pelagem = pelagem;
        this.qtdePatas = qtdePatas;
        this.tetos = tetos;
    }
    
    //Construtor sobrecarregado para entrada de dados por meio de GUI
    public Mamífero(){
        this.raça = JOptionPane.showInputDialog("Raça ");
        this.cor = JOptionPane.showInputDialog("Cor predominante ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do animal "));
        this.pelagem = Boolean.parseBoolean(JOptionPane.showInputDialog("Animal tem pelos?"));
        this.qtdePatas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de patas"));
        this.tetos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de tetos"));
        }
    
    //Método sobrescrito da classe Animal
    @Override
    public void exibirDadosAnimal(){
        System.out.println("O mamífero " + raça + " tem " + qtdePatas + " patas");
    }
    
    //Método sobrescrito para detalhar como um Animal Mamífero se alimenta
    @Override
    public void alimentarAnimal(){
        System.out.println("O Mamífero se alimenta de leite enquanto filhote");
        System.out.println("Depois ele pode se tornar carnívoro ou não");
    }
    
    public void alimentarAnimal(String alimento){
        System.out.println("O Mamífero " + raça + " se alimenta de " + alimento + " após de tornar adulto");
    }
}
