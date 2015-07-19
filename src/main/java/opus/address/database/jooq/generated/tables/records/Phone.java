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
public class Phone extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.Phone> implements org.jooq.Record2<java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -604201597;

	/**
	 * Setter for <code>phone.phone_id</code>.
	 */
	public void phoneId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>phone.phone_id</code>.
	 */
	public java.lang.Long phoneId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>phone.parent_id</code>.
	 */
	public void parentId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>phone.parent_id</code>.
	 */
	public java.lang.Long parentId() {
		return (java.lang.Long) getValue(1);
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
		return opus.address.database.jooq.generated.tables.Phone.Phone.PhoneId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.Phone.Phone.ParentId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return phoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return parentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Phone value1(java.lang.Long value) {
		phoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Phone value2(java.lang.Long value) {
		parentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Phone values(java.lang.Long value1, java.lang.Long value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Phone
	 */
	public Phone() {
		super(opus.address.database.jooq.generated.tables.Phone.Phone);
	}

	/**
	 * Create a detached, initialised Phone
	 */
	public Phone(java.lang.Long phoneId, java.lang.Long parentId) {
		super(opus.address.database.jooq.generated.tables.Phone.Phone);

		setValue(0, phoneId);
		setValue(1, parentId);
	}
}
