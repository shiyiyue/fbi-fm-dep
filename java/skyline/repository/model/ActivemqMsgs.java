package skyline.repository.model;

import java.math.BigDecimal;

public class ActivemqMsgs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.ID
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.CONTAINER
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private String container;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.MSGID_PROD
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private String msgidProd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.MSGID_SEQ
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private BigDecimal msgidSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.EXPIRATION
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private BigDecimal expiration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.PRIORITY
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private BigDecimal priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACTIVEMQ_MSGS.MSG
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    private byte[] msg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.ID
     *
     * @return the value of ACTIVEMQ_MSGS.ID
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.ID
     *
     * @param id the value for ACTIVEMQ_MSGS.ID
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.CONTAINER
     *
     * @return the value of ACTIVEMQ_MSGS.CONTAINER
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public String getContainer() {
        return container;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.CONTAINER
     *
     * @param container the value for ACTIVEMQ_MSGS.CONTAINER
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setContainer(String container) {
        this.container = container == null ? null : container.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.MSGID_PROD
     *
     * @return the value of ACTIVEMQ_MSGS.MSGID_PROD
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public String getMsgidProd() {
        return msgidProd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.MSGID_PROD
     *
     * @param msgidProd the value for ACTIVEMQ_MSGS.MSGID_PROD
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setMsgidProd(String msgidProd) {
        this.msgidProd = msgidProd == null ? null : msgidProd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.MSGID_SEQ
     *
     * @return the value of ACTIVEMQ_MSGS.MSGID_SEQ
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public BigDecimal getMsgidSeq() {
        return msgidSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.MSGID_SEQ
     *
     * @param msgidSeq the value for ACTIVEMQ_MSGS.MSGID_SEQ
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setMsgidSeq(BigDecimal msgidSeq) {
        this.msgidSeq = msgidSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.EXPIRATION
     *
     * @return the value of ACTIVEMQ_MSGS.EXPIRATION
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public BigDecimal getExpiration() {
        return expiration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.EXPIRATION
     *
     * @param expiration the value for ACTIVEMQ_MSGS.EXPIRATION
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setExpiration(BigDecimal expiration) {
        this.expiration = expiration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.PRIORITY
     *
     * @return the value of ACTIVEMQ_MSGS.PRIORITY
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.PRIORITY
     *
     * @param priority the value for ACTIVEMQ_MSGS.PRIORITY
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACTIVEMQ_MSGS.MSG
     *
     * @return the value of ACTIVEMQ_MSGS.MSG
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public byte[] getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACTIVEMQ_MSGS.MSG
     *
     * @param msg the value for ACTIVEMQ_MSGS.MSG
     *
     * @mbggenerated Fri Oct 28 13:00:28 CST 2011
     */
    public void setMsg(byte[] msg) {
        this.msg = msg;
    }
}