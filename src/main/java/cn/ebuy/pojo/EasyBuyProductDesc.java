package cn.ebuy.pojo;


import javax.persistence.*;

/**
 * 商品详情
 */
@Table(name = "easybuy_product_desc")
public class EasyBuyProductDesc extends BasePojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;
    @Column
    private String item_desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }
}
