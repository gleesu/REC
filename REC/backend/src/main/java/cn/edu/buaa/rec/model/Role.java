package cn.edu.buaa.rec.model;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.build_time
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private Date buildTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.update_time
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.creator_id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.project_id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private Long projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.use_state
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    private String useState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.description
     *
     * @return the value of role.description
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.description
     *
     * @param description the value for role.description
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.build_time
     *
     * @return the value of role.build_time
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.build_time
     *
     * @param buildTime the value for role.build_time
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.update_time
     *
     * @return the value of role.update_time
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.update_time
     *
     * @param updateTime the value for role.update_time
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.creator_id
     *
     * @return the value of role.creator_id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.creator_id
     *
     * @param creatorId the value for role.creator_id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.project_id
     *
     * @return the value of role.project_id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.project_id
     *
     * @param projectId the value for role.project_id
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.use_state
     *
     * @return the value of role.use_state
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public String getUseState() {
        return useState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.use_state
     *
     * @param useState the value for role.use_state
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
    }
}