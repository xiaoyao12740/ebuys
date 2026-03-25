package cn.ebuy.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "easybuy_user")
public class EasyBuyUser extends BasePojo implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @Column(name="eu_user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 登录名
     */
    @Column
    private String eu_login_name;
    /**
     * 姓名
     */
    @Column
    private String eu_user_name;
    /**
     * 密码
     */
    @Column
    private String eu_password;
    /**
     * 性别
     */
    @Column
    private String  eu_sex;
    /**
     * 出生日期
     */
    @Column
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date eu_birthday;
    /**
     * 身份证号
     */
    @Column
    private String eu_identity_code;
    /**
     * 邮箱
     */
    @Column
    private String eu_email;
    /**
     * 电话
     */
    @Column
    private String eu_mobile;
    /**
     *  地址
     */
    @Column
    private String eu_address;
    /**
     * 状态
     */
    @Column
    private String eu_status;
    /**
     * 编码
     */
    @Column
    private String eu_code;
    /**
     * 用户角色
     */
    @Column
    private String eu_role;

    public String getEu_login_name() {
        return eu_login_name;
    }

    public void setEu_login_name(String eu_login_name) {
        this.eu_login_name = eu_login_name;
    }

    public String getEu_user_name() {
        return eu_user_name;
    }

    public void setEu_user_name(String eu_user_name) {
        this.eu_user_name = eu_user_name;
    }

    public String getEu_password() {
        return eu_password;
    }

    public void setEu_password(String eu_password) {
        this.eu_password = eu_password;
    }

    public String getEu_sex() {
        return eu_sex;
    }

    public void setEu_sex(String eu_sex) {
        this.eu_sex = eu_sex;
    }

    public Date getEu_birthday() {
        return eu_birthday;
    }

    public void setEu_birthday(Date eu_birthday) {
        this.eu_birthday = eu_birthday;
    }

    public String getEu_identity_code() {
        return eu_identity_code;
    }

    public void setEu_identity_code(String eu_identity_code) {
        this.eu_identity_code = eu_identity_code;
    }

    public String getEu_email() {
        return eu_email;
    }

    public void setEu_email(String eu_email) {
        this.eu_email = eu_email;
    }

    public String getEu_mobile() {
        return eu_mobile;
    }

    public void setEu_mobile(String eu_mobile) {
        this.eu_mobile = eu_mobile;
    }

    public String getEu_address() {
        return eu_address;
    }

    public void setEu_address(String eu_address) {
        this.eu_address = eu_address;
    }

    public String getEu_status() {
        return eu_status;
    }

    public void setEu_status(String eu_status) {
        this.eu_status = eu_status;
    }

    public String getEu_code() {
        return eu_code;
    }

    public void setEu_code(String eu_code) {
        this.eu_code = eu_code;
    }

    public String getEu_role() {
        return eu_role;
    }

    public void setEu_role(String eu_role) {
        this.eu_role = eu_role;
    }
}
