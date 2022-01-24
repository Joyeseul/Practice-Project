package com.ysjo.example.controller;

import com.ysjo.example.model.Member;
import com.ysjo.example.model.MemberService;
import com.ysjo.example.model.Response;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 참고자료
 * https://github.com/jojoldu/blog-code/blob/master/swagger/src/main/java/com/example/SwaggerApplication.java
 *
 * Swagger 기능들 참고자료
 * https://kim-jong-hyun.tistory.com/49
 *
 * Swagger 확인페이지
 * 서버를 실행시키고, http://localhost:8080/swagger-ui.html
 *
 * */
@AllArgsConstructor
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/view/member")
    public String viewMember() {
        return "Member.html View!";
    }

    @GetMapping(value = "/api/members")
    @ApiOperation(value = "유저목록 조회", notes = "전체 유저 목록을 조회한다.")
    public List<Member> findMembers(){
        return memberService.findAll();
    }

    @GetMapping(value = "/api/member/{idx}")
    @ApiImplicitParam(name = "id", value = "유저 아이디")
    @ApiOperation(value = "유저검색", notes = "유저의 idx로 검색한다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공")
            , @ApiResponse(code = 400, message = "잘못된 요청")
            , @ApiResponse(code = 500, message = "서버의 에러")
    })
    public Response findMember(@PathVariable long idx){
        Response response = new Response();
        response.add("user", memberService.findOne(idx));

        return response;
    }

    @PostMapping(value = "/api/member")
    @ApiOperation(value = "유저등록", notes = "유저를 데이터베이스에 등록한다.")
    public Member saveMember(@RequestBody Member member){
        return memberService.save(member);
    }

    @PutMapping(value = "/api/member")
    @ApiOperation(value = "유저수정", notes = "데이터베이스의 유저를 수정한다.")
    public Member updateMember(@RequestBody Member member){
        return memberService.save(member);
    }

    @DeleteMapping(value = "/api/member/{idx}")
    @ApiOperation(value = "유저삭제", notes = "유저를 데이터베이스에서 삭제한다.")
    public String deleteMember(@PathVariable long idx){
        memberService.delete(idx);
        return "delete";
    }

}
