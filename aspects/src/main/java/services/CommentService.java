package services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import models.Comment;
import utils.ToLog;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

//    public void publicComment(Comment comment) {
//	logger.info("Publishing comment:" + comment.getText());
//    }

//    public String publishComment(Comment comment) {
//	logger.info("Publishing comment:" + comment.getText());
//	return "SUCCESS";
//    }

//    public void publishComment(Comment comment) {
//	logger.info("Publishin comment:" + comment.getText());
//    }

    @ToLog
    public String publishComment(Comment comment) {
	logger.info("Publishin comment:" + comment.getText());
	return "SUCCESS";
    }

    @ToLog
    public void deleteComment(Comment comment) {
	logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment commment) {
	logger.info("Editing comment:" + commment.getText());
    }

}
