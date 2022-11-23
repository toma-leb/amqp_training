package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    private final ChatMessageRepository listenerRepo;

    public ChatMessageListener (ChatMessageRepository inputRepo) {
        this.listenerRepo = inputRepo;
    }

    public void onMessage(String input) {
        listenerRepo.addChatMessage(input);
    }
}


