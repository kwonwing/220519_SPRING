package main;

import assembler.Assembler;
import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : assembler
 * fileName : MainForAssembler
 * author : TaeGyung
 * date : 2022-04-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-04-30         TaeGyung          최초 생성
 */
public class MainForAssembler {
    public static void main(String[] args) {
//        생성자를 이용해서 객체를 생성
//        Member member = new Member();//객체 생성해서 메소드 호출

        Assembler assembler;// 객체 정의
        //Assembler 기본 생성자 호출
//        Member, MemberDao, MemberRegisterService 객체가 같이 생성됨됨
        assembler = new Assembler();

        MemberDao memberDao = assembler.getMemberDao();
        Member member = assembler.getMember();
        ChangePasswordService changePasswordService = assembler.getPwdSvc();
        MemberRegisterService memberRegisterService = assembler.getMemberRegisterService();
//        Member member;

        member = assembler.getMember();// 객체 생성된 것을 받음 (주입)

        long value = 1;

//        setter 저장
        member.setId(value);
        member.setName("강태경");

        System.out.println(member.getId()+" "+member.getName());

    }
}
