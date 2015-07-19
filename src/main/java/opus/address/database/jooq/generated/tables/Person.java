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
public class Person extends org.jooq.impl.TableImpl<opus.address.database.jooq.generated.tables.records.Person> {

	private static final long serialVersionUID = -1148864479;

	/**
	 * The reference instance of <code>person</code>
	 */
	public static final opus.address.database.jooq.generated.tables.Person Person = new opus.address.database.jooq.generated.tables.Person();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<opus.address.database.jooq.generated.tables.records.Person> getRecordType() {
		return opus.address.database.jooq.generated.tables.records.Person.class;
	}

	/**
	 * The column <code>person.entity_id</code>.
	 */
	public final org.jooq.TableField<opus.address.database.jooq.generated.tables.records.Person, java.lang.Long> EntityId = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>person</code> table reference
	 */
	public Person() {
		this("person", null);
	}

	/**
	 * Create an aliased <code>person</code> table reference
	 */
	public Person(java.lang.String alias) {
		this(alias, opus.address.database.jooq.generated.tables.Person.Person);
	}

	private Person(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.Person> aliased) {
		this(alias, aliased, null);
	}

	private Person(java.lang.String alias, org.jooq.Table<opus.address.database.jooq.generated.tables.records.Person> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, opus.address.database.jooq.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Person> getPrimaryKey() {
		return opus.address.database.jooq.generated.Keys.PK_PERSON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Person>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<opus.address.database.jooq.generated.tables.records.Person>>asList(opus.address.database.jooq.generated.Keys.PK_PERSON);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.Person, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<opus.address.database.jooq.generated.tables.records.Person, ?>>asList(opus.address.database.jooq.generated.Keys.PERSON__FK_PERSON_ENTITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public opus.address.database.jooq.generated.tables.Person as(java.lang.String alias) {
		return new opus.address.database.jooq.generated.tables.Person(alias, this);
	}

	/**
	 * Rename this table
	 */
	public opus.address.database.jooq.generated.tables.Person rename(java.lang.String name) {
		return new opus.address.database.jooq.generated.tables.Person(name, null);
	}
}