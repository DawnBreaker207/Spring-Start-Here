package proxies.Impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import models.Comment;
import proxies.CommentNotificationProxy;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
	System.out.println("Sending push notification for comment: " + comment.getText());

    }
}
