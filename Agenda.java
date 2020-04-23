public class Agenda{
    
    private Contatto head;
    private int counter;
    
    public Agenda(){
        this.head = null;
    }
    
    public void StampaLista(){
        Contatto current = this.head;
        
        System.out.printf(" Nome = %s, Cognome = %s, numeroTel = %s, email = %s",current.nome,current.cognome,current.numeroTel,current.email);
        while(current != null){
            System.out.printf("%d -->", current.nome);
            System.out.printf("%d -->", current.cognome);
            System.out.printf("%d -->", current.numeroTel);
            System.out.printf("%d -->", current.email);
            current = current.next;
        }
        System.out.printf("null\n"); 
    }
    
    public void InserisciInLista(String nome,String cognome,String numeroTel, String email){
       Contatto current = this.head;
       Contatto prev = null;
        
        Contatto temp = new Contatto(nome,cognome,numeroTel,email);
        
        while(current != null){
            prev = current;
            current = current.next;
         }
         
         if(prev == null){
             temp.next = this.head; 
             this.head = temp;
         }else{
            prev.next = temp;
            temp.next = current;
         }
         
        this.counter++;
    }
    
   public void EliminaContatto(String nome, String cognome){
        Contatto current = this.head;
        Contatto prev = null;
        while(current != null && current.nome == nome || current.cognome == cognome){
            
            prev = current;
            current = current.next;
            
        }
        
        if(current == null){
            
            System.out.println("Contatto non trovato nella lista, non faccio nulla\n");
            return;
            
        }    
        
        System.out.printf("Contatto trovato, vediamo cosa fare\n");
        this.counter--;
        
        if (prev == null){
            
            System.out.printf("Contatto da eliminare e' in testa, elimina\n");
            this.head = this.head.next;  
            return;
            
        }
        
        System.out.printf("Contatto da eliminare non e' in testa, elimina\n");
        prev.next = prev.next.next;
    }
    
    public void RicercaContatto(String nome, String cognome){
        Contatto current = this.head;
        Contatto prev = null;
        while(current != null && current.nome == nome || current.cognome == cognome){
            
            prev = current;
            current = current.next;
            
        }
        
        if(current == null){
            
            System.out.println("Contatto non trovato nella lista\n");
            return;
            
        }    
        
        System.out.printf("Contatto trovato:\n");
        System.out.printf(" name --> %s\n", current.nome);
        System.out.printf(" surname --> %s\n", current.cognome);
        System.out.printf(" cellNumber --> %s\n", current.numeroTel);
        System.out.printf(" email --> %s\n", current.email);
    }

            
            
   
}        
