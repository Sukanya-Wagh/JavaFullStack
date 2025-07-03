1) update category table where name is specific-Name:
  
UPDATE category
SET name = 'New-Value'
WHERE name = 'specific-Name';

2) remove row from inventory table where found film_id=2 give its answer carefully:

DELETE FROM inventory
WHERE film_id = 2;

3) Show your any one table structure:
postgres=# \d language
  
  OUTPUT:
                                              Table "public.language"
    Column     |            Type             | Collation | Nullable |                    Default
---------------+-----------------------------+-----------+----------+-----------------------------------------------
 language_id   | integer                     |           | not null | nextval('language_language_id_seq'::regclass)
 language_name | character varying(50)       |           | not null |
 last_update   | timestamp without time zone |           |          | CURRENT_TIMESTAMP
Indexes:
    "language_pkey" PRIMARY KEY, btree (language_id)

postgres=#
