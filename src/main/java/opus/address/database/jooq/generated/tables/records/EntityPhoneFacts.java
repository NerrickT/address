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
public class EntityPhoneFacts extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -719633745;

	/**
	 * Setter for <code>entity_phone_facts.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>entity_phone_facts.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>entity_phone_facts.entity_id</code>.
	 */
	public void entityId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>entity_phone_facts.entity_id</code>.
	 */
	public java.lang.Long entityId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>entity_phone_facts.phone_id</code>.
	 */
	public void phoneId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>entity_phone_facts.phone_id</code>.
	 */
	public java.lang.Long phoneId() {
		return (java.lang.Long) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.Long> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return opus.address.database.jooq.generated.tables.EntityPhoneFacts.EntityPhoneFacts.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.EntityPhoneFacts.EntityPhoneFacts.EntityId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return opus.address.database.jooq.generated.tables.EntityPhoneFacts.EntityPhoneFacts.PhoneId;
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
		return entityId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return phoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntityPhoneFacts value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntityPhoneFacts value2(java.lang.Long value) {
		entityId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntityPhoneFacts value3(java.lang.Long value) {
		phoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EntityPhoneFacts values(java.lang.Long value1, java.lang.Long value2, java.lang.Long value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EntityPhoneFacts
	 */
	public EntityPhoneFacts() {
		super(opus.address.database.jooq.generated.tables.EntityPhoneFacts.EntityPhoneFacts);
	}

	/**
	 * Create a detached, initialised EntityPhoneFacts
	 */
	public EntityPhoneFacts(java.lang.Long sequence, java.lang.Long entityId, java.lang.Long phoneId) {
		super(opus.address.database.jooq.generated.tables.EntityPhoneFacts.EntityPhoneFacts);

		setValue(0, sequence);
		setValue(1, entityId);
		setValue(2, phoneId);
	}
}