package skyline.quartz.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.quartz.repository.model.QrtzTriggers;
import skyline.quartz.repository.model.QrtzTriggersExample;
import skyline.quartz.repository.model.QrtzTriggersKey;

public interface QrtzTriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int countByExample(QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int deleteByExample(QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int deleteByPrimaryKey(QrtzTriggersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int insert(QrtzTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int insertSelective(QrtzTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    List<QrtzTriggers> selectByExampleWithBLOBs(QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    QrtzTriggers selectByPrimaryKey(QrtzTriggersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExampleWithBLOBs(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKeySelective(QrtzTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKey(QrtzTriggers record);
}