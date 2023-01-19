package main;

import dto.Mobile;

import javax.persistence.*;

public class Dealeted_by_id {
    public static void main(String[] args) {
        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();
        e3.begin();
        Query q1 = e2.createQuery("delete from Mobile");
        Query q2 = e2.createQuery("delete from Sims");

        q1.executeUpdate();
        q2.executeUpdate();





        e3.commit();


    }


}
