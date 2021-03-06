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
public class AddressFactDependentLocalityRecord extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocalityRecord> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = 1060108024;

	/**
	 * Setter for <code>address_fact_dependent_locality.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>address_fact_dependent_locality.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>address_fact_dependent_locality.address_id</code>.
	 */
	public void addressId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>address_fact_dependent_locality.address_id</code>.
	 */
	public java.lang.Long addressId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>address_fact_dependent_locality.dependent_locality</code>.
	 */
	public void dependentLocality(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>address_fact_dependent_locality.dependent_locality</code>.
	 */
	public java.lang.String dependentLocality() {
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
		return opus.address.database.jooq.generated.tables.AddressFactDependentLocality.AddressFactDependentLocality.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.AddressFactDependentLocality.AddressFactDependentLocality.AddressId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return opus.address.database.jooq.generated.tables.AddressFactDependentLocality.AddressFactDependentLocality.DependentLocality;
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
		return addressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return dependentLocality();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFactDependentLocalityRecord value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFactDependentLocalityRecord value2(java.lang.Long value) {
		addressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFactDependentLocalityRecord value3(java.lang.String value) {
		dependentLocality(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFactDependentLocalityRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressFactDependentLocalityRecord
	 */
	public AddressFactDependentLocalityRecord() {
		super(opus.address.database.jooq.generated.tables.AddressFactDependentLocality.AddressFactDependentLocality);
	}

	/**
	 * Create a detached, initialised AddressFactDependentLocalityRecord
	 */
	public AddressFactDependentLocalityRecord(java.lang.Long sequence, java.lang.Long addressId, java.lang.String dependentLocality) {
		super(opus.address.database.jooq.generated.tables.AddressFactDependentLocality.AddressFactDependentLocality);

		setValue(0, sequence);
		setValue(1, addressId);
		setValue(2, dependentLocality);
	}
}
