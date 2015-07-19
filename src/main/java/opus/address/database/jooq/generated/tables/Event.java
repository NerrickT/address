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
public class Event extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.Event> {

	private static final long serialVersionUID = 867026449;

	/**
	 * The reference instance of <code>event</code>
	 */
	public static final opus.address.database.jooq.generated.tables.Event Event = new opus.address.database.jooq.generated.tables.Event();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.Event> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.Event.class;
	}

	/**
	 * The column <code>event.sequence</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Event, java.lang.Long> Sequence = createField("sequence", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>event.event</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Event, java.lang.String> Event_ = createField("event", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>event.code_version</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Event, java.lang.String> CodeVersion = createField("code_version", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>event.actor</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Event, java.lang.Long> Actor = createField("actor", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>event.tables_affected</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Event, java.lang.String> TablesAffected = createField("tables_affected", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>event.when</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Event, java.sql.Timestamp> When = createField("when", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>event</code> table reference
	 */
	public Event() {
		this("event", null);
	}

	/**
	 * Create an aliased <code>event</code> table reference
	 */
	public Event(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.Event.Event);
	}

	private Event(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.Event> aliased) {
		this(alias, aliased, null);
	}

	private Event(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.Event> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<opus.address.database.jooq.generated.tables.records.Event, java.lang.Long> getIdentity() {
		return opus.address.database.jooq.generated.Keys.IDENTITY_Event;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Event> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_EVENT_SEQUENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Event>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Event>>asList(opus.address.database.jooq.generated.Keys.PK_EVENT_SEQUENCE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.Event, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.Event, ?>>asList(opus.address.database.jooq.generated.Keys.EVENT__FK_EVENT_USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.Event as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.Event(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.Event rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.Event(name, null);
	}
}