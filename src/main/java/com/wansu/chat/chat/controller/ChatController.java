package com.wansu.chat.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wansu.chat.chat.service.ChatService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/chat")
@AllArgsConstructor
public class ChatController {

    private final ChatService service;

    @GetMapping("/rooms")
    public String rooms() {
        return "/chat/rooms";
    }
}
