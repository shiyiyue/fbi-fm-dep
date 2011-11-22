package skyline.quartz.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.quartz.repository.model.QrtzSchedulerState;
import skyline.quartz.repository.model.QrtzSchedulerStateExample;

public interface QrtzSchedulerStateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int countByExample(QrtzSchedulerStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int deleteByExample(QrtzSchedulerStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int deleteByPrimaryKey(String instanceName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int insert(QrtzSchedulerState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int insertSelective(QrtzSchedulerState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    List<QrtzSchedulerState> selectByExample(QrtzSchedulerStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    QrtzSchedulerState selectByPrimaryKey(String instanceName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExampleSelective(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByExample(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_SCHEDULER_STATE
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    int updateByPrimaryKey(QrtzSchedulerState record);
}