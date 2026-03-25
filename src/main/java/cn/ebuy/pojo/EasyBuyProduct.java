package cn.ebuy.pojo;



import javax.persistence.*;

@Table(name = "easybuy_product")

public class EasyBuyProduct extends BasePojo {
    /**
     *商品ID
     */

    @Id
    @Column(name="ep_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 商品名称
     */
    @Column
    private String ep_name;
    /**
     * 卖点
     */
    @Column
    private String  sell_point;
    /**
     * 价格
     */
    @Column
    private Float  ep_price;
    /**
     * 库存
     */
    @Column
    private Integer ep_stock;
    /**
     * 图片名称
     */
    @Column
    private String ep_file_name;
    /**
     * 商品分类ID
     */
    @Column
    private Long epc_id;
    /**
     *  状态
     */
    @Column
    private Integer  status;
    /**
     * 商品描述
     */

    private String ep_description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEp_name() {
        return ep_name;
    }

    public void setEp_name(String ep_name) {
        this.ep_name = ep_name;
    }

    public String getSell_point() {
        return sell_point;
    }

    public void setSell_point(String sell_point) {
        this.sell_point = sell_point;
    }

    public Float getEp_price() {
        return ep_price;
    }

    public void setEp_price(Float ep_price) {
        this.ep_price = ep_price;
    }

    public Integer getEp_stock() {
        return ep_stock;
    }

    public void setEp_stock(Integer ep_stock) {
        this.ep_stock = ep_stock;
    }

    public String getEp_file_name() {
        return ep_file_name;
    }

    public void setEp_file_name(String ep_file_name) {
        this.ep_file_name = ep_file_name;
    }

    public Long getEpc_id() {
        return epc_id;
    }

    public void setEpc_id(Long epc_id) {
        this.epc_id = epc_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEp_description() {
        return ep_description;
    }

    public void setEp_description(String ep_description) {
        this.ep_description = ep_description;
    }
}
