package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfiguration;
import models.Comment;
import services.CommentService;

public class Main {

    public static void main(String[] args) {
	var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

//	var commentRepository = new DBCommentRepository();
//	var commentNotificationProxy = new EmailCommentNotificationProxy();
//
//	var commentService = new CommentService(commentRepository, commentNotificationProxy);

	var comment = new Comment();
	comment.setAuthor("Laurentiu");
	comment.setText("Demo comment");

//	commentService.publicComment(comment);
	var commentService = context.getBean(CommentService.class);
	commentService.publicComment(comment);

    }

}
