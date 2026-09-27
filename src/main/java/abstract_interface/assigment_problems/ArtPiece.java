package abstract_interface.assigment_problems;

public abstract class ArtPiece {

    private static int pieceCounter = 1000;

    private final String pieceId;
    protected String title;

    public ArtPiece(String title) {
        this.title = title;

        pieceCounter++;
        this.pieceId = "ART-" + pieceCounter;
    }

    public abstract String describe();

    public String getPieceId() {
        return pieceId;
    }

    public static void main(String[] args) {

        Painting painting =
                new Painting("Sunset Fields");

        Sculpture sculpture =
                new Sculpture("The Thinker II");

        System.out.println(painting.describe());
        System.out.println(painting.getPieceId());

        System.out.println(sculpture.describe());
        System.out.println(sculpture.getPieceId());
    }
}