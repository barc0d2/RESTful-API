package com.kh.reactbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/board")
@RequiredArgsConstructor
@CrossOrigin("localhost:8888")
public class BoardController {
}
