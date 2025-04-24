package repositories.Impl;

import org.springframework.stereotype.Repository;

import models.Comment;
import repositories.CommentRepository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
	System.out.println("Storing comment: " + comment.getText());

    }
}
