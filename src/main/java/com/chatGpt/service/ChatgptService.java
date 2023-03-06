package com.chatGpt.service;

import com.chatGpt.dto.ChatRequest;
import com.chatGpt.dto.ChatResponse;

public interface ChatgptService {
	
  String sendMessage(String paramString);
  
  ChatResponse sendChatRequest(ChatRequest paramChatRequest);
}
