import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Agenda agenda = new Agenda();   
	 Scanner tastiera = new Scanner(System.in);  
	 Scanner tast = new Scanner(System.in);
	 int a;
	 String nome,cognome ,numeroTel, email;
	 
	 System.out.println("--AGENDA TELEFONICA--");
	 
	 do{
	     System.out.println("Inserire 1 se si vuole aggiungere un nuovo contatto");
	     System.out.println("Inserire 2 se si vuole cercare un contatto");
	     System.out.println("Inserire 3 se si vuole eliminare un contatto");
	     System.out.println("Inserire 4 se si vuole stampare i contatti");
	     System.out.println("Inserire 0 se si vuole uscire dall'agenda telefonica");
	     
	     a = tast.nextInt();
	     
	  switch(a){
	    case(0):
	        System.out.println("Hai scelto di uscire dall'agenda");
	        break;
	        
	   case(1):
	       System.out.println("Inserire il nome del nuovo contatto = ");
	       nome = tastiera.nextLine();
	       System.out.println("Inserire il cognome del nuovo contatto = ");
	       cognome = tastiera.nextLine();
	       System.out.println("Inserire il numero di teledono = ");
	       numeroTel = tastiera.nextLine();
	       System.out.println("Inserire l'email del nuovo contatto = ");
	       email = tastiera.nextLine();
	       agenda.InserisciInLista(nome, cognome, numeroTel, email);
	       break;
	       
	   case(2):
	       System.out.println("Inserire il nome del contatto che si vuole cercare = ");
	       nome = tastiera.nextLine();
	       System.out.println("Inserire il cognome del contatto che si vuole cercare = ");
	       cognome = tastiera.nextLine();
	       agenda.RicercaContatto(nome,cognome);
	       break;
	       
	   case(3):
	       System.out.println("Inserire il nome del contatto che si vuole eliminare = ");
	       nome = tastiera.nextLine();
	       System.out.println("Inserire il cognome del contatto che si vuole eliminare = ");
	       cognome = tastiera.nextLine();
	       agenda.EliminaContatto(nome,cognome);
	       break;
	       
	   case(4):
	       agenda.StampaLista();
	       break;
	       
	       default:
	       System.out.println("Opzione non presente in menù, ritenta");
	       break;
	  }
	     
	 }while(a != 0);
	
	
	
	
	
	}
}
