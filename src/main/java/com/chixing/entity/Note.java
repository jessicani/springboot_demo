package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * note
 * @author 
 */
public class Note implements Serializable {
    private Integer noteId;

    /**
     * 用户id
     */
    private Integer custId;

    /**
     * 游记标题
     */
    private String noteTitle;

    /**
     * 游记头图类型
     */
    private String noteHeadImg;

    /**
     * 游记发表时间
     */
    private Date noteCreateTime;

    /**
     * 游记修改时间
     */
    private Date noteUpdateTime;

    /**
     * 游记出行国家
     */
    private String noteCountry;

    /**
     * 游记出行城市
     */
    private String noteCity;

    /**
     * 游记出行市区/街道
     */
    private String noteArea;

    /**
     * 游记种类
     */
    private Integer noteType;

    /**
     * 游记文字总量
     */
    private Integer noteCharCount;

    /**
     * 游记图片总量
     */
    private Integer noteImgCount;

    /**
     * 游记中旅游出发时间
     */
    private Date noteTripDate;

    /**
     * 游记中旅游天数
     */
    private String noteTripDays;

    /**
     * 游记中旅游人数
     */
    private Integer noteTripPeopleCount;

    /**
     * 游记中旅游人均费用
     */
    private Float noteAvgCost;

    /**
     * 游记中旅游同行的人
     */
    private Integer notePartner;

    /**
     * 游记阅读量
     */
    private Integer noteReadCount;

    /**
     * 游记收藏量
     */
    private Integer noteCollectCount;

    /**
     * 游记点赞量
     */
    private Integer noteLikeCount;

    /**
     * 游记评论量
     */
    private Integer noteCommentCount;

    /**
     * 搜索的关键字
     */
    private String noteSearchKeyword;

    /**
     * 游记状态
     */
    private Integer noteStatus;

    /**
     * 备用字段1
     */
    private String others1;

    /**
     * 备用字段2
     */
    private String others2;

    /**
     * 游记内容
     */
    private String noteContent;

    private static final long serialVersionUID = 1L;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteHeadImg() {
        return noteHeadImg;
    }

    public void setNoteHeadImg(String noteHeadImg) {
        this.noteHeadImg = noteHeadImg;
    }

    public Date getNoteCreateTime() {
        return noteCreateTime;
    }

    public void setNoteCreateTime(Date noteCreateTime) {
        this.noteCreateTime = noteCreateTime;
    }

    public Date getNoteUpdateTime() {
        return noteUpdateTime;
    }

    public void setNoteUpdateTime(Date noteUpdateTime) {
        this.noteUpdateTime = noteUpdateTime;
    }

    public String getNoteCountry() {
        return noteCountry;
    }

    public void setNoteCountry(String noteCountry) {
        this.noteCountry = noteCountry;
    }

    public String getNoteCity() {
        return noteCity;
    }

    public void setNoteCity(String noteCity) {
        this.noteCity = noteCity;
    }

    public String getNoteArea() {
        return noteArea;
    }

    public void setNoteArea(String noteArea) {
        this.noteArea = noteArea;
    }

    public Integer getNoteType() {
        return noteType;
    }

    public void setNoteType(Integer noteType) {
        this.noteType = noteType;
    }

    public Integer getNoteCharCount() {
        return noteCharCount;
    }

    public void setNoteCharCount(Integer noteCharCount) {
        this.noteCharCount = noteCharCount;
    }

    public Integer getNoteImgCount() {
        return noteImgCount;
    }

    public void setNoteImgCount(Integer noteImgCount) {
        this.noteImgCount = noteImgCount;
    }

    public Date getNoteTripDate() {
        return noteTripDate;
    }

    public void setNoteTripDate(Date noteTripDate) {
        this.noteTripDate = noteTripDate;
    }

    public String getNoteTripDays() {
        return noteTripDays;
    }

    public void setNoteTripDays(String noteTripDays) {
        this.noteTripDays = noteTripDays;
    }

    public Integer getNoteTripPeopleCount() {
        return noteTripPeopleCount;
    }

    public void setNoteTripPeopleCount(Integer noteTripPeopleCount) {
        this.noteTripPeopleCount = noteTripPeopleCount;
    }

    public Float getNoteAvgCost() {
        return noteAvgCost;
    }

    public void setNoteAvgCost(Float noteAvgCost) {
        this.noteAvgCost = noteAvgCost;
    }

    public Integer getNotePartner() {
        return notePartner;
    }

    public void setNotePartner(Integer notePartner) {
        this.notePartner = notePartner;
    }

