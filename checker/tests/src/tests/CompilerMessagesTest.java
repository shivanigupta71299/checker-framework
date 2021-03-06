package tests;

import java.io.File;
import java.util.List;
import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;

/** JUnit tests for the Compiler Messages Checker. Depends on the compiler.properties file. */
public class CompilerMessagesTest extends CheckerFrameworkPerDirectoryTest {

    public CompilerMessagesTest(List<File> testFiles) {
        super(
                testFiles,
                org.checkerframework.checker.compilermsgs.CompilerMessagesChecker.class,
                "compilermsg",
                "-Anomsgtext",
                "-Apropfiles=tests/compilermsg/compiler.properties");
    }

    @Parameters
    public static String[] getTestDirs() {
        return new String[] {"compilermsg", "all-systems"};
    }
}
