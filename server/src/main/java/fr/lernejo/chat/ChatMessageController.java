package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/message")
public class ChatMessageController {

    private final ChatMessageRepository controlRepo;

    public ChatMessageController (ChatMessageRepository inputRepo) {
        this.controlRepo = inputRepo;
    }

    @GetMapping
    Iterable<String> getMessage() {
        return controlRepo.getLastTenMessages();
    }
}
