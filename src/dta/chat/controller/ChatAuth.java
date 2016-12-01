package dta.chat.controller;

import dta.chat.view.console.ChatConsoleView;

public class ChatAuth implements ChatAuthController {

	private ChatConsoleView view;

	public ChatAuth(ChatConsoleView view) {
		super();
		this.view = view;
	}

	@Override
	public void authenticate(String login) {
		view.setLogin(login);
	}

}
