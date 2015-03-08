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
public class AddressesFactsAddressLine extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine> {

	private static final long serialVersionUID = -1328460241;

	/**
	 * The reference instance of <code>addresses_facts_address_line</code>
	 */
	public static final opus.address.database.jooq.generated.tables.AddressesFactsAddressLine AddressesFactsAddressLine = new opus.address.database.jooq.generated.tables.AddressesFactsAddressLine();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine.class;
	}

	/**
	 * The column <code>addresses_facts_address_line.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>addresses_facts_address_line.address_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine, java.lang.Long> AddressId = createField("address_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>addresses_facts_address_line.address_line</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine, java.lang.String> AddressLine = createField("address_line", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>addresses_facts_address_line</code> table reference
	 */
	public AddressesFactsAddressLine() {
		this("addresses_facts_address_line", null);
	}

	/**
	 * Create an aliased <code>addresses_facts_address_line</code> table reference
	 */
	public AddressesFactsAddressLine(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.AddressesFactsAddressLine.AddressesFactsAddressLine);
	}

	private AddressesFactsAddressLine(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine> aliased) {
		this(alias, aliased, null);
	}

	private AddressesFactsAddressLine(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_ADDRESS_FACTS_ADDRESS_LINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine>>asList(opus.address.database.jooq.generated.Keys.PK_ADDRESS_FACTS_ADDRESS_LINE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.AddressesFactsAddressLine, ?>>asList(opus.address.database.jooq.generated.Keys.ADDRESSES_FACTS_ADDRESS_LINE__FK_ADDRESSES_FACTS_ADDRESS_LINE_EVENTS, opus.address.database.jooq.generated.Keys.ADDRESSES_FACTS_ADDRESS_LINE__FK_ADDRESSES_FACTS_ADDRESS_LINE_ADDRESSES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.AddressesFactsAddressLine as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.AddressesFactsAddressLine(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.AddressesFactsAddressLine rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.AddressesFactsAddressLine(name, null);
	}
}
