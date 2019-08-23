package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	Produto produto = new Produto("Bolo do juquinha sabor Tangerina", 0.15);
    	
        System.out.println( "O bolo que eu gosto e: "  + produto.getNome() + " e custo: " + produto.getPreco());
    }
}
