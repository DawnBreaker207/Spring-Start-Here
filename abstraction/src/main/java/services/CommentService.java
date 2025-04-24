package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import models.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository,
	    @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
	this.commentRepository = commentRepository;
	this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment) {
	commentRepository.storeComment(comment);
	commentNotificationProxy.sendComment(comment);
    }
}
