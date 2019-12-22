package come.test;

import java.io.IOException;

import javax.mail.Session;

import org.junit.jupiter.api.Test;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

public class MailTest {
@Test
public void send() throws MessagingException, IOException, javax.mail.MessagingException {
	
	   Session session= MailUtils.createSession("smtp.163.com", "shikmhs", "xihuanni.1314");
	    Mail mail =new Mail("shikmhs@163.com","shikmhs@163.com","youjian","<a href='www.baidu.com'>°Ù¶È</a>");
	    MailUtils.send(session, mail);;
	    
	
}
}
