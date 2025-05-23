package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {
    @Override
    public String createMember(MemberDto.Create createDto) {
        return "";
    }
}
