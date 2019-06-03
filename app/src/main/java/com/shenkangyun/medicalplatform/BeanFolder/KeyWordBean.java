package com.shenkangyun.medicalplatform.BeanFolder;

import java.util.List;

/**
 * Created by Administrator on 2018/5/5.
 */

public class KeyWordBean {

    /**
     * status : 0
     * data : {"pageCount":10,"totalCount":1,"pageNo":0,"list":[{"keyWordName":"孤独症","id":"5","name":"泰安市复退军人精神病院","responsibilityName":"赵燕","prevention":"","scope":"精神疾病的诊断治疗，心理咨询，康复。","subsidy":"免鉴定费80元。持有残疾证的精神病患者，符合服药条件经过审批后到泰安市复退军人精神病医院享受400元药品补助。","content":"泰安市复员退伍军人精神病院（泰安市优抚医院），是一家集精神疾病预防、治疗、康复为主兼优抚对象康复休养为一体的优抚医院。<br />","provinceID":"370000","cityID":"370900","regionID":"370902","street":"370902001","village":null,"phone":"5361329","xAxis":"117.148992","yAxis":"36.201349","bdContent":null,"createUser":"admin","createTime":1510648637000,"updateUser":"admin","updateTime":1523521796000,"delFlag":0,"delTime":1522225947000,"remark":null}],"baiduMessage":["孤独症（autism），又称自闭症或孤独性障碍（autistic disorder）等，是广泛性发育障碍（pervasive developmental disorder，PDD）的代表性疾病。《DSM-IV-TR》将PDD分为5种：孤独性障碍、Retts综合征、童年瓦解性障碍、Asperger综合征和未特定的PDD。其中，孤独性障碍与Asperger综合征较为常见。孤独症的患病率报道不一，一般认为约为儿童人口的2～5/万人，男女比例约为3：1～4：1，女孩症状一般较男孩严重。"]}
     */

    private String status;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * pageCount : 10
         * totalCount : 1
         * pageNo : 0
         * list : [{"keyWordName":"孤独症","id":"5","name":"泰安市复退军人精神病院","responsibilityName":"赵燕","prevention":"","scope":"精神疾病的诊断治疗，心理咨询，康复。","subsidy":"免鉴定费80元。持有残疾证的精神病患者，符合服药条件经过审批后到泰安市复退军人精神病医院享受400元药品补助。","content":"泰安市复员退伍军人精神病院（泰安市优抚医院），是一家集精神疾病预防、治疗、康复为主兼优抚对象康复休养为一体的优抚医院。<br />","provinceID":"370000","cityID":"370900","regionID":"370902","street":"370902001","village":null,"phone":"5361329","xAxis":"117.148992","yAxis":"36.201349","bdContent":null,"createUser":"admin","createTime":1510648637000,"updateUser":"admin","updateTime":1523521796000,"delFlag":0,"delTime":1522225947000,"remark":null}]
         * baiduMessage : ["孤独症（autism），又称自闭症或孤独性障碍（autistic disorder）等，是广泛性发育障碍（pervasive developmental disorder，PDD）的代表性疾病。《DSM-IV-TR》将PDD分为5种：孤独性障碍、Retts综合征、童年瓦解性障碍、Asperger综合征和未特定的PDD。其中，孤独性障碍与Asperger综合征较为常见。孤独症的患病率报道不一，一般认为约为儿童人口的2～5/万人，男女比例约为3：1～4：1，女孩症状一般较男孩严重。"]
         */

        private int pageCount;
        private int totalCount;
        private int pageNo;
        private List<ListBean> list;
        private List<String> baiduMessage;

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<String> getBaiduMessage() {
            return baiduMessage;
        }

        public void setBaiduMessage(List<String> baiduMessage) {
            this.baiduMessage = baiduMessage;
        }

        public static class ListBean {
            /**
             * keyWordName : 孤独症
             * id : 5
             * name : 泰安市复退军人精神病院
             * responsibilityName : 赵燕
             * prevention :
             * scope : 精神疾病的诊断治疗，心理咨询，康复。
             * subsidy : 免鉴定费80元。持有残疾证的精神病患者，符合服药条件经过审批后到泰安市复退军人精神病医院享受400元药品补助。
             * content : 泰安市复员退伍军人精神病院（泰安市优抚医院），是一家集精神疾病预防、治疗、康复为主兼优抚对象康复休养为一体的优抚医院。<br />
             * provinceID : 370000
             * cityID : 370900
             * regionID : 370902
             * street : 370902001
             * village : null
             * phone : 5361329
             * xAxis : 117.148992
             * yAxis : 36.201349
             * bdContent : null
             * createUser : admin
             * createTime : 1510648637000
             * updateUser : admin
             * updateTime : 1523521796000
             * delFlag : 0
             * delTime : 1522225947000
             * remark : null
             */

            private String keyWordName;
            private String id;
            private String name;
            private String responsibilityName;
            private String prevention;
            private String scope;
            private String subsidy;
            private String content;
            private String provinceID;
            private String cityID;
            private String regionID;
            private String street;
            private Object village;
            private String phone;
            private String xAxis;
            private String yAxis;
            private Object bdContent;
            private String createUser;
            private long createTime;
            private String updateUser;
            private long updateTime;
            private int delFlag;
            private long delTime;
            private Object remark;

            public String getKeyWordName() {
                return keyWordName;
            }

            public void setKeyWordName(String keyWordName) {
                this.keyWordName = keyWordName;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getResponsibilityName() {
                return responsibilityName;
            }

            public void setResponsibilityName(String responsibilityName) {
                this.responsibilityName = responsibilityName;
            }

            public String getPrevention() {
                return prevention;
            }

            public void setPrevention(String prevention) {
                this.prevention = prevention;
            }

            public String getScope() {
                return scope;
            }

            public void setScope(String scope) {
                this.scope = scope;
            }

            public String getSubsidy() {
                return subsidy;
            }

            public void setSubsidy(String subsidy) {
                this.subsidy = subsidy;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getProvinceID() {
                return provinceID;
            }

            public void setProvinceID(String provinceID) {
                this.provinceID = provinceID;
            }

            public String getCityID() {
                return cityID;
            }

            public void setCityID(String cityID) {
                this.cityID = cityID;
            }

            public String getRegionID() {
                return regionID;
            }

            public void setRegionID(String regionID) {
                this.regionID = regionID;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public Object getVillage() {
                return village;
            }

            public void setVillage(Object village) {
                this.village = village;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getXAxis() {
                return xAxis;
            }

            public void setXAxis(String xAxis) {
                this.xAxis = xAxis;
            }

            public String getYAxis() {
                return yAxis;
            }

            public void setYAxis(String yAxis) {
                this.yAxis = yAxis;
            }

            public Object getBdContent() {
                return bdContent;
            }

            public void setBdContent(Object bdContent) {
                this.bdContent = bdContent;
            }

            public String getCreateUser() {
                return createUser;
            }

            public void setCreateUser(String createUser) {
                this.createUser = createUser;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public String getUpdateUser() {
                return updateUser;
            }

            public void setUpdateUser(String updateUser) {
                this.updateUser = updateUser;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public int getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(int delFlag) {
                this.delFlag = delFlag;
            }

            public long getDelTime() {
                return delTime;
            }

            public void setDelTime(long delTime) {
                this.delTime = delTime;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }
        }
    }
}
