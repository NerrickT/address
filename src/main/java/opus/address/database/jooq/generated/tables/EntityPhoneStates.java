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
public class EntityPhoneStates extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.EntityPhoneStates> {

	private static final long serialVersionUID = 303048771;

	/**
	 * The reference instance of <code>entity_phone_states</code>
	 */
	public static final opus.address.database.jooq.generated.tables.EntityPhoneStates EntityPhoneStates = new opus.address.database.jooq.generated.tables.EntityPhoneStates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.EntityPhoneStates> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.EntityPhoneStates.class;
	}

	/**
	 * The column <code>entity_phone_states.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EntityPhoneStates, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>entity_phone_states.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EntityPhoneStates, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>entity_phone_states.phone_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.EntityPhoneStates, java.lang.Long> PhoneId = createField("phone_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>entity_phone_states</code> table reference
	 */
	public EntityPhoneStates() {
		this("entity_phone_states", null);
	}

	/**
	 * Create an aliased <code>entity_phone_states</code> table reference
	 */
	public EntityPhoneStates(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.EntityPhoneStates.EntityPhoneStates);
	}

	private EntityPhoneStates(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EntityPhoneStates> aliased) {
		this(alias, aliased, null);
	}

	private EntityPhoneStates(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.EntityPhoneStates> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EntityPhoneStates> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_ENTITY_PHONE_STATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EntityPhoneStates>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.EntityPhoneStates>>asList(opus.address.database.jooq.generated.Keys.PK_ENTITY_PHONE_STATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EntityPhoneStates, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.EntityPhoneStates, ?>>asList(opus.address.database.jooq.generated.Keys.ENTITY_PHONE_STATES__FK_ENTITY_PHONE_STATES_EVENTS, opus.address.database.jooq.generated.Keys.ENTITY_PHONE_STATES__FK_ENTITY_PHONE_STATES_ENTITIES, opus.address.database.jooq.generated.Keys.ENTITY_PHONE_STATES__FK_ENTITY_PHONE_STATES_PHONE_ENTITIES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.EntityPhoneStates as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.EntityPhoneStates(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.EntityPhoneStates rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.EntityPhoneStates(name, null);
	}
}