package kata5;

public class Kata5 {

    public static void main(String[] args) {
        MailLoader loader = new MockMailLoader();
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(loader.load());
        ChartHistogramViewer<String> viewer = new  ChartHistogramViewer<>();
        viewer.show(builder.build(new AttributeExtractor<Mail, String>() {

            @Override
            public String extract(Mail entity) {
                return entity.getDomain();
            }
        }));
    }
}
