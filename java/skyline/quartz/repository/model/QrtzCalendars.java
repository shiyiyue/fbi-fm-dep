package skyline.quartz.repository.model;

public class QrtzCalendars {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_CALENDARS.CALENDAR_NAME
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    private String calendarName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_CALENDARS.CALENDAR
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    private byte[] calendar;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_CALENDARS.CALENDAR_NAME
     *
     * @return the value of QRTZ_CALENDARS.CALENDAR_NAME
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_CALENDARS.CALENDAR_NAME
     *
     * @param calendarName the value for QRTZ_CALENDARS.CALENDAR_NAME
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName == null ? null : calendarName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_CALENDARS.CALENDAR
     *
     * @return the value of QRTZ_CALENDARS.CALENDAR
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public byte[] getCalendar() {
        return calendar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_CALENDARS.CALENDAR
     *
     * @param calendar the value for QRTZ_CALENDARS.CALENDAR
     *
     * @mbggenerated Tue Nov 22 13:18:46 CST 2011
     */
    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}