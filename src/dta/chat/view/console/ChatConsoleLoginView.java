package dta.chat.view.console;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;

public class ChatConsoleLoginView extends ViewComposite {

	private Scanner sc;
	private ChatAuthController ctrl;

	public ChatConsoleLoginView(Scanner sc) {
		super();
		this.sc = sc;
	}

	public void setAuthController(ChatAuthController auth) {
		this.ctrl = auth;
	}

	@Override
	public void print() {
		System.out.print("== Authetification == \nVeuillez saisir votre login : ");
		String login = sc.next();
		System.out.println("Vous étes connecté en tant que : " + login);
		ctrl.authenticate(login);
	}

}
