package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        Se connecter a la BD pour recuperer la temperature
         */
        System.out.println("Version BD");
        double temp=Math.random()*40;
        return temp;
    }
}
