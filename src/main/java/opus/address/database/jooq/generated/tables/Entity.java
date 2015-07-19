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
public class Entity extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.Entity> {

	private static final long serialVersionUID = 1466635436;

	/**
	 * The reference instance of <code>entity</code>
	 */
	public static final opus.address.database.jooq.generated.tables.Entity Entity = new opus.address.database.jooq.generated.tables.Entity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.Entity> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.Entity.class;
	}

	/**
	 * The column <code>entity.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Entity, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>entity</code> table reference
	 */
	public Entity() {
		this("entity", null);
	}

	/**
	 * Create an aliased <code>entity</code> table reference
	 */
	public Entity(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.Entity.Entity);
	}

	private Entity(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.Entity> aliased) {
		this(alias, aliased, null);
	}

	private Entity(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.Entity> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<opus.address.database.jooq.generated.tables.records.Entity, java.lang.Long> getIdentity() {
		return opus.address.database.jooq.generated.Keys.IDENTITY_Entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Entity> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_ENTITY_ENTITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Entity>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Entity>>asList(opus.address.database.jooq.generated.Keys.PK_ENTITY_ENTITY_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.Entity as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.Entity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.Entity rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.Entity(name, null);
	}
}
