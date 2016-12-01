package dta.chat.view.console;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;

public class ChatConsoleView extends ViewComposite {

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

	public void setLogin(String login) {
		this.conv.sayWelcome(login);
	}

}
