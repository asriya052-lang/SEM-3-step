package abstract_interface.class_problems;

public class Violin extends StringInstrument {

    public Violin() {
        super();
    }

    @Override
    public String play() {

        return super.play()
                + ", with a bow drawn across four strings";
    }

    public static void main(String[] args) {

        Violin violin = new Violin();

        System.out.println(violin.play());
    }
}