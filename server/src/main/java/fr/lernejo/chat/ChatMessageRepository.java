package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ChatMessageRepository {
    private final List<String> history = new ArrayList<>();
    void addChatMessage(String message) {
        if (history.size() >= 10) {
            history.remove(0);
        }
        history.add(message);
    }
    List<String> getLastTenMessages() {
        return history;
    }
}
