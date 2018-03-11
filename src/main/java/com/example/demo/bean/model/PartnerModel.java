package com.example.demo.bean.model;

import java.io.Serializable;

public class PartnerModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.partner_id
     *
     * @mbggenerated
     */
    private Integer partnerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.parent_partner_id
     *
     * @mbggenerated
     */
    private Integer parentPartnerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.platform_id
     *
     * @mbggenerated
     */
    private Integer platformId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.trade_ratio
     *
     * @mbggenerated
     */
    private Integer tradeRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.shop_authority
     *
     * @mbggenerated
     */
    private Byte shopAuthority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.audit_authority
     *
     * @mbggenerated
     */
    private Byte auditAuthority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.created
     *
     * @mbggenerated
     */
    private Integer created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.updated
     *
     * @mbggenerated
     */
    private Integer updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partners.is_deleted
     *
     * @mbggenerated
     */
    private Boolean isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table partners
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.partner_id
     *
     * @return the value of partners.partner_id
     *
     * @mbggenerated
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.partner_id
     *
     * @param partnerId the value for partners.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.parent_partner_id
     *
     * @return the value of partners.parent_partner_id
     *
     * @mbggenerated
     */
    public Integer getParentPartnerId() {
        return parentPartnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.parent_partner_id
     *
     * @param parentPartnerId the value for partners.parent_partner_id
     *
     * @mbggenerated
     */
    public void setParentPartnerId(Integer parentPartnerId) {
        this.parentPartnerId = parentPartnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.platform_id
     *
     * @return the value of partners.platform_id
     *
     * @mbggenerated
     */
    public Integer getPlatformId() {
        return platformId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.platform_id
     *
     * @param platformId the value for partners.platform_id
     *
     * @mbggenerated
     */
    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.path
     *
     * @return the value of partners.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.path
     *
     * @param path the value for partners.path
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.name
     *
     * @return the value of partners.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.name
     *
     * @param name the value for partners.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.trade_ratio
     *
     * @return the value of partners.trade_ratio
     *
     * @mbggenerated
     */
    public Integer getTradeRatio() {
        return tradeRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.trade_ratio
     *
     * @param tradeRatio the value for partners.trade_ratio
     *
     * @mbggenerated
     */
    public void setTradeRatio(Integer tradeRatio) {
        this.tradeRatio = tradeRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.shop_authority
     *
     * @return the value of partners.shop_authority
     *
     * @mbggenerated
     */
    public Byte getShopAuthority() {
        return shopAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.shop_authority
     *
     * @param shopAuthority the value for partners.shop_authority
     *
     * @mbggenerated
     */
    public void setShopAuthority(Byte shopAuthority) {
        this.shopAuthority = shopAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.audit_authority
     *
     * @return the value of partners.audit_authority
     *
     * @mbggenerated
     */
    public Byte getAuditAuthority() {
        return auditAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.audit_authority
     *
     * @param auditAuthority the value for partners.audit_authority
     *
     * @mbggenerated
     */
    public void setAuditAuthority(Byte auditAuthority) {
        this.auditAuthority = auditAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.created
     *
     * @return the value of partners.created
     *
     * @mbggenerated
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.created
     *
     * @param created the value for partners.created
     *
     * @mbggenerated
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.updated
     *
     * @return the value of partners.updated
     *
     * @mbggenerated
     */
    public Integer getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.updated
     *
     * @param updated the value for partners.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partners.is_deleted
     *
     * @return the value of partners.is_deleted
     *
     * @mbggenerated
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partners.is_deleted
     *
     * @param isDeleted the value for partners.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partners
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", partnerId=").append(partnerId);
        sb.append(", parentPartnerId=").append(parentPartnerId);
        sb.append(", platformId=").append(platformId);
        sb.append(", path=").append(path);
        sb.append(", name=").append(name);
        sb.append(", tradeRatio=").append(tradeRatio);
        sb.append(", shopAuthority=").append(shopAuthority);
        sb.append(", auditAuthority=").append(auditAuthority);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}