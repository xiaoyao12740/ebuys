package cn.ebuy.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name="easybuy_comment")
public class EasyBuyComment extends BasePojo {
    @Id
    @Column(name="ec_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String ec_content;
    @Column
    private Date ec_create_time;
    @Column
    private Date  ec_reply_time;
    @Column
    private String ec_nick_name;

    @Column
    private String ec_reply;

    public String getEc_reply() {
        return ec_reply;
    }

    public void setEc_reply(String ec_reply) {
        this.ec_reply = ec_reply;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEc_content() {
        return ec_content;
    }

    public void setEc_content(String ec_content) {
        this.ec_content = ec_content;
    }

    public Date getEc_create_time() {
        return ec_create_time;
    }

    public void setEc_create_time(Date ec_create_time) {
        this.ec_create_time = ec_create_time;
    }

    public Date getEc_reply_time() {
        return ec_reply_time;
    }

    public void setEc_reply_time(Date ec_reply_time) {
        this.ec_reply_time = ec_reply_time;
    }

    public String getEc_nick_name() {
        return ec_nick_name;
    }

    public void setEc_nick_name(String ec_nick_name) {
        this.ec_nick_name = ec_nick_name;
    }
}
