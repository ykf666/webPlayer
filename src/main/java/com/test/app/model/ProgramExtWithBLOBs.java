package com.test.app.model;

public class ProgramExtWithBLOBs extends ProgramExt {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tv_program_ext.description
     *
     * @mbggenerated Tue Jul 12 14:04:26 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tv_program_ext.package_code
     *
     * @mbggenerated Tue Jul 12 14:04:26 CST 2016
     */
    private String packageCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tv_program_ext.description
     *
     * @return the value of tv_program_ext.description
     *
     * @mbggenerated Tue Jul 12 14:04:26 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tv_program_ext.description
     *
     * @param description the value for tv_program_ext.description
     *
     * @mbggenerated Tue Jul 12 14:04:26 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tv_program_ext.package_code
     *
     * @return the value of tv_program_ext.package_code
     *
     * @mbggenerated Tue Jul 12 14:04:26 CST 2016
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tv_program_ext.package_code
     *
     * @param packageCode the value for tv_program_ext.package_code
     *
     * @mbggenerated Tue Jul 12 14:04:26 CST 2016
     */
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode == null ? null : packageCode.trim();
    }
}