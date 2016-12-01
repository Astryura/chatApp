package dta.chat;

import java.util.Scanner;

import dta.chat.controller.ChatAuth;
import dta.chat.view.console.ChatConsoleView;

public class ChatClientApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChatConsoleView view = new ChatConsoleView(sc);
		view.setAuthController(new ChatAuth(view));
		view.print();
	}

}
