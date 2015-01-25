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
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhoneEntities extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.PhoneEntities> {

	private static final long serialVersionUID = 745036076;

	/**
	 * The reference instance of <code>phone_entities</code>
	 */
	public static final opus.address.database.jooq.generated.tables.PhoneEntities PhoneEntities = new opus.address.database.jooq.generated.tables.PhoneEntities();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.PhoneEntities> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.PhoneEntities.class;
	}

	/**
	 * The column <code>phone_entities.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhoneEntities, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>phone_entities.entity_type</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.PhoneEntities, opus.address.database.jooq.generated.enums.EntityTypeEnum> EntityType = createField("entity_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(opus.address.database.jooq.generated.enums.EntityTypeEnum.class), this, "");

	/**
	 * Create a <code>phone_entities</code> table reference
	 */
	public PhoneEntities() {
		this("phone_entities", null);
	}

	/**
	 * Create an aliased <code>phone_entities</code> table reference
	 */
	public PhoneEntities(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.PhoneEntities.PhoneEntities);
	}

	private PhoneEntities(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PhoneEntities> aliased) {
		this(alias, aliased, null);
	}

	private PhoneEntities(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.PhoneEntities> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<opus.address.database.jooq.generated.tables.records.PhoneEntities, java.lang.Long> getIdentity() {
		return opus.address.database.jooq.generated.Keys.IDENTITY_PhoneEntities;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhoneEntities> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PHONE_ENTITIES_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhoneEntities>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.PhoneEntities>>asList(opus.address.database.jooq.generated.Keys.PHONE_ENTITIES_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.PhoneEntities as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.PhoneEntities(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.PhoneEntities rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.PhoneEntities(name, null);
	}
}