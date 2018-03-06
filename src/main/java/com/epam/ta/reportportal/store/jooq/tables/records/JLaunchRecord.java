/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.enums.JLaunchModeEnum;
import com.epam.ta.reportportal.store.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.store.jooq.tables.JLaunch;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLaunchRecord extends UpdatableRecordImpl<JLaunchRecord>
		implements Record10<Long, Integer, Integer, String, String, Timestamp, Integer, Timestamp, JLaunchModeEnum, JStatusEnum> {

	private static final long serialVersionUID = -153032851;

	/**
	 * Setter for <code>public.launch.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.launch.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.launch.project_id</code>.
	 */
	public void setProjectId(Integer value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.launch.project_id</code>.
	 */
	public Integer getProjectId() {
		return (Integer) get(1);
	}

	/**
	 * Setter for <code>public.launch.user_id</code>.
	 */
	public void setUserId(Integer value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.launch.user_id</code>.
	 */
	public Integer getUserId() {
		return (Integer) get(2);
	}

	/**
	 * Setter for <code>public.launch.name</code>.
	 */
	public void setName(String value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.launch.name</code>.
	 */
	public String getName() {
		return (String) get(3);
	}

	/**
	 * Setter for <code>public.launch.description</code>.
	 */
	public void setDescription(String value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.launch.description</code>.
	 */
	public String getDescription() {
		return (String) get(4);
	}

	/**
	 * Setter for <code>public.launch.start_time</code>.
	 */
	public void setStartTime(Timestamp value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.launch.start_time</code>.
	 */
	public Timestamp getStartTime() {
		return (Timestamp) get(5);
	}

	/**
	 * Setter for <code>public.launch.number</code>.
	 */
	public void setNumber(Integer value) {
		set(6, value);
	}

	/**
	 * Getter for <code>public.launch.number</code>.
	 */
	public Integer getNumber() {
		return (Integer) get(6);
	}

	/**
	 * Setter for <code>public.launch.last_modified</code>.
	 */
	public void setLastModified(Timestamp value) {
		set(7, value);
	}

	/**
	 * Getter for <code>public.launch.last_modified</code>.
	 */
	public Timestamp getLastModified() {
		return (Timestamp) get(7);
	}

	/**
	 * Setter for <code>public.launch.mode</code>.
	 */
	public void setMode(JLaunchModeEnum value) {
		set(8, value);
	}

	/**
	 * Getter for <code>public.launch.mode</code>.
	 */
	public JLaunchModeEnum getMode() {
		return (JLaunchModeEnum) get(8);
	}

	/**
	 * Setter for <code>public.launch.status</code>.
	 */
	public void setStatus(JStatusEnum value) {
		set(9, value);
	}

	/**
	 * Getter for <code>public.launch.status</code>.
	 */
	public JStatusEnum getStatus() {
		return (JStatusEnum) get(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Long, Integer, Integer, String, String, Timestamp, Integer, Timestamp, JLaunchModeEnum, JStatusEnum> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Long, Integer, Integer, String, String, Timestamp, Integer, Timestamp, JLaunchModeEnum, JStatusEnum> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JLaunch.LAUNCH.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return JLaunch.LAUNCH.PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return JLaunch.LAUNCH.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return JLaunch.LAUNCH.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return JLaunch.LAUNCH.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return JLaunch.LAUNCH.START_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return JLaunch.LAUNCH.NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return JLaunch.LAUNCH.LAST_MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JLaunchModeEnum> field9() {
		return JLaunch.LAUNCH.MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JStatusEnum> field10() {
		return JLaunch.LAUNCH.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component2() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component6() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component7() {
		return getNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component8() {
		return getLastModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchModeEnum component9() {
		return getMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatusEnum component10() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getLastModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchModeEnum value9() {
		return getMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatusEnum value10() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value2(Integer value) {
		setProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value3(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value5(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value6(Timestamp value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value7(Integer value) {
		setNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value8(Timestamp value) {
		setLastModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value9(JLaunchModeEnum value) {
		setMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord value10(JStatusEnum value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchRecord values(Long value1, Integer value2, Integer value3, String value4, String value5, Timestamp value6, Integer value7,
			Timestamp value8, JLaunchModeEnum value9, JStatusEnum value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JLaunchRecord
	 */
	public JLaunchRecord() {
		super(JLaunch.LAUNCH);
	}

	/**
	 * Create a detached, initialised JLaunchRecord
	 */
	public JLaunchRecord(Long id, Integer projectId, Integer userId, String name, String description, Timestamp startTime, Integer number,
			Timestamp lastModified, JLaunchModeEnum mode, JStatusEnum status) {
		super(JLaunch.LAUNCH);

		set(0, id);
		set(1, projectId);
		set(2, userId);
		set(3, name);
		set(4, description);
		set(5, startTime);
		set(6, number);
		set(7, lastModified);
		set(8, mode);
		set(9, status);
	}
}
