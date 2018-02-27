package cn.edu.buaa.rec.model;

import java.util.Date;

public class Domain {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.name
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.creator_id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.build_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Date buildTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.update_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.use_state
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String useState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.isApproved
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Integer isapproved;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.description
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.id
     *
     * @return the value of domain.id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.id
     *
     * @param id the value for domain.id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.name
     *
     * @return the value of domain.name
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.name
     *
     * @param name the value for domain.name
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.creator_id
     *
     * @return the value of domain.creator_id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.creator_id
     *
     * @param creatorId the value for domain.creator_id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.build_time
     *
     * @return the value of domain.build_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.build_time
     *
     * @param buildTime the value for domain.build_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.update_time
     *
     * @return the value of domain.update_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.update_time
     *
     * @param updateTime the value for domain.update_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.use_state
     *
     * @return the value of domain.use_state
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getUseState() {
        return useState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.use_state
     *
     * @param useState the value for domain.use_state
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.isApproved
     *
     * @return the value of domain.isApproved
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public Integer getIsapproved() {
        return isapproved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.isApproved
     *
     * @param isapproved the value for domain.isApproved
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setIsapproved(Integer isapproved) {
        this.isapproved = isapproved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.description
     *
     * @return the value of domain.description
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.description
     *
     * @param description the value for domain.description
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}