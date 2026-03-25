package cn.ebuy.pojo;



import javax.persistence.*;

/**
 * 商品分类
 */
@Table(name="easybuy_product_category")
public class EasyBuyProductCategory extends BasePojo {
    /**
     * 商品分类ID
     */
    @Id
    @Column(name="epc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 商品父级ID
     */
    @Column
    private Long epc_parent_id;
    /**
     * 商品名称
     */
    @Column
    private String epc_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEpc_parent_id() {
        return epc_parent_id;
    }

    public void setEpc_parent_id(Long epc_parent_id) {
        this.epc_parent_id = epc_parent_id;
    }

    public String getEpc_name() {
        return epc_name;
    }

    public void setEpc_name(String epc_name) {
        this.epc_name = epc_name;
    }
}
