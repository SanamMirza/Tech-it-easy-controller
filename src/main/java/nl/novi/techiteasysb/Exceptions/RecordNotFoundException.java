package nl.novi.techiteasysb.Exceptions;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException() {
          super();
        }
    public RecordNotFoundException(String message) {
          super(message);
        }

    }

