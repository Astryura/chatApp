package dta.chat.controller;

import dta.chat.model.ChatConversationModel;

public class ChatAuth implements ChatAuthController {

	private ChatConversationModel model;

	public ChatAuth(ChatConversationModel model) {
		super();
		this.model = model;
	}

	@Override
	public void authenticate(String login) {
		model.setLogin(login);
	}

}
