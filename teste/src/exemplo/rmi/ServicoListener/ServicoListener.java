package exemplo.rmi.ServicoListener;
//Interface do listener para o servi�o acima:
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoListener extends Remote {

    void calculoEfetuado(double resultado) throws RemoteException;
}