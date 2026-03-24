package generics.validator;

import java.util.List;

public class Validator {

    public void validateSecurity(List<? super Issue> collector) {
        // check password
        collector.add(new Error("Password is too short."));

        // suggest MFA if not used
        collector.add(new Warning("Consider using MFA"));
    }

    public void validateMissingFields(List<? super Issue> collector) {
        collector.add(new Warning("No profile picture uploaded."));
    }
}