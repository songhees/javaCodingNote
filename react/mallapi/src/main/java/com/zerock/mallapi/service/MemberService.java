package com.zerock.mallapi.service;

import com.zerock.mallapi.domain.Member;
import com.zerock.mallapi.dto.MemberDTO;
import com.zerock.mallapi.dto.MemberModifyDTO;

import java.util.stream.Collectors;

public interface MemberService {
    MemberDTO getKakaoMember(String accessToken);

    void modifyMember(MemberModifyDTO memberModifyDTO);
    default MemberDTO entityToDTO(Member member) {
        return new MemberDTO(member.getEmail(),
                member.getPw(), member.getNickname(), member.isSocial(),
                member.getMemberRoleList().stream().map(memberRole -> memberRole.name()).collect(Collectors.toList()));
    }
}
