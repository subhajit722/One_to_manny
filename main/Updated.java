package main;

import dto.Mobile;
import dto.Sims;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Updated {
    static EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
    static EntityManager e2 = e1.createEntityManager();
    static EntityTransaction e3  =e2.getTransaction();


    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.setId(1);

        m1.setBrand("Vivo");
        m1.setModel("V3");
        m1.setPrice(11999);

        Sims s1  = new Sims();
        s1.setSim_id(1);
        s1.setProvider("Airtel");
        s1.setType("5g");
        s1.setNumber(961408660l);
        Sims s2  = new Sims();
        s2.setSim_id(2);
        s2.setProvider("JIo");
        s2.setType("4g");
        s2.setNumber(8293627556l);

        List<Sims> l1  = new ArrayList<Sims>();
        l1.add(s1);
        l1.add(s2);

        m1.setS1(l1);

        e3.begin();
        e2.merge(m1);
        e3.commit();
        System.out.println("date is updated");


    }
}
