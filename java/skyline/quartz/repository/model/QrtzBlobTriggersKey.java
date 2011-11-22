package skyline.quartz.repository.model;

public class QrtzBlobTriggersKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    private String triggerGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_BLOB_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    private String triggerName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP
     *
     * @return the value of QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP
     *
     * @param triggerGroup the value for QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup == null ? null : triggerGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_BLOB_TRIGGERS.TRIGGER_NAME
     *
     * @return the value of QRTZ_BLOB_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_BLOB_TRIGGERS.TRIGGER_NAME
     *
     * @param triggerName the value for QRTZ_BLOB_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName == null ? null : triggerName.trim();
    }
}