package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
//            member.setName("helloJPA");
//            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
//            for(Member m: result){
//                System.out.println("member.name = "+m.getName());
//            }
//            // 영속
//            Member member = em.find(Member.class, 1L);
//            member.setName("zzzzz");
//            if(member.getName().equals("zzzzz")){
//                em.persist(member);
//            }
            Member member =new Member(200L,"member200");
            em.persist(member);
            em.flush();

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
        }

        emf.close();
    }
}
