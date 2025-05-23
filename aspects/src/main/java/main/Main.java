package main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfiguration;
import models.Comment;
import services.CommentService;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
	var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

	var service = c.getBean(CommentService.class);

	Comment comment = new Comment();
	comment.setText("Demo comment");
	comment.setAuthor("Natasha");

//	String value = service.publishComment(comment);
	var value = service.publishComment(comment);

	logger.info(value);
    }

}
