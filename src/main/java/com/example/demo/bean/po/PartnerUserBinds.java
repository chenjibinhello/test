package com.example.demo.bean.po;

import java.io.Serializable;

public class PartnerUserBinds implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.platform_id
     *
     * @mbggenerated
     */
    private Integer platformId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.parent_user_id
     *
     * @mbggenerated
     */
    private Integer parentUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.partner_id
     *
     * @mbggenerated
     */
    private Integer partnerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.invite_user_id
     *
     * @mbggenerated
     */
    private Integer inviteUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.created
     *
     * @mbggenerated
     */
    private Integer created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.updated
     *
     * @mbggenerated
     */
    private Integer updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column partner_user_binds.is_deleted
     *
     * @mbggenerated
     */
    private Boolean isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table partner_user_binds
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.id
     *
     * @return the value of partner_user_binds.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.id
     *
     * @param id the value for partner_user_binds.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.platform_id
     *
     * @return the value of partner_user_binds.platform_id
     *
     * @mbggenerated
     */
    public Integer getPlatformId() {
        return platformId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.platform_id
     *
     * @param platformId the value for partner_user_binds.platform_id
     *
     * @mbggenerated
     */
    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.user_id
     *
     * @return the value of partner_user_binds.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.user_id
     *
     * @param userId the value for partner_user_binds.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.parent_user_id
     *
     * @return the value of partner_user_binds.parent_user_id
     *
     * @mbggenerated
     */
    public Integer getParentUserId() {
        return parentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.parent_user_id
     *
     * @param parentUserId the value for partner_user_binds.parent_user_id
     *
     * @mbggenerated
     */
    public void setParentUserId(Integer parentUserId) {
        this.parentUserId = parentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.path
     *
     * @return the value of partner_user_binds.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.path
     *
     * @param path the value for partner_user_binds.path
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.name
     *
     * @return the value of partner_user_binds.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.name
     *
     * @param name the value for partner_user_binds.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.partner_id
     *
     * @return the value of partner_user_binds.partner_id
     *
     * @mbggenerated
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.partner_id
     *
     * @param partnerId the value for partner_user_binds.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.invite_user_id
     *
     * @return the value of partner_user_binds.invite_user_id
     *
     * @mbggenerated
     */
    public Integer getInviteUserId() {
        return inviteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.invite_user_id
     *
     * @param inviteUserId the value for partner_user_binds.invite_user_id
     *
     * @mbggenerated
     */
    public void setInviteUserId(Integer inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.status
     *
     * @return the value of partner_user_binds.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.status
     *
     * @param status the value for partner_user_binds.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.created
     *
     * @return the value of partner_user_binds.created
     *
     * @mbggenerated
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.created
     *
     * @param created the value for partner_user_binds.created
     *
     * @mbggenerated
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.updated
     *
     * @return the value of partner_user_binds.updated
     *
     * @mbggenerated
     */
    public Integer getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.updated
     *
     * @param updated the value for partner_user_binds.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column partner_user_binds.is_deleted
     *
     * @return the value of partner_user_binds.is_deleted
     *
     * @mbggenerated
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column partner_user_binds.is_deleted
     *
     * @param isDeleted the value for partner_user_binds.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_user_binds
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platformId=").append(platformId);
        sb.append(", userId=").append(userId);
        sb.append(", parentUserId=").append(parentUserId);
        sb.append(", path=").append(path);
        sb.append(", name=").append(name);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", inviteUserId=").append(inviteUserId);
        sb.append(", status=").append(status);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}