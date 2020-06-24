package com.swat018.springdatademo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/*
@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository {
    Comment save(Comment comment);
    List<Comment> findAll();
}
*/

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContains(String kerword);

    Page<Comment> findByLikeCountGreaterThenAndPost(int likeCount, Post post, Pageable pageable);
}
