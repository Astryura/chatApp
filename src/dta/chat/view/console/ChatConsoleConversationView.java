package dta.chat.view.console;

public class ChatConsoleConversationView extends ViewComposite {

	private String login;

	@Override
	public void print() {
		System.out.println("== Conversation ==");
		System.out.println("Welcome : " + login);
	}

	public void sayWelcome(String login) {
		this.login = login;

	}

}
