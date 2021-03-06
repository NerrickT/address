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
public class PhoneFactType extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord> {

	private static final long serialVersionUID = -741060628;

	/**
	 * The reference instance of <code>phone_fact_type</code>
	 */
	public static final opus.address.database.jooq.generated.tables.PhoneFactType PhoneFactType = new opus.address.database.jooq.generated.tables.PhoneFactType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord.class;
	}

	/**
	 * The column <code>phone_fact_type.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>phone_fact_type.phone_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord, java.lang.Long> PhoneId = createField("phone_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>phone_fact_type.type</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord, java.lang.String> Type = createField("type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>phone_fact_type</code> table reference
	 */
	public PhoneFactType() {
		this("phone_fact_type", null);
	}

	/**
	 * Create an aliased <code>phone_fact_type</code> table reference
	 */
	public PhoneFactType(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.PhoneFactType.PhoneFactType);
	}

	private PhoneFactType(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private PhoneFactType(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_PHONE_FACT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord>>asList(opus.address.database.jooq.generated.Keys.PK_PHONE_FACT_TYPE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.PhoneFactTypeRecord, ?>>asList(opus.address.database.jooq.generated.Keys.PHONE_FACT_TYPE__FK_PHONE_FACT_TYPE_EVENT, opus.address.database.jooq.generated.Keys.PHONE_FACT_TYPE__FK_PHONE_FACT_TYPE_PHONE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.PhoneFactType as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.PhoneFactType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.PhoneFactType rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.PhoneFactType(name, null);
	}
}
