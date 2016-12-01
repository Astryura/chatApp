package dta.chat;

import java.util.Scanner;

import dta.chat.controller.ChatAuth;
import dta.chat.model.ChatConversationModel;
import dta.chat.view.console.ChatConsoleView;

public class ChatClientApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChatConversationModel model = new ChatConversationModel();
		ChatConsoleView view = new ChatConsoleView(sc);
		view.setAuthController(new ChatAuth(model));
		model.addObserver(view);
		view.print();
		String msg;
		do {
			msg = sc.next();
			model.sendMessage(msg);
		} while (!msg.equals("exit"));
	}

}
