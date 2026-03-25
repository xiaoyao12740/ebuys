package cn.ebuy.pojo;

import javax.persistence.*;

@Table(name="easybuy_address")
public class EasyBuyAddress  extends BasePojo {
    /**
     * 收货地址ID
     */
    @Id
    @Column(name="ea_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 隶属用户
     */
    @Column
    private Long eu_id;
    /**
     * 收货人姓名
     */
    @Column
    private String ea_name;
    /**
     * 收货地址
     */
    @Column
    private String  ea_address;
    /**
     * 收货人手机号
     */
    @Column
    private String  ea_mobile;
    /**
     * 默认地址
     */
    @Column
    private Integer isdefault;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEu_id() {
        return eu_id;
    }

    public void setEu_id(Long eu_id) {
        this.eu_id = eu_id;
    }

    public String getEa_name() {
        return ea_name;
    }

    public void setEa_name(String ea_name) {
        this.ea_name = ea_name;
    }

    public String getEa_address() {
        return ea_address;
    }

    public void setEa_address(String ea_address) {
        this.ea_address = ea_address;
    }

    public String getEa_mobile() {
        return ea_mobile;
    }

    public void setEa_mobile(String ea_mobile) {
        this.ea_mobile = ea_mobile;
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }
}
