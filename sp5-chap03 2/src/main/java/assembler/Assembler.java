package assembler;

import org.springframework.web.bind.annotation.PutMapping;
import spring.ChangePasswordService;
import spring.Member;
import spring.MemberDao;
import spring.MemberRegisterService;

/**
 * packageName : assembler
 * fileName : Assembler
 * author : naraekwon
 * date : 2022/05/19
 * description : 객체를 생성하는 일을 하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/19         naraekwon          최초 생성
 */
public class Assembler {
//    의존 객체 정의(의존: 다른데있는거 갖다쓰는거? )
    private Member member; // 객체 정의(안에 null)
    private MemberDao memberDao;// 객체 정의 (안에 null)
    private MemberRegisterService regSrv;// 객체 정의 (안에 null)
    private ChangePasswordService pwdSvc;// 객체 정의 (안에 null)

    public Assembler() {
//        의존 객체 생성
        this.member = new Member(); //객체 생성(생성자를 호출해야 객체가 생성됨)
        this.memberDao = new MemberDao(); //객체 생성
        this.regSrv = new MemberRegisterService(memberDao);
        this.pwdSvc = new ChangePasswordService(); //암호변경 서비스 클래스
        pwdSvc.setMemberDao(memberDao);// MemberDao 저장하는 메소드(setter)

    }

//    member 객체를 받아오는 getter
    public Member getMember(){
        return this.member;
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getMemberRegisterService() {
        return regSrv;
    }

    public ChangePasswordService getPwdSvc() {
        return pwdSvc;
    }
}
