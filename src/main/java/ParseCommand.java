import com.lexicalscope.jewel.cli.Option;
import com.lexicalscope.jewel.cli.Unparsed;

public interface ParseCommand {

    @Option(shortName = "n", defaultValue="10")
    int getNumber();

    @Option(shortName = "e", defaultValue = "hashtag")
    String getEntity();

    @Option(shortName = "r")
    boolean isReverse();

    @Option(shortName = "i")
    boolean isIgnore();

    @Unparsed
    String fileName();

}
