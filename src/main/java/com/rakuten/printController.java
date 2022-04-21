package com.rakuten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class printController {

	@GetMapping
	String getmessage() {
		return "Hello";
	}
	@GetMapping("/mydocument")
	String getDocument() {
		return "My Document";
	}
}
