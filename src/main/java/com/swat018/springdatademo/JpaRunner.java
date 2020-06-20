package com.swat018.springdatademo;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
/*        Account account = new Account();
        account.setUsername("jinwoo");
        account.setPassword("1234");

        Study study = new Study();
        study.setName("Spring Data JPA");
        account.addStudy(study);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);

        Account jinwoo = session.load(Account.class, account.getId());
        jinwoo.setUsername("jwpark");
        System.out.println("========================");
        System.out.println(jinwoo.getUsername());*/

/*
        Post post = new Post();
        post.setTitle("Spring Data JPA 언제 보나...");

        Comment comment = new Comment();
        comment.setComment("빨리 보고 싶어요.");
        post.addComment(comment);

        Comment comment1 = new Comment();
        comment1.setComment("곧 보여드릴게요");
        post.addComment(comment1);

        Session session = entityManager.unwrap(Session.class);
        session.save(post);
*/

        Session session = entityManager.unwrap(Session.class);
        Post post = session.get(Post.class, 4l);
//        session.delete(post);
//        Comment comment = session.get(Comment.class, 5l);

        System.out.println("===============================");
        System.out.println(post.getTitle());
//        System.out.println(comment.getComment());
//        System.out.println(comment.getPost().getTitle());

        post.getComments().forEach(c-> {
            System.out.println("----------------");
            System.out.println(c.getComment());
        });
    }
}
