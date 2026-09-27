package abstract_interface.class_problems;

public class StringInstrument extends Instrument {

    public StringInstrument() {
        super();
    }

    @Override
    public String play() {
        return "Strumming the strings";
    }

    public static void main(String[] args) {

        StringInstrument instrument =
                new StringInstrument();

        System.out.println(instrument.play());
    }
}