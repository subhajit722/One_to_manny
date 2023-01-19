package main;

import dto.Mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deleted_all {
    public static void main(String[] args) {
        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();
        Mobile m1 = e2.find(Mobile.class,4);

        e3.begin();
        e2.remove(m1);
        e3.commit();

        System.out.println("ALL DATA IS DELETED");
    }
}
