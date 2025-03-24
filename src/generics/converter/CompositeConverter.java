package generics.converter;

public class CompositeConverter implements Converter {

        private final Converter first;
        private final Converter second;

        public CompositeConverter(Converter first, Converter second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public Object convert(Object input) {
            return second.convert(first.convert(input));
        }
    }
