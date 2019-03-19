package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_NAME_REVERSE = new Prefix("/n");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_PHONE_REVERSE = new Prefix("/p");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_EMAIL_REVERSE = new Prefix("/e");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_ADDRESS_REVERSE = new Prefix("/a");

    public static final Prefix PREFIX_SKILL = new Prefix("skill/");
    public static final Prefix PREFIX_SKILL_REVERSE = new Prefix("/skill");
    public static final Prefix PREFIX_POS = new Prefix("position/");
    public static final Prefix PREFIX_POS_REVERSE = new Prefix("/position");
    public static final Prefix PREFIX_GPA = new Prefix("g/");
    public static final Prefix PREFIX_EDUCATION = new Prefix("d/");

    /* Sort-Word definitions*/
    public static final SortWord SORTWORD_SKILLS = new SortWord("skills");
    public static final SortWord SORTWORD_ALPHABETICAL = new SortWord("alphabetical");
}
