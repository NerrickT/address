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
public class PhonesFactsType extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.PhonesFactsType> {

	private static final long serialVersionUID = -300290263;

	/**
	 * The reference instance of <code>phones_facts_type</code>
	 */
	public static final opus.address.database.jooq.generated.tables.PhonesFactsType PhonesFactsType = new opus.address.database.jooq.generated.tables.PhonesFactsType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.PhonesFactsType> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.PhonesFactsType.class;
	}

	/**
	 * The column <code>phones_facts_type.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhonesFactsType, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>phones_facts_type.phone_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhonesFactsType, java.lang.Long> PhoneId = createField("phone_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>phones_facts_type.type</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhonesFactsType, java.lang.String> Type = createField("type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>phones_facts_type</code> table reference
	 */
	public PhonesFactsType() {
		this("phones_facts_type", null);
	}

	/**
	 * Create an aliased <code>phones_facts_type</code> table reference
	 */
	public PhonesFactsType(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.PhonesFactsType.PhonesFactsType);
	}

	private PhonesFactsType(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PhonesFactsType> aliased) {
		this(alias, aliased, null);
	}

	private PhonesFactsType(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PhonesFactsType> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhonesFactsType> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_PHONES_FACTS_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhonesFactsType>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhonesFactsType>>asList(opus.address.database.jooq.generated.Keys.PK_PHONES_FACTS_TYPE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.PhonesFactsType, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.PhonesFactsType, ?>>asList(opus.address.database.jooq.generated.Keys.PHONES_FACTS_TYPE__FK_PHONES_FACTS_TYPE_EVENTS, opus.address.database.jooq.generated.Keys.PHONES_FACTS_TYPE__FK_PHONES_FACTS_TYPE_PHONES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.PhonesFactsType as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.PhonesFactsType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.PhonesFactsType rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.PhonesFactsType(name, null);
	}
}
