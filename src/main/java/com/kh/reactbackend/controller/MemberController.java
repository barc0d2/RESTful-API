package com.kh.reactbackend.controller;


import com.kh.reactbackend.entity.Board;
import com.kh.reactbackend.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
@CrossOrigin("localhost:3001")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<String> addMember(@RequestBody Board board) {
        String userId = memberService.createMember(createDto);

        return ResponseEntity.ok(userId);
    }
}
