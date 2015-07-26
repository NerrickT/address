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
public class System extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.SystemRecord> {

	private static final long serialVersionUID = -981541132;

	/**
	 * The reference instance of <code>system</code>
	 */
	public static final opus.address.database.jooq.generated.tables.System System = new opus.address.database.jooq.generated.tables.System();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.SystemRecord> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.SystemRecord.class;
	}

	/**
	 * The column <code>system.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.SystemRecord, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>system</code> table reference
	 */
	public System() {
		this("system", null);
	}

	/**
	 * Create an aliased <code>system</code> table reference
	 */
	public System(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.System.System);
	}

	private System(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.SystemRecord> aliased) {
		this(alias, aliased, null);
	}

	private System(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.SystemRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.SystemRecord> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_SYSTEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.SystemRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.SystemRecord>>asList(opus.address.database.jooq.generated.Keys.PK_SYSTEM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.SystemRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.SystemRecord, ?>>asList(opus.address.database.jooq.generated.Keys.SYSTEM__FK_SYSTEM_ENTITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.System as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.System(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.System rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.System(name, null);
	}
}
