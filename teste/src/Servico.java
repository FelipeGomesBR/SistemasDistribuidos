//Interface do servi�o que recebe o X e o Y e permite que seja registrado um listener:



import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import exemplo.rmi.ServicoListener.ServicoListener;

public interface Servico extends Remote {

  void addListener(ServicoListener listener) throws RemoteException;

  void addTopico(String novoTopico) throws RemoteException;
  
  ArrayList<String> getTopicos() throws RemoteException;
  
  void addNoticia(String topico, String noticia) throws RemoteException;

  ArrayList<String> getTextoNoticias() throws RemoteException;
  
  ArrayList<String> getTopicoNoticias() throws RemoteException;
  
  void addUser(String username, String senha, String nome) throws RemoteException;
  
  ArrayList<String> getUsername() throws RemoteException;
  
  ArrayList<String> getSenha() throws RemoteException;
  
  ArrayList<String> getNome() throws RemoteException;
  
}