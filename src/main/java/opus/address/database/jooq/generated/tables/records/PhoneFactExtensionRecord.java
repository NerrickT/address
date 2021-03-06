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
public class PhoneFactExtensionRecord extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.PhoneFactExtensionRecord> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = 1067143365;

	/**
	 * Setter for <code>phone_fact_extension.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>phone_fact_extension.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>phone_fact_extension.phone_id</code>.
	 */
	public void phoneId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>phone_fact_extension.phone_id</code>.
	 */
	public java.lang.Long phoneId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>phone_fact_extension.number</code>.
	 */
	public void number(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>phone_fact_extension.number</code>.
	 */
	public java.lang.String number() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Long, java.lang.Long> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return opus.address.database.jooq.generated.tables.PhoneFactExtension.PhoneFactExtension.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.PhoneFactExtension.PhoneFactExtension.PhoneId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return opus.address.database.jooq.generated.tables.PhoneFactExtension.PhoneFactExtension.Number;
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
	public java.lang.Long value2() {
		return phoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return number();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhoneFactExtensionRecord value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhoneFactExtensionRecord value2(java.lang.Long value) {
		phoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhoneFactExtensionRecord value3(java.lang.String value) {
		number(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhoneFactExtensionRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PhoneFactExtensionRecord
	 */
	public PhoneFactExtensionRecord() {
		super(opus.address.database.jooq.generated.tables.PhoneFactExtension.PhoneFactExtension);
	}

	/**
	 * Create a detached, initialised PhoneFactExtensionRecord
	 */
	public PhoneFactExtensionRecord(java.lang.Long sequence, java.lang.Long phoneId, java.lang.String number) {
		super(opus.address.database.jooq.generated.tables.PhoneFactExtension.PhoneFactExtension);

		setValue(0, sequence);
		setValue(1, phoneId);
		setValue(2, number);
	}
}
