package cn.edu.buaa.rec.model;

public class UsecaseRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usecase_role.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usecase_role.usecase_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long usecaseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usecase_role.role_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    private Long roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usecase_role.id
     *
     * @return the value of usecase_role.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usecase_role.id
     *
     * @param id the value for usecase_role.id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usecase_role.usecase_id
     *
     * @return the value of usecase_role.usecase_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getUsecaseId() {
        return usecaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usecase_role.usecase_id
     *
     * @param usecaseId the value for usecase_role.usecase_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setUsecaseId(Long usecaseId) {
        this.usecaseId = usecaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usecase_role.role_id
     *
     * @return the value of usecase_role.role_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usecase_role.role_id
     *
     * @param roleId the value for usecase_role.role_id
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}