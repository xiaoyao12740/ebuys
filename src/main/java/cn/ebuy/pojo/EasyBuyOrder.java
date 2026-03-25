package cn.ebuy.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "easybuy_order")
public class EasyBuyOrder extends BasePojo {

    @Id
    @Column(name = "eo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eo_id;
    /**
     * 这是注释,订单主键
     */

    @Column
    private String eo_user_id;
    /**
     * 这是注释,用户登录名
     */

    @Column
    private String eo_user_name;
    /**
     * 这是注释,用户名
     */

    @Column
    private String eo_user_address;
    /**
     * 这是注释,收货地址
     */

    @Column
    private Float eo_cost;
    /**
     * 这是注释,总消费
     */

    @Column
    private Integer eo_status;
    /**
     * 这是注释,订单状态：1已发货，0未发货
     */

    @Column
    private Date eo_create_time;
    /**
     * 这是注释,订单创建时间
     */

    @Column
    private String  eo_type;

    public String getEo_type() {
        return eo_type;
    }

    public void setEo_type(String eo_type) {
        this.eo_type = eo_type;
    }

    /**
     * 这是注释,订单类型
     */

    public Long getEo_id() {
        return eo_id;
    }

    public void setEo_id(Long eo_id) {
        this.eo_id = eo_id;
    }

    public String getEo_user_id() {
        return eo_user_id;
    }

    public void setEo_user_id(String eo_user_id) {
        this.eo_user_id = eo_user_id;
    }

    public String getEo_user_name() {
        return eo_user_name;
    }

    public void setEo_user_name(String eo_user_name) {
        this.eo_user_name = eo_user_name;
    }

    public String getEo_user_address() {
        return eo_user_address;
    }

    public void setEo_user_address(String eo_user_address) {
        this.eo_user_address = eo_user_address;
    }

    public Float getEo_cost() {
        return eo_cost;
    }

    public void setEo_cost(Float eo_cost) {
        this.eo_cost = eo_cost;
    }

    public Integer getEo_status() {
        return eo_status;
    }

    public void setEo_status(Integer eo_status) {
        this.eo_status = eo_status;
    }

    public Date getEo_create_time() {
        return eo_create_time;
    }

    public void setEo_create_time(Date eo_create_time) {
        this.eo_create_time = eo_create_time;
    }
}
