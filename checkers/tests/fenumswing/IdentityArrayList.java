import java.util.Arrays;

public class IdentityArrayList {
    public <T> T[] toArray(T[] a) {
    	return (T[]) Arrays.copyOf(null, 0, a.getClass());
    }
}
