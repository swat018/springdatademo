package com.swat018.springdatademo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Stream;

/*
@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository {
    Comment save(Comment comment);
    List<Comment> findAll();
}
*/

public interface CommentRepository extends MyRepository<Comment, Long> {

//    List<Comment> findByCommentContainsIgnoreCaseAndLikeCountGreaterThan(String keyword, int likeCount);
//    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountDesc(String keyword);
//    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountAsc(String keyword);
//    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);
//    Stream<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);
    @Async
    ListenableFuture<List<Comment>> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);
}
