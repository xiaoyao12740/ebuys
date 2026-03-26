package cn.ebuy.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "easybuy_news")

public class EasyBuyNews extends BasePojo {

    @Id
    @Column(name="en_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    /**
     * 这是注释,新闻ID
     */
    @Column
    private String en_title;
    /**
     * 这是注释,新闻标题
     */
    @Column
    private String en_content;
    /**
     * 这是注释,新闻内容
     */
    @Column
    private Date en_create_time;
    /**
     * 这是注释,新闻发布时间
     */
    @Column
    private  String en_type;
    /**
     * 这是注释,新闻类型
     */
    public Long getEn_id() {
        return id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEn_create_time() {
        return en_create_time;
    }

    public void setEn_create_time(Date en_create_time) {
        this.en_create_time = en_create_time;
    }

    public void setEn_id(Long en_id) {
        this.id = en_id;
    }

    public String getEn_title() {
        return en_title;
    }

    public void setEn_title(String en_title) {
        this.en_title = en_title;
    }

    public String getEn_content() {
        return en_content;
    }

    public void setEn_content(String en_content) {
        this.en_content = en_content;
    }

    public Date getEn_crrate_time() {
        return en_create_time;
    }

    public void setEn_crrate_time(Date en_crrate_time) {
        this.en_create_time = en_crrate_time;
    }

    public String getEn_type() {
        return en_type;
    }

    public void setEn_type(String en_type) {
        this.en_type = en_type;
    }
}
