package com.xmh.integrate.entity;

import java.sql.Timestamp;

/**
 * 描述：
 *
 * @author xmh
 * @date 2020/12/25 17:10
 */
public class AbstractEntity {
    private Long id;
    private String createdBy;
    private Timestamp createdAt;
    private String modifiedBy;
    private Timestamp modifiedAt;
    private Timestamp versionNo;
    private Integer rowStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Timestamp getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Timestamp versionNo) {
        this.versionNo = versionNo;
    }

    public Integer getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(Integer rowStatus) {
        this.rowStatus = rowStatus;
    }
}