    public Integer getNoteReadCount() {
        return noteReadCount;
    }

    public void setNoteReadCount(Integer noteReadCount) {
        this.noteReadCount = noteReadCount;
    }

    public Integer getNoteCollectCount() {
        return noteCollectCount;
    }

    public void setNoteCollectCount(Integer noteCollectCount) {
        this.noteCollectCount = noteCollectCount;
    }

    public Integer getNoteLikeCount() {
        return noteLikeCount;
    }

    public void setNoteLikeCount(Integer noteLikeCount) {
        this.noteLikeCount = noteLikeCount;
    }

    public Integer getNoteCommentCount() {
        return noteCommentCount;
    }

    public void setNoteCommentCount(Integer noteCommentCount) {
        this.noteCommentCount = noteCommentCount;
    }

    public String getNoteSearchKeyword() {
        return noteSearchKeyword;
    }

    public void setNoteSearchKeyword(String noteSearchKeyword) {
        this.noteSearchKeyword = noteSearchKeyword;
    }

    public Integer getNoteStatus() {
        return noteStatus;
    }

    public void setNoteStatus(Integer noteStatus) {
        this.noteStatus = noteStatus;
    }

    public String getOthers1() {
        return others1;
    }

    public void setOthers1(String others1) {
        this.others1 = others1;
    }

    public String getOthers2() {
        return others2;
    }

