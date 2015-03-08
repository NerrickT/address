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
public class PhonesFactsDoNotCall extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.PhonesFactsDoNotCall> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.Boolean> {

	private static final long serialVersionUID = -1049728447;

	/**
	 * Setter for <code>phones_facts_do_not_call.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>phones_facts_do_not_call.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>phones_facts_do_not_call.phone_id</code>.
	 */
	public void phoneId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>phones_facts_do_not_call.phone_id</code>.
	 */
	public java.lang.Long phoneId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>phones_facts_do_not_call.do_not_call</code>.
	 */
	public void doNotCall(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>phones_facts_do_not_call.do_not_call</code>.
	 */
	public java.lang.Boolean doNotCall() {
		return (java.lang.Boolean) getValue(2);
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
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return opus.address.database.jooq.generated.tables.PhonesFactsDoNotCall.PhonesFactsDoNotCall.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.PhonesFactsDoNotCall.PhonesFactsDoNotCall.PhoneId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return opus.address.database.jooq.generated.tables.PhonesFactsDoNotCall.PhonesFactsDoNotCall.DoNotCall;
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
	public java.lang.Boolean value3() {
		return doNotCall();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonesFactsDoNotCall value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonesFactsDoNotCall value2(java.lang.Long value) {
		phoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonesFactsDoNotCall value3(java.lang.Boolean value) {
		doNotCall(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PhonesFactsDoNotCall values(java.lang.Long value1, java.lang.Long value2, java.lang.Boolean value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PhonesFactsDoNotCall
	 */
	public PhonesFactsDoNotCall() {
		super(opus.address.database.jooq.generated.tables.PhonesFactsDoNotCall.PhonesFactsDoNotCall);
	}

	/**
	 * Create a detached, initialised PhonesFactsDoNotCall
	 */
	public PhonesFactsDoNotCall(java.lang.Long sequence, java.lang.Long phoneId, java.lang.Boolean doNotCall) {
		super(opus.address.database.jooq.generated.tables.PhonesFactsDoNotCall.PhonesFactsDoNotCall);

		setValue(0, sequence);
		setValue(1, phoneId);
		setValue(2, doNotCall);
	}
}
