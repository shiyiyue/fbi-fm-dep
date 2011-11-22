package skyline.quartz.repository.model;

import java.util.ArrayList;
import java.util.List;

public class QrtzJobListenersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public QrtzJobListenersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("JOB_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("JOB_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("JOB_GROUP =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("JOB_GROUP <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("JOB_GROUP >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("JOB_GROUP <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("JOB_GROUP like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("JOB_GROUP not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("JOB_GROUP in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("JOB_GROUP not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("JOB_GROUP between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("JOB_GROUP not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobListenerIsNull() {
            addCriterion("JOB_LISTENER is null");
            return (Criteria) this;
        }

        public Criteria andJobListenerIsNotNull() {
            addCriterion("JOB_LISTENER is not null");
            return (Criteria) this;
        }

        public Criteria andJobListenerEqualTo(String value) {
            addCriterion("JOB_LISTENER =", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerNotEqualTo(String value) {
            addCriterion("JOB_LISTENER <>", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerGreaterThan(String value) {
            addCriterion("JOB_LISTENER >", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_LISTENER >=", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerLessThan(String value) {
            addCriterion("JOB_LISTENER <", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerLessThanOrEqualTo(String value) {
            addCriterion("JOB_LISTENER <=", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerLike(String value) {
            addCriterion("JOB_LISTENER like", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerNotLike(String value) {
            addCriterion("JOB_LISTENER not like", value, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerIn(List<String> values) {
            addCriterion("JOB_LISTENER in", values, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerNotIn(List<String> values) {
            addCriterion("JOB_LISTENER not in", values, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerBetween(String value1, String value2) {
            addCriterion("JOB_LISTENER between", value1, value2, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobListenerNotBetween(String value1, String value2) {
            addCriterion("JOB_LISTENER not between", value1, value2, "jobListener");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated do_not_delete_during_merge Tue Nov 22 13:18:46 CST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QRTZ_JOB_LISTENERS
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}