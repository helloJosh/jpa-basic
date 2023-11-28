package hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "MBR")
public class Member {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String username;

    protected Member(){
    }
//    private Integer age;
//
//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//
//    @Lob
//    private String description;
//
//    @Transient //DB에 추가되지 않음
//    private int temp;
//
//    public Member(Long id,  String name){
//        this.id = id;
//        this.name = name;
//    }
//

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
