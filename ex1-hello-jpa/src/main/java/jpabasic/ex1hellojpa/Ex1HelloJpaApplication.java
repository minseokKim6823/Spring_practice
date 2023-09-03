package jpabasic.ex1hellojpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class  Ex1HelloJpaApplication {

	public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();//JPA의 모든 데이터 변경은 트랜잭션 안에서 일어나야 함
        tx.begin();

        try {
                Member member = new Member();
                member.setUsername("C");

                em.persist(member);

                tx.commit();
                //영속

                /*Member member =new Member(200L,"member200");
                em.persist(member);

                em.flush();

                System.out.println("==============");
                tx.commit();*/
                //Member member = new Member();
                //member.setId(2L);
                //member.setName("HelloB"); //회원 등록

//                Member member = em.find(Member.class, 150L);
//                member.setName("HelloJPA");
//
//                em.clear();
//                Member member2 = em.find(Member.class, 150L);
//
//                System.out.println("==============");
//                tx.commit();

                /*
                //비영속
                Member member =new Member();
                member.setId(100L);
                member.setName("HelloJPA");

                //영속
                em.persist(member);
                */

                //List<Member> result = em.createQuery("select m from Member as m ", Member.class)
                        /*.setFirstResult(1)
                        .setMaxResults(10)//처움부터 끝까지 지정가능
                        .getResultList();

                /*for(Member member : result){
                        System.out.println("member.name = " + member.getName());*/
        }catch (Exception e){
                tx.rollback();
        }finally {
                em.close();
        }
        emf.close();
    }
}
