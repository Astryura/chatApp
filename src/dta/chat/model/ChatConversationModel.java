package dta.chat.model;

import dta.chat.model.observer.ChatObservable;

public class ChatConversationModel extends ChatObservable<ChatMessage> {

	ChatMessage chat;
	String login;
	String msg;

	public void setLogin(String login) {
		this.login = login;
		chat = new ChatMessage(login, msg);
		this.notifyObservers(chat);
	}

	public void sendMessage(String msg) {
		this.msg = msg;
		chat = new ChatMessage(login, msg);
		this.notifyObservers(chat);
	}
}
