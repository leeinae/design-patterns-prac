package solid;

public class PdfDocConverter extends DocConverter {
    public PdfDocConverter() {
        super("pdf");
    }

    @Override
    public void save(String fileName) {
        System.out.println(fileName + "|" + super.getExtension() + "로 변환 후 저장합니다.");
    }
}
