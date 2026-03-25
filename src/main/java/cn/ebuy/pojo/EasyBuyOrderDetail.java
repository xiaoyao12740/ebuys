package cn.ebuy.pojo;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "easybuy_order_detail")
public class EasyBuyOrderDetail extends BasePojo {

    @Id
    @Column(name = "eod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eod_id;
    /**
     * 这是注释,订单明细主键
     */

    @Column
    private Long eo_id;
    /**
     * 这是注释,订单id
     */

    @Column
    private Long ep_id;
    /**
     * 这是注释,商品id
     */

    @Column
    private Integer eod_quantity;
    /**
     * 这是注释,商品数量
     */

    @Column
    private Float eod_cost;
    /**
     * 这是注释,商品金额
     */

    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 这是注释,创建时间
     */

    public Long getEod_id() {
        return eod_id;
    }

    public void setEod_id(Long eod_id) {
        this.eod_id = eod_id;
    }

    public Long getEo_id() {
        return eo_id;
    }

    public void setEo_id(Long eo_id) {
        this.eo_id = eo_id;
    }

    public Long getEp_id() {
        return ep_id;
    }

    public void setEp_id(Long ep_id) {
        this.ep_id = ep_id;
    }

    public Integer getEod_quantity() {
        return eod_quantity;
    }

    public void setEod_quantity(Integer eod_quantity) {
        this.eod_quantity = eod_quantity;
    }

    public Float getEod_cost() {
        return eod_cost;
    }

    public void setEod_cost(Float eod_cost) {
        this.eod_cost = eod_cost;
    }
}
