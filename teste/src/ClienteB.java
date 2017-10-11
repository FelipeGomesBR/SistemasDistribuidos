


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import exemplo.rmi.ServicoListener.ServicoListener;

public class ClienteB { 
   public static void main(String[] args) { 
      try {
          Servico servicoRemoto = 
                  (Servico) Naming.lookup( "rmi://172.20.10.11:1099/Server");
          
          servicoRemoto.addTopico("Noticia");
          
          ArrayList<String> topicos = servicoRemoto.getTopicos();
          for(int i=0;i<topicos.size();i++){
          	System.out.println(topicos.get(i));
          }
          
          servicoRemoto.addNoticia("Guerra", "1945");
          
          ArrayList<String> textoNoticias = new ArrayList<String>();
          ArrayList<String> topicoNoticias = new ArrayList<String>();
          textoNoticias = servicoRemoto.getTextoNoticias();
          topicoNoticias = servicoRemoto.getTopicoNoticias();
          for(int i=0;i<textoNoticias.size();i++){
          	System.out.println("T�pico:" +  topicoNoticias.get(i) + " Noticia: " + textoNoticias.get(i));
          }
          
      } catch (Exception e) {
          e.printStackTrace();
      }
   }
   
   public void insereNoticia(String titulo, String Descricao){
   	//Fazer a implementa��o do m�todo que conversa com a interface e envia via rmi a inser��o
   }
   
   public Servico getServico() {
       try {
    	   Servico servicoRemoto = 
                   (Servico) Naming.lookup( "rmi://172.20.10.11:1099/Server");

           return servicoRemoto;
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       return null;
   }
} 