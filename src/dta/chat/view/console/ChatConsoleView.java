package dta.chat.view.console;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;
import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObserver;

public class ChatConsoleView extends ViewComposite implements ChatObserver<ChatMessage> {

	private ChatConsoleTitleView title;
	private ChatConsoleLoginView log;
	private ChatConsoleConversationView conv;

	public ChatConsoleView(Scanner sc) {
		title = new ChatConsoleTitleView();
		log = new ChatConsoleLoginView(sc);
		conv = new ChatConsoleConversationView();
		this.children.add(title);
		this.children.add(log);
		this.children.add(conv);
	}

	public void setAuthController(ChatAuthController auth) {
		this.log.setAuthController(auth);
	}

	@Override
	public void update(ChatMessage obj) {
		String login = obj.getLogin();
		String text = obj.getText();
		if (text == null) {
			System.out.println("Welcome : " + login);
		} else {
			System.out.println(login + " : " + text);
		}
	}

}
