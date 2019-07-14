package com.wga.sell.dataobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * ProductCategory
 *
 * @Author wanggaian
 * @Date 2019/7/13 17:57
 */
@Entity
public class ProductCategory {

    /** 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名 */
    private String categoryName;

    /** 类目类型 */
    private Integer categoryType;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
