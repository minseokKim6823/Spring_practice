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
                //저장
                Team team = new Team();
                team.setName("TeamA");
                em.persist(team);

                Member member = new Member();
                member.setUsername("member1");
                member.setTeam(team);//자동으로 FK값 사용
                em.persist(member);

                em.flush();
                em.clear();

                Member findMember =em.find(Member.class, member.getId());

                Team findTeam= findMember.getTeam();
                System.out.println("findTeam =" +findTeam.getId());

                Team newTeam =em.find(Team.class,100L);
                findMember.setTeam(newTeam);

                tx.commit();
        }catch (Exception e){
                tx.rollback();
        }finally {
                em.close();
        }
        emf.close();
    }
}
