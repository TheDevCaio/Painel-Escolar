import java.util.Scanner;


     public class painelescolar
     
     {
    	    double matricula;
    	    String nome;
    	    String disciplina;
    	    double qdtAulas;  
    	    
    	    Scanner leia = new Scanner(System.in);
     
     public static void main(String[] args) {
    	 
         painelescolar cadastro = new painelescolar();       
         cadastro.CadastroNovoProfessor();
    	 
     }
        
    	 public void CadastroNovoProfessor(){
    		     
    	  	    leia = new Scanner(System.in);
    	  	    
    	  	    
    	        System.out.println("Seja Bem vindo ao Cadastro de professores"
    	                       + "\n*************************************************\n");        
    	        
    	        System.out.println("Informe o nome completo do novo professor(a) :");
    	      
    			nome = leia.nextLine();   
    	        
    	        System.out.println("Qual disciplina " + nome + " leciona?");
    	        disciplina = leia.nextLine();
    	        
    	        System.out.println("Qual a matrícula de " + nome + "?");
    	        matricula = leia.nextDouble();
    	        
    	        System.out.println("Quantas aulas " + nome + " possui ?");
    	        qdtAulas = leia.nextDouble();
    	        
    	        System.out.println("Sucesso! " + nome + "," + matricula + " foi cadastrado(a) com sucesso na "
    	                + "disciplina de " + disciplina + " com " + qdtAulas + " aulas"); 
    	        
    	        System.out.println("\n\nDeseja cadastrar um novo Professor ? [S/N]:");
    	        String decisao = leia.next();
    	        
    	        if ("S".equals(decisao)) CadastroNovoProfessor();
    	        if (!"S".equals(decisao)) System.out.println("Bye! fim do Programa");
    	     
    	    
    	        
    	 }
    	 
    	 }
     
     
     
     
     
