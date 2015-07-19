/**
 * This class is generated by jOOQ
 */
package opus.address.database.jooq.generated.tables;

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
public class AddressFactDependentLocality extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality> {

	private static final long serialVersionUID = 1165374492;

	/**
	 * The reference instance of <code>address_fact_dependent_locality</code>
	 */
	public static final opus.address.database.jooq.generated.tables.AddressFactDependentLocality AddressFactDependentLocality = new opus.address.database.jooq.generated.tables.AddressFactDependentLocality();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality.class;
	}

	/**
	 * The column <code>address_fact_dependent_locality.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>address_fact_dependent_locality.address_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality, java.lang.Long> AddressId = createField("address_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>address_fact_dependent_locality.dependent_locality</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality, java.lang.String> DependentLocality = createField("dependent_locality", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>address_fact_dependent_locality</code> table reference
	 */
	public AddressFactDependentLocality() {
		this("address_fact_dependent_locality", null);
	}

	/**
	 * Create an aliased <code>address_fact_dependent_locality</code> table reference
	 */
	public AddressFactDependentLocality(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.AddressFactDependentLocality.AddressFactDependentLocality);
	}

	private AddressFactDependentLocality(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality> aliased) {
		this(alias, aliased, null);
	}

	private AddressFactDependentLocality(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_ADDRESS_FACT_DEPENDENT_LOCALITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality>>asList(opus.address.database.jooq.generated.Keys.PK_ADDRESS_FACT_DEPENDENT_LOCALITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.AddressFactDependentLocality, ?>>asList(opus.address.database.jooq.generated.Keys.ADDRESS_FACT_DEPENDENT_LOCALITY__FK_ADDRESS_FACT_DEPENDENT_LOCALITY_EVENT, opus.address.database.jooq.generated.Keys.ADDRESS_FACT_DEPENDENT_LOCALITY__FK_ADDRESS_FACT_DEPENDENT_LOCALITY_ADDRESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.AddressFactDependentLocality as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.AddressFactDependentLocality(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.AddressFactDependentLocality rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.AddressFactDependentLocality(name, null);
	}
}
