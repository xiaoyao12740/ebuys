package cn.ebuy.pojo;

import javax.persistence.*;

@Table(name = "easybuy_shopping")
public class EasyBuyShopping extends BasePojo {

    @Id
    @Column(name = "es_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long es_id;
    /**
     * 这是注释,购物车主键
     */

    @Column
    private Long es_user_id;
    /**
     * 这是注释,用户id
     */

    @Column
    private Long es_product_id;
    /**
     * 这是注释,商品id
     */

    @Column
    private Integer es_quantity;
    /**
     * 这是注释,商品数量
     */

    @Column
    private Integer  createTimey;
    /**
     * 这是注释,创建时间
     */

    public Long getEs_id() {
        return es_id;
    }

    public void setEs_id(Long es_id) {
        this.es_id = es_id;
    }

    public Long getEs_user_id() {
        return es_user_id;
    }

    public void setEs_user_id(Long es_user_id) {
        this.es_user_id = es_user_id;
    }

    public Long getEs_product_id() {
        return es_product_id;
    }

    public void setEs_product_id(Long es_product_id) {
        this.es_product_id = es_product_id;
    }

    public Integer getEs_quantity() {
        return es_quantity;
    }

    public void setEs_quantity(Integer es_quantity) {
        this.es_quantity = es_quantity;
    }
}
