package marodb.exceptions;

/**
 * Created by LastOne on 2016-10-31.
 */
public class ReferenceNonFullPrimaryKeyError extends QueryError {
    @Override
    public String getMessage() {
        return "foreign key does not references full primary key";
    }
}
