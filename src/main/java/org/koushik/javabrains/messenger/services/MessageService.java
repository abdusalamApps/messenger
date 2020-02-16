package org.koushik.javabrains.messenger.services;

import java.util.ArrayList;
import java.util.List;

import org.koushik.javabrains.messenger.models.Message;


public class MessageService {
	
	public MessageService() {
	}
	
	
	public List<Message> getMessages() {
		List<Message> messages = new ArrayList<Message>();
		Message m1 = new Message(1L, "Hello, You!", "user1");
		Message m2 = new Message(1L, "M2!", "user1");
		Message m3 = new Message(1L, "M3!", "user1");
		Message m4 = new Message(1L, "M4!", "user1");
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		return messages;

	}

}
