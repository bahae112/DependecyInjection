package pres;
import java.util.*;

import dao.DaoImpl;
import dao.IDao;

import java.io.File;
import java.net.*;

import Metier.*;

public class pres2 {
    @SuppressWarnings("unchecked")
    public static void main(String [] args) {
        //instanciation statique
        // DaoImpl dao = new DaoImpl();
        // MetierImpl metier = new MetierImpl();
        //Instanciation dynamique
        Scanner scanner = new Scanner(new File("newconfig.txt"));
        String dao = scanner.nextLine();
        String metier = scanner.nextLine();
        Class cDao = Class.forName(dao);
        Class cMetier = Class.forName(metier);
        IDao dao2 = (IDao) cDao.getConstructor().newInstance();
        
        double data = dao2.getData();
    }
}
