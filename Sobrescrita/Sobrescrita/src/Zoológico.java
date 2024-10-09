/**
 * Classe para instanciar objetos dos diversos tipos de Animais
 * @author 2830482311021
 */
public class Zoológico {
    public static void main(String[] args) {
        Anfíbio sapo = new Anfíbio("Anura", "Verde", 1, true, false, 12.5f);
        Mamífero m = new Mamífero();
        
        m.exibirDadosAnimal();

        sapo.exibirDadosAnimal();
        sapo.alimentarAnimal("mosca");
    }//fim do main
}