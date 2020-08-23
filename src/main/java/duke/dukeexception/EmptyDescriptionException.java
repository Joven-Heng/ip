package duke.dukeexception;

import duke.dukeexception.DukeException;

public class EmptyDescriptionException extends DukeException {

    public EmptyDescriptionException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "☹ OOPS!!! The description of a " + getMessage() + " cannot be empty.";
    }
}
