/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueTypeProjectConfigurationRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueTypeProjectConfiguration extends TableImpl<JIssueTypeProjectConfigurationRecord> {

	private static final long serialVersionUID = -570192949;

	/**
	 * The reference instance of <code>public.issue_type_project_configuration</code>
	 */
	public static final JIssueTypeProjectConfiguration ISSUE_TYPE_PROJECT_CONFIGURATION = new JIssueTypeProjectConfiguration();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JIssueTypeProjectConfigurationRecord> getRecordType() {
		return JIssueTypeProjectConfigurationRecord.class;
	}

	/**
	 * The column <code>public.issue_type_project_configuration.configuration_id</code>.
	 */
	public final TableField<JIssueTypeProjectConfigurationRecord, Integer> CONFIGURATION_ID = createField(
			"configuration_id",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.issue_type_project_configuration.issue_type_id</code>.
	 */
	public final TableField<JIssueTypeProjectConfigurationRecord, Integer> ISSUE_TYPE_ID = createField(
			"issue_type_id",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false),
			this,
			""
	);

	/**
	 * Create a <code>public.issue_type_project_configuration</code> table reference
	 */
	public JIssueTypeProjectConfiguration() {
		this(DSL.name("issue_type_project_configuration"), null);
	}

	/**
	 * Create an aliased <code>public.issue_type_project_configuration</code> table reference
	 */
	public JIssueTypeProjectConfiguration(String alias) {
		this(DSL.name(alias), ISSUE_TYPE_PROJECT_CONFIGURATION);
	}

	/**
	 * Create an aliased <code>public.issue_type_project_configuration</code> table reference
	 */
	public JIssueTypeProjectConfiguration(Name alias) {
		this(alias, ISSUE_TYPE_PROJECT_CONFIGURATION);
	}

	private JIssueTypeProjectConfiguration(Name alias, Table<JIssueTypeProjectConfigurationRecord> aliased) {
		this(alias, aliased, null);
	}

	private JIssueTypeProjectConfiguration(Name alias, Table<JIssueTypeProjectConfigurationRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return JPublic.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes() {
		return Arrays.<Index>asList(Indexes.ISSUE_TYPE_PROJECT_CONFIGURATION_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JIssueTypeProjectConfigurationRecord> getPrimaryKey() {
		return Keys.ISSUE_TYPE_PROJECT_CONFIGURATION_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JIssueTypeProjectConfigurationRecord>> getKeys() {
		return Arrays.<UniqueKey<JIssueTypeProjectConfigurationRecord>>asList(Keys.ISSUE_TYPE_PROJECT_CONFIGURATION_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JIssueTypeProjectConfigurationRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JIssueTypeProjectConfigurationRecord, ?>>asList(
				Keys.ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY,
				Keys.ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY
		);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectConfiguration as(String alias) {
		return new JIssueTypeProjectConfiguration(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectConfiguration as(Name alias) {
		return new JIssueTypeProjectConfiguration(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueTypeProjectConfiguration rename(String name) {
		return new JIssueTypeProjectConfiguration(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueTypeProjectConfiguration rename(Name name) {
		return new JIssueTypeProjectConfiguration(name, null);
	}
}