    public void setOthers2(String others2) {
        this.others2 = others2;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Note other = (Note) that;
        return (this.getNoteId() == null ? other.getNoteId() == null : this.getNoteId().equals(other.getNoteId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getNoteTitle() == null ? other.getNoteTitle() == null : this.getNoteTitle().equals(other.getNoteTitle()))
            && (this.getNoteHeadImg() == null ? other.getNoteHeadImg() == null : this.getNoteHeadImg().equals(other.getNoteHeadImg()))
            && (this.getNoteCreateTime() == null ? other.getNoteCreateTime() == null : this.getNoteCreateTime().equals(other.getNoteCreateTime()))
            && (this.getNoteUpdateTime() == null ? other.getNoteUpdateTime() == null : this.getNoteUpdateTime().equals(other.getNoteUpdateTime()))
            && (this.getNoteCountry() == null ? other.getNoteCountry() == null : this.getNoteCountry().equals(other.getNoteCountry()))
            && (this.getNoteCity() == null ? other.getNoteCity() == null : this.getNoteCity().equals(other.getNoteCity()))
            && (this.getNoteArea() == null ? other.getNoteArea() == null : this.getNoteArea().equals(other.getNoteArea()))
            && (this.getNoteType() == null ? other.getNoteType() == null : this.getNoteType().equals(other.getNoteType()))
            && (this.getNoteCharCount() == null ? other.getNoteCharCount() == null : this.getNoteCharCount().equals(other.getNoteCharCount()))
            && (this.getNoteImgCount() == null ? other.getNoteImgCount() == null : this.getNoteImgCount().equals(other.getNoteImgCount()))
            && (this.getNoteTripDate() == null ? other.getNoteTripDate() == null : this.getNoteTripDate().equals(other.getNoteTripDate()))
            && (this.getNoteTripDays() == null ? other.getNoteTripDays() == null : this.getNoteTripDays().equals(other.getNoteTripDays()))
            && (this.getNoteTripPeopleCount() == null ? other.getNoteTripPeopleCount() == null : this.getNoteTripPeopleCount().equals(other.getNoteTripPeopleCount()))
            && (this.getNoteAvgCost() == null ? other.getNoteAvgCost() == null : this.getNoteAvgCost().equals(other.getNoteAvgCost()))
            && (this.getNotePartner() == null ? other.getNotePartner() == null : this.getNotePartner().equals(other.getNotePartner()))
            && (this.getNoteReadCount() == null ? other.getNoteReadCount() == null : this.getNoteReadCount().equals(other.getNoteReadCount()))
            && (this.getNoteCollectCount() == null ? other.getNoteCollectCount() == null : this.getNoteCollectCount().equals(other.getNoteCollectCount()))
            && (this.getNoteLikeCount() == null ? other.getNoteLikeCount() == null : this.getNoteLikeCount().equals(other.getNoteLikeCount()))
            && (this.getNoteCommentCount() == null ? other.getNoteCommentCount() == null : this.getNoteCommentCount().equals(other.getNoteCommentCount()))
            && (this.getNoteSearchKeyword() == null ? other.getNoteSearchKeyword() == null : this.getNoteSearchKeyword().equals(other.getNoteSearchKeyword()))
            && (this.getNoteStatus() == null ? other.getNoteStatus() == null : this.getNoteStatus().equals(other.getNoteStatus()))
            && (this.getOthers1() == null ? other.getOthers1() == null : this.getOthers1().equals(other.getOthers1()))
            && (this.getOthers2() == null ? other.getOthers2() == null : this.getOthers2().equals(other.getOthers2()))
            && (this.getNoteContent() == null ? other.getNoteContent() == null : this.getNoteContent().equals(other.getNoteContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoteId() == null) ? 0 : getNoteId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getNoteTitle() == null) ? 0 : getNoteTitle().hashCode());
        result = prime * result + ((getNoteHeadImg() == null) ? 0 : getNoteHeadImg().hashCode());
        result = prime * result + ((getNoteCreateTime() == null) ? 0 : getNoteCreateTime().hashCode());
        result = prime * result + ((getNoteUpdateTime() == null) ? 0 : getNoteUpdateTime().hashCode());
        result = prime * result + ((getNoteCountry() == null) ? 0 : getNoteCountry().hashCode());
        result = prime * result + ((getNoteCity() == null) ? 0 : getNoteCity().hashCode());
        result = prime * result + ((getNoteArea() == null) ? 0 : getNoteArea().hashCode());
        result = prime * result + ((getNoteType() == null) ? 0 : getNoteType().hashCode());
        result = prime * result + ((getNoteCharCount() == null) ? 0 : getNoteCharCount().hashCode());
        result = prime * result + ((getNoteImgCount() == null) ? 0 : getNoteImgCount().hashCode());
        result = prime * result + ((getNoteTripDate() == null) ? 0 : getNoteTripDate().hashCode());
        result = prime * result + ((getNoteTripDays() == null) ? 0 : getNoteTripDays().hashCode());
        result = prime * result + ((getNoteTripPeopleCount() == null) ? 0 : getNoteTripPeopleCount().hashCode());
        result = prime * result + ((getNoteAvgCost() == null) ? 0 : getNoteAvgCost().hashCode());
        result = prime * result + ((getNotePartner() == null) ? 0 : getNotePartner().hashCode());
        result = prime * result + ((getNoteReadCount() == null) ? 0 : getNoteReadCount().hashCode());
        result = prime * result + ((getNoteCollectCount() == null) ? 0 : getNoteCollectCount().hashCode());
        result = prime * result + ((getNoteLikeCount() == null) ? 0 : getNoteLikeCount().hashCode());
        result = prime * result + ((getNoteCommentCount() == null) ? 0 : getNoteCommentCount().hashCode());
        result = prime * result + ((getNoteSearchKeyword() == null) ? 0 : getNoteSearchKeyword().hashCode());
        result = prime * result + ((getNoteStatus() == null) ? 0 : getNoteStatus().hashCode());
        result = prime * result + ((getOthers1() == null) ? 0 : getOthers1().hashCode());
        result = prime * result + ((getOthers2() == null) ? 0 : getOthers2().hashCode());
        result = prime * result + ((getNoteContent() == null) ? 0 : getNoteContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noteId=").append(noteId);
        sb.append(", custId=").append(custId);
        sb.append(", noteTitle=").append(noteTitle);
        sb.append(", noteHeadImg=").append(noteHeadImg);
        sb.append(", noteCreateTime=").append(noteCreateTime);
        sb.append(", noteUpdateTime=").append(noteUpdateTime);
        sb.append(", noteCountry=").append(noteCountry);
        sb.append(", noteCity=").append(noteCity);
        sb.append(", noteArea=").append(noteArea);
        sb.append(", noteType=").append(noteType);
        sb.append(", noteCharCount=").append(noteCharCount);
        sb.append(", noteImgCount=").append(noteImgCount);
        sb.append(", noteTripDate=").append(noteTripDate);
        sb.append(", noteTripDays=").append(noteTripDays);
        sb.append(", noteTripPeopleCount=").append(noteTripPeopleCount);
        sb.append(", noteAvgCost=").append(noteAvgCost);
        sb.append(", notePartner=").append(notePartner);
        sb.append(", noteReadCount=").append(noteReadCount);
        sb.append(", noteCollectCount=").append(noteCollectCount);
        sb.append(", noteLikeCount=").append(noteLikeCount);
        sb.append(", noteCommentCount=").append(noteCommentCount);
        sb.append(", noteSearchKeyword=").append(noteSearchKeyword);
        sb.append(", noteStatus=").append(noteStatus);
        sb.append(", others1=").append(others1);
        sb.append(", others2=").append(others2);
        sb.append(", noteContent=").append(noteContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}