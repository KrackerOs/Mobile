package aula;

public class teo {
    public static void main(String[] args) {
       int opcoes = 5;
       switch (opcoes) {

        case 1:
        System.out.println("Abra a sua conta. " );  
        break; 

        case 2:
        System.out.println("Fatura do cartão. ");
        break;   

        case 3:
        System.out.println("Crédito imobiliario. ");
        break;
        
        default:
        System.out.println("Escolha uma opção válida. ");
    }
       
    }
}
