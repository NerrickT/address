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
public class AddressFacts extends org.jooq.impl.UpdatableRecordImpl<opus.address.database.jooq.generated.tables.records.AddressFacts> implements org.jooq.Record13<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = 426661473;

	/**
	 * Setter for <code>address_facts.sequence</code>.
	 */
	public void sequence(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>address_facts.sequence</code>.
	 */
	public java.lang.Long sequence() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>address_facts.address_id</code>.
	 */
	public void addressId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>address_facts.address_id</code>.
	 */
	public java.lang.Long addressId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>address_facts.country_code</code>.
	 */
	public void countryCode(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>address_facts.country_code</code>.
	 */
	public java.lang.String countryCode() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>address_facts.address_line</code>.
	 */
	public void addressLine(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>address_facts.address_line</code>.
	 */
	public java.lang.String addressLine() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>address_facts.administrative_area</code>.
	 */
	public void administrativeArea(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>address_facts.administrative_area</code>.
	 */
	public java.lang.String administrativeArea() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>address_facts.locality</code>.
	 */
	public void locality(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>address_facts.locality</code>.
	 */
	public java.lang.String locality() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>address_facts.dependent_locality</code>.
	 */
	public void dependentLocality(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>address_facts.dependent_locality</code>.
	 */
	public java.lang.String dependentLocality() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>address_facts.postal_code</code>.
	 */
	public void postalCode(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>address_facts.postal_code</code>.
	 */
	public java.lang.String postalCode() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>address_facts.sorting_code</code>.
	 */
	public void sortingCode(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>address_facts.sorting_code</code>.
	 */
	public java.lang.String sortingCode() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>address_facts.organization</code>.
	 */
	public void organization(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>address_facts.organization</code>.
	 */
	public java.lang.String organization() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>address_facts.recipient</code>.
	 */
	public void recipient(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>address_facts.recipient</code>.
	 */
	public java.lang.String recipient() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>address_facts.language_code</code>.
	 */
	public void languageCode(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>address_facts.language_code</code>.
	 */
	public java.lang.String languageCode() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>address_facts.is_deleted</code>.
	 */
	public void isDeleted(java.lang.Boolean value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>address_facts.is_deleted</code>.
	 */
	public java.lang.Boolean isDeleted() {
		return (java.lang.Boolean) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.Sequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.AddressId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.CountryCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.AddressLine;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.AdministrativeArea;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.Locality;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.DependentLocality;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.PostalCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.SortingCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.Organization;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.Recipient;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.LanguageCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field13() {
		return opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts.IsDeleted;
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
		return countryCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return addressLine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return administrativeArea();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return locality();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return dependentLocality();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return postalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return sortingCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return organization();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return recipient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return languageCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value13() {
		return isDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value1(java.lang.Long value) {
		sequence(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value2(java.lang.Long value) {
		addressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value3(java.lang.String value) {
		countryCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value4(java.lang.String value) {
		addressLine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value5(java.lang.String value) {
		administrativeArea(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value6(java.lang.String value) {
		locality(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value7(java.lang.String value) {
		dependentLocality(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value8(java.lang.String value) {
		postalCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value9(java.lang.String value) {
		sortingCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value10(java.lang.String value) {
		organization(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value11(java.lang.String value) {
		recipient(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value12(java.lang.String value) {
		languageCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts value13(java.lang.Boolean value) {
		isDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressFacts values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.Boolean value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressFacts
	 */
	public AddressFacts() {
		super(opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts);
	}

	/**
	 * Create a detached, initialised AddressFacts
	 */
	public AddressFacts(java.lang.Long sequence, java.lang.Long addressId, java.lang.String countryCode, java.lang.String addressLine, java.lang.String administrativeArea, java.lang.String locality, java.lang.String dependentLocality, java.lang.String postalCode, java.lang.String sortingCode, java.lang.String organization, java.lang.String recipient, java.lang.String languageCode, java.lang.Boolean isDeleted) {
		super(opus.address.database.jooq.generated.tables.AddressFacts.AddressFacts);

		setValue(0, sequence);
		setValue(1, addressId);
		setValue(2, countryCode);
		setValue(3, addressLine);
		setValue(4, administrativeArea);
		setValue(5, locality);
		setValue(6, dependentLocality);
		setValue(7, postalCode);
		setValue(8, sortingCode);
		setValue(9, organization);
		setValue(10, recipient);
		setValue(11, languageCode);
		setValue(12, isDeleted);
	}
}