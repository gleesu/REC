package cn.edu.buaa.rec.model;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.build_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Date buildTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.update_time
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.creator_id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.project_id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Long projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.type
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.authority
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String authority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.use_frequency
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String useFrequency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.use_platform
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String usePlatform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.language
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String language;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.interact_mode
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String interactMode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.input
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String input;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.output
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String output;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.use_state
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    private String useState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.type
     *
     * @return the value of role.type
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.type
     *
     * @param type the value for role.type
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.authority
     *
     * @return the value of role.authority
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.authority
     *
     * @param authority the value for role.authority
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.use_frequency
     *
     * @return the value of role.use_frequency
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getUseFrequency() {
        return useFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.use_frequency
     *
     * @param useFrequency the value for role.use_frequency
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setUseFrequency(String useFrequency) {
        this.useFrequency = useFrequency == null ? null : useFrequency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.use_platform
     *
     * @return the value of role.use_platform
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getUsePlatform() {
        return usePlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.use_platform
     *
     * @param usePlatform the value for role.use_platform
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setUsePlatform(String usePlatform) {
        this.usePlatform = usePlatform == null ? null : usePlatform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.language
     *
     * @return the value of role.language
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.language
     *
     * @param language the value for role.language
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.interact_mode
     *
     * @return the value of role.interact_mode
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getInteractMode() {
        return interactMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.interact_mode
     *
     * @param interactMode the value for role.interact_mode
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setInteractMode(String interactMode) {
        this.interactMode = interactMode == null ? null : interactMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.input
     *
     * @return the value of role.input
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getInput() {
        return input;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.input
     *
     * @param input the value for role.input
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setInput(String input) {
        this.input = input == null ? null : input.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.output
     *
     * @return the value of role.output
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public String getOutput() {
        return output;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.output
     *
     * @param output the value for role.output
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.use_state
     *
     * @return the value of role.use_state
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
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
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
    }
}