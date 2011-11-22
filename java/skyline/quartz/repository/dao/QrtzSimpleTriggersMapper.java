package skyline.quartz.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.quartz.repository.model.QrtzSimpleTriggers;
import skyline.quartz.repository.model.QrtzSimpleTriggersExample;
import skyline.quartz.repository.model.QrtzSimpleTriggersKey;

public interface QrtzSimpleTriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int countByExample(QrtzSimpleTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int deleteByExample(QrtzSimpleTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int deleteByPrimaryKey(QrtzSimpleTriggersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int insert(QrtzSimpleTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int insertSelective(QrtzSimpleTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    List<QrtzSimpleTriggers> selectByExample(QrtzSimpleTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    QrtzSimpleTriggers selectByPrimaryKey(QrtzSimpleTriggersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExampleSelective(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExample(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SIMPLE_TRIGGERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKey(QrtzSimpleTriggers record);
}