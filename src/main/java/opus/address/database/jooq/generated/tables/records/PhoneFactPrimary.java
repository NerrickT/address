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
public class PhoneFactPrimary extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.PhoneFactPrimary> implements org.jooq.Record2<java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 856197661;

	/**
	 * Setter for <code>phone_fact_primary.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>phone_fact_primary.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>phone_fact_primary.phone_id</code>.
	 */
	public void phoneId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>phone_fact_primary.phone_id</code>.
	 */
	public java.lang.Long phoneId() {
		return (java.lang.Long) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return opus.address.database.jooq.generated.tables.PhoneFactPrimary.PhoneFactPrimary.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.PhoneFactPrimary.PhoneFactPrimary.PhoneId;
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
	public PhoneFactPrimary value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhoneFactPrimary value2(java.lang.Long value) {
		phoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhoneFactPrimary values(java.lang.Long value1, java.lang.Long value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PhoneFactPrimary
	 */
	public PhoneFactPrimary() {
		super(opus.address.database.jooq.generated.tables.PhoneFactPrimary.PhoneFactPrimary);
	}

	/**
	 * Create a detached, initialised PhoneFactPrimary
	 */
	public PhoneFactPrimary(java.lang.Long sequence, java.lang.Long phoneId) {
		super(opus.address.database.jooq.generated.tables.PhoneFactPrimary.PhoneFactPrimary);

		setValue(0, sequence);
		setValue(1, phoneId);
	}
}
