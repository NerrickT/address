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
public class EmailsFactsLocalPart extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.EmailsFactsLocalPart> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = -488725002;

	/**
	 * Setter for <code>emails_facts_local_part.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>emails_facts_local_part.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>emails_facts_local_part.email_id</code>.
	 */
	public void emailId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>emails_facts_local_part.email_id</code>.
	 */
	public java.lang.Long emailId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>emails_facts_local_part.local_part</code>.
	 */
	public void localPart(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>emails_facts_local_part.local_part</code>.
	 */
	public java.lang.String localPart() {
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
		return opus.address.database.jooq.generated.tables.EmailsFactsLocalPart.EmailsFactsLocalPart.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.EmailsFactsLocalPart.EmailsFactsLocalPart.EmailId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return opus.address.database.jooq.generated.tables.EmailsFactsLocalPart.EmailsFactsLocalPart.LocalPart;
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
		return emailId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return localPart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailsFactsLocalPart value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailsFactsLocalPart value2(java.lang.Long value) {
		emailId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailsFactsLocalPart value3(java.lang.String value) {
		localPart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailsFactsLocalPart values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmailsFactsLocalPart
	 */
	public EmailsFactsLocalPart() {
		super(opus.address.database.jooq.generated.tables.EmailsFactsLocalPart.EmailsFactsLocalPart);
	}

	/**
	 * Create a detached, initialised EmailsFactsLocalPart
	 */
	public EmailsFactsLocalPart(java.lang.Long sequence, java.lang.Long emailId, java.lang.String localPart) {
		super(opus.address.database.jooq.generated.tables.EmailsFactsLocalPart.EmailsFactsLocalPart);

		setValue(0, sequence);
		setValue(1, emailId);
		setValue(2, localPart);
	}
}