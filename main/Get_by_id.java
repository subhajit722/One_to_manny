package main;

import dto.Mobile;
import dto.Sims;

import javax.persistence.*;
import java.util.List;

public class Get_by_id {
    public static void main(String[] args) {

        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();
        Mobile m1 = e2.find(Mobile.class,1);
        if(m1 !=null){
            System.out.println("**********************************");
            System.out.println("mobile id is "+m1.getId());
            System.out.println("mobile beand is "+m1.getBrand());
            System.out.println("Mobile model name "+ m1.getModel());
            System.out.println("mobile price is "+m1.getPrice());
            List<Sims> s1 =m1.getS1();
            for(Sims s2 :s1){
                System.out.println("sim id is "+s2.getSim_id());
                System.out.println("sim provider "+s2.getProvider());
                System.out.println("sim netword "+s2.getType());
                System.out.println("sim number "+s2.getNumber());
            }

        }else System.out.println("data is not found");
    }

}
