package generics.converter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ConverterTests {

    @Test
    public void usesConvertMethod() {
        List<String> result = convert(List.of(1, 2, 3), new IntegerToString());

        System.out.println(result);
        System.out.println(result.getFirst().getClass());

    }

    private List convert(List list, Converter converter) {
        List result = new ArrayList<>();

        for (Object each : list) {
            result.add(converter.convert(each));
        }

        return result;
    }

    @Test
    public void usesCompositeConverter() {
        CompositeConverter converter =
                new CompositeConverter(new IntegerToString(), new StringToDouble());

        List<Double> result = convert(List.of(1, 2, 3), converter);

        System.out.println(result);
    }
}
