/*
 * This file is generated by jOOQ.
 */
package uk.co.markg.bertrand.db.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import uk.co.markg.bertrand.db.DefaultSchema;
import uk.co.markg.bertrand.db.Keys;
import uk.co.markg.bertrand.db.tables.records.ChannelsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Channels extends TableImpl<ChannelsRecord> {

    private static final long serialVersionUID = 1644478068;

    /**
     * The reference instance of <code>channels</code>
     */
    public static final Channels CHANNELS = new Channels();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChannelsRecord> getRecordType() {
        return ChannelsRecord.class;
    }

    /**
     * The column <code>channels.channelid</code>.
     */
    public final TableField<ChannelsRecord, Long> CHANNELID = createField(DSL.name("channelid"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>channels</code> table reference
     */
    public Channels() {
        this(DSL.name("channels"), null);
    }

    /**
     * Create an aliased <code>channels</code> table reference
     */
    public Channels(String alias) {
        this(DSL.name(alias), CHANNELS);
    }

    /**
     * Create an aliased <code>channels</code> table reference
     */
    public Channels(Name alias) {
        this(alias, CHANNELS);
    }

    private Channels(Name alias, Table<ChannelsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Channels(Name alias, Table<ChannelsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Channels(Table<O> child, ForeignKey<O, ChannelsRecord> key) {
        super(child, key, CHANNELS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<ChannelsRecord> getPrimaryKey() {
        return Keys.CHANNELS_PKEY;
    }

    @Override
    public List<UniqueKey<ChannelsRecord>> getKeys() {
        return Arrays.<UniqueKey<ChannelsRecord>>asList(Keys.CHANNELS_PKEY);
    }

    @Override
    public Channels as(String alias) {
        return new Channels(DSL.name(alias), this);
    }

    @Override
    public Channels as(Name alias) {
        return new Channels(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Channels rename(String name) {
        return new Channels(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Channels rename(Name name) {
        return new Channels(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
