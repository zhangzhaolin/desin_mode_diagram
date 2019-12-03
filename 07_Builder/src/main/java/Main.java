import framework.Director;

public class Main {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult().toString();
        System.out.println(result);


        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director d1 = new Director(htmlBuilder);
        d1.construct();
        String r1 = htmlBuilder.getResult();
        System.out.println(r1 + "文件编写完成.");

    }
}
