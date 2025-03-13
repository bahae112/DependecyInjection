import Metier.IMetier;
import dao.*;

public class MetierImpl implements IMetier{
    private IDao dao ;  // couplage faible : la classee metier est prete a fonctionner avec n'importe quelle classe qui implemente cette interface 
    //ne pas faire new ici parceque couplage fort
    public double Calcul(){
        double data = dao.getData() * 30;
        return data;
    };
    //puisque la varibale cest private il nous faut un moyen qui nous permet de lui affecte une valeurs apres soit par :
    //setters --> pour l'injection de dependance 
    // constructeur 
    // setters permet d'injecter dans la variable dao un objet de type IDao cest  un objet dune classe qui implemente linterface IDao
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
