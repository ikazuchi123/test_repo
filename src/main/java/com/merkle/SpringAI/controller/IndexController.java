package com.merkle.SpringAI.controller;


import com.merkle.SpringAI.service.DocumentService;
import com.merkle.SpringAI.service.MessageService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.ai.document.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//@Tag(name = "RAG demo")
@RestController
@RequestMapping("/rag")
public class IndexController {

	@Autowired
	private DocumentService documentService;

	@Autowired
	private MessageService messageService;

//	@Autowired
//	private void setChatClient(DocumentService documentService){
//		IndexController.documentService = documentService;
//	}

	@Operation(summary = "上传文档")
	@PostMapping("/upload")
	public ResponseEntity upload() {
//		public ResponseEntity upload(@RequestBody MultipartFile file) {

//		documentService.uploadDocument(file);
		documentService.uploadDocument();
		return ResponseEntity.ok("success");
	}

	@Operation(summary = "搜索文档")
	@GetMapping("/search")
	public ResponseEntity<List<Document>> searchDoc(@RequestParam String keyword) {
		return ResponseEntity.ok(documentService.search(keyword));
	}

	//RequestParam不加name=的话不知为何会出错
	@Operation(summary = "问答文档")
	@GetMapping("/chat")
	public ResponseEntity chat(@RequestParam(name = "message") String message) {
		System.out.println("记录提问信息: " + message);
		messageService.recordMessage(message,999L,999L,0);
		return ResponseEntity.ok(documentService.chat_with_record(message,999L));
	}

	@Operation(summary = "问答文档")
	@GetMapping("/chat_as_saler")
	public ResponseEntity chat_as_saler(@RequestParam(name = "message") String message) {
		System.out.println("记录提问信息: " + message);

		messageService.recordMessage(message,999L,999L,0);
		return ResponseEntity.ok(documentService.chat_with_record(message,999L));
	}


}
