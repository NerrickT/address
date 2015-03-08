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
public class AddressesFactsSortingCode extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode> {

	private static final long serialVersionUID = 2011162710;

	/**
	 * The reference instance of <code>addresses_facts_sorting_code</code>
	 */
	public static final opus.address.database.jooq.generated.tables.AddressesFactsSortingCode AddressesFactsSortingCode = new opus.address.database.jooq.generated.tables.AddressesFactsSortingCode();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode.class;
	}

	/**
	 * The column <code>addresses_facts_sorting_code.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>addresses_facts_sorting_code.address_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode, java.lang.Long> AddressId = createField("address_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>addresses_facts_sorting_code.sorting_code</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode, java.lang.String> SortingCode = createField("sorting_code", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>addresses_facts_sorting_code</code> table reference
	 */
	public AddressesFactsSortingCode() {
		this("addresses_facts_sorting_code", null);
	}

	/**
	 * Create an aliased <code>addresses_facts_sorting_code</code> table reference
	 */
	public AddressesFactsSortingCode(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.AddressesFactsSortingCode.AddressesFactsSortingCode);
	}

	private AddressesFactsSortingCode(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode> aliased) {
		this(alias, aliased, null);
	}

	private AddressesFactsSortingCode(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_ADDRESS_FACTS_SORTING_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode>>asList(opus.address.database.jooq.generated.Keys.PK_ADDRESS_FACTS_SORTING_CODE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.AddressesFactsSortingCode, ?>>asList(opus.address.database.jooq.generated.Keys.ADDRESSES_FACTS_SORTING_CODE__FK_ADDRESSES_FACTS_SORTING_CODE_EVENTS, opus.address.database.jooq.generated.Keys.ADDRESSES_FACTS_SORTING_CODE__FK_ADDRESSES_FACTS_SORTING_CODE_ADDRESSES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.AddressesFactsSortingCode as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.AddressesFactsSortingCode(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.AddressesFactsSortingCode rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.AddressesFactsSortingCode(name, null);
	}
}
