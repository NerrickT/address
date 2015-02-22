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
public class EntityPhoneFacts extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts> {

	private static final long serialVersionUID = 338058091;

	/**
	 * The reference instance of <code>entity_phone_facts</code>
	 */
	public static final opus.address.database.jooq.generated.tables.EntityPhoneFacts EntityPhoneFacts = new opus.address.database.jooq.generated.tables.EntityPhoneFacts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.EntityPhoneFacts.class;
	}

	/**
	 * The column <code>entity_phone_facts.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>entity_phone_facts.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>entity_phone_facts.phone_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts, java.lang.Long> PhoneId = createField("phone_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>entity_phone_facts</code> table reference
	 */
	public EntityPhoneFacts() {
		this("entity_phone_facts", null);
	}

	/**
	 * Create an aliased <code>entity_phone_facts</code> table reference
	 */
	public EntityPhoneFacts(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.EntityPhoneFacts.EntityPhoneFacts);
	}

	private EntityPhoneFacts(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts> aliased) {
		this(alias, aliased, null);
	}

	private EntityPhoneFacts(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_ENTITY_PHONE_FACTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts>>asList(opus.address.database.jooq.generated.Keys.PK_ENTITY_PHONE_FACTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EntityPhoneFacts, ?>>asList(opus.address.database.jooq.generated.Keys.ENTITY_PHONE_FACTS__FK_ENTITY_PHONE_FACTS_EVENTS, opus.address.database.jooq.generated.Keys.ENTITY_PHONE_FACTS__FK_ENTITY_PHONE_FACTS_ENTITIES, opus.address.database.jooq.generated.Keys.ENTITY_PHONE_FACTS__FK_ENTITY_PHONE_FACTS_PHONES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.EntityPhoneFacts as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.EntityPhoneFacts(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.EntityPhoneFacts rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.EntityPhoneFacts(name, null);
	}
}
