/**
 * This class is generated by jOOQ
 */
package opus.address.database.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventRecord extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.EventRecord> implements org.jooq.Record6<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1703260432;

	/**
	 * Setter for <code>event.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>event.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>event.event_name</code>.
	 */
	public void eventName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>event.event_name</code>.
	 */
	public java.lang.String eventName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>event.code_version</code>.
	 */
	public void codeVersion(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>event.code_version</code>.
	 */
	public java.lang.String codeVersion() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>event.actor</code>.
	 */
	public void actor(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>event.actor</code>.
	 */
	public java.lang.Long actor() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>event.tables_affected</code>.
	 */
	public void tablesAffected(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>event.tables_affected</code>.
	 */
	public java.lang.String tablesAffected() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>event.when</code>.
	 */
	public void when(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>event.when</code>.
	 */
	public java.sql.Timestamp when() {
		return (java.sql.Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return opus.address.database.jooq.generated.tables.Event.Event.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return opus.address.database.jooq.generated.tables.Event.Event.EventName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return opus.address.database.jooq.generated.tables.Event.Event.CodeVersion;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return opus.address.database.jooq.generated.tables.Event.Event.Actor;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return opus.address.database.jooq.generated.tables.Event.Event.TablesAffected;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return opus.address.database.jooq.generated.tables.Event.Event.When;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return sequence();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return eventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return codeVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return actor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return tablesAffected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return when();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value2(java.lang.String value) {
		eventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value3(java.lang.String value) {
		codeVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value4(java.lang.Long value) {
		actor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value5(java.lang.String value) {
		tablesAffected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value6(java.sql.Timestamp value) {
		when(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3, java.lang.Long value4, java.lang.String value5, java.sql.Timestamp value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventRecord
	 */
	public EventRecord() {
		super(opus.address.database.jooq.generated.tables.Event.Event);
	}

	/**
	 * Create a detached, initialised EventRecord
	 */
	public EventRecord(java.lang.Long sequence, java.lang.String eventName, java.lang.String codeVersion, java.lang.Long actor, java.lang.String tablesAffected, java.sql.Timestamp when) {
		super(opus.address.database.jooq.generated.tables.Event.Event);

		setValue(0, sequence);
		setValue(1, eventName);
		setValue(2, codeVersion);
		setValue(3, actor);
		setValue(4, tablesAffected);
		setValue(5, when);
	}
}