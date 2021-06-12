package com.example;

import javax.persistence.*;

@Entity
@Table(name = "camping")
class Camping{
    @Id
    private String campId;

    private String cname;
    private String cdesc;
    private String cloc;
    private String cbank;
    private String cphone;
    private String cemail;
    private String cadd;
    private String cut;
    /*for thesis A*/
    private int aquantity;
    private int afield;
    private int acost;
    /*for thesis B*/
    private int bquantity;
    private int bfield;
    private int bcost;
    /*for thesis C*/
    private int cquantity;
    private int cfield;
    private int ccost;

    private String image;

    public Camping() {}

    public Camping(String campId, String cname, String cdesc,
                   String cloc, String cbank, String cphone,
                   String cemail, String cadd, String cut,
                   int aquantity, int afield, int acost,
                   int bquantity, int bfield, int bcost,
                   int cquantity, int cfield, int ccost, String image) {
        this.campId = campId;
        this.cname = cname;
        this.cdesc = cdesc;
        this.cloc = cloc;
        this.cbank = cbank;
        this.cphone = cphone;
        this.cemail = cemail;
        this.cadd = cadd;
        this.cut = cut;
        this.aquantity = aquantity;
        this.afield = afield;
        this.acost = acost;
        this.bquantity = bquantity;
        this.bfield = bfield;
        this.bcost = bcost;
        this.cquantity = cquantity;
        this.cfield = cfield;
        this.ccost = ccost;
        this.image = image;
    }

    public String getCampId() {
        return campId;
    }

    public String getCname() {
        return cname;
    }

    public String getCdesc() {
        return cdesc;
    }

    public String getCloc() {
        return cloc;
    }

    public String getCbank() {
        return cbank;
    }

    public String getCphone() {
        return cphone;
    }

    public String getCemail() {
        return cemail;
    }

    public String getCadd() {
        return cadd;
    }

    public String getCut() {
        return cut;
    }

    public int getAquantity() {
        return aquantity;
    }

    public int getAfield() {
        return afield;
    }

    public int getAcost() {
        return acost;
    }

    public int getBquantity() {
        return bquantity;
    }

    public int getBfield() {
        return bfield;
    }

    public int getBcost() {
        return bcost;
    }

    public int getCquantity() {
        return cquantity;
    }

    public int getCfield() {
        return cfield;
    }

    public int getCcost() {
        return ccost;
    }

    public String getImage() {
        return image;
    }
}