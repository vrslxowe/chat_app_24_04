package com.koreait.exam.chat_app_24_04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class ChatController {
    ChatMessage message = new ChatMessage("오시온","안녕하세요");

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData<ChatMessage> writeMessage() {
        return new RsData<>("S-1","메시지가 작성됨",message);
    }

}
