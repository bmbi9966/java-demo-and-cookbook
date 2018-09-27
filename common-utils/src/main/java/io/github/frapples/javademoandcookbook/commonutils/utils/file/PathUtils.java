package io.github.frapples.javademoandcookbook.commonutils.utils.file;

/**
 * @author Frapples <isfrapples@outlook.com>
 * @date 2018/9/18
 */
public class PathUtils {

    public static final char SEP = System.getProperty("file.separator").charAt(0);

    public static String join(String... seg) {
        if (seg == null || seg.length == 0) {
            return "";
        }

        StringBuilder path = new StringBuilder();
        for (int i = 0; i < seg.length; i++) {
            String s = seg[i];
            path.append(s);

            if (s.length() > 0 && i != seg.length - 1) {
                char end = s.charAt(s.length() - 1);
                if (!(end == '/' || end == SEP)) {
                    path.append(SEP);
                }
            }
        }
        return path.toString();
    }

}
