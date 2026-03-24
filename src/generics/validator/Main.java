package generics.validator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Validator validator = new Validator();

        List<Issue> issues = new ArrayList<>();

        validator.validateSecurity(issues);

        validator.validateMissingFields(issues);

        for (Issue issue : issues) {
            System.out.println(issue);
        }
    }

}
