package model;

import java.util.Date;

public class TItem {
    private Integer id;

    private String name;

    private Integer prix;

    private Integer repertory;

    private String barcode;

    private String tExplain;

    private Integer status;

    private Date createdDate;

    private Date updateDate;

    public TItem(Integer id, String name, Integer prix, Integer repertory, String barcode, String tExplain, Integer status, Date createdDate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.prix = prix;
        this.repertory = repertory;
        this.barcode = barcode;
        this.tExplain = tExplain;
        this.status = status;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }

    public TItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String gettExplain() {
        return tExplain;
    }

    public void settExplain(String tExplain) {
        this.tExplain = tExplain == null ? null : tExplain.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}