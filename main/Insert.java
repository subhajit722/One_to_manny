package main;

import dto.Mobile;
import dto.Sims;
import org.jboss.jandex.Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {


        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");

        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();

        Mobile m1 = new Mobile();
        m1.setBrand("MI");
        m1.setModel("10pro");
        m1.setPrice(10999);
        Sims s1 = new Sims();
        s1.setProvider("jio");
        s1.setType("4G");
        s1.setNumber(8293627665l);

        Sims s2 = new Sims();
        s2.setProvider("BSNL");
        s2.setType("5G");
        s2.setNumber(9614086680l);

        List<Sims> l1 = new ArrayList<Sims>();
        l1.add(s1);
        l1.add(s2);

        m1.setS1(l1);

        e3.begin();
        e2.persist(m1);
        e3.commit();


    }

}

