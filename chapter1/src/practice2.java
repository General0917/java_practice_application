public class practice2 {
    String concatPath(String folder, String file) {
        if(!folder.endsWith("¥¥")) {
            folder += "¥¥";
        }
        return folder + file;
    }

    String name = concatPath("c:¥javadev", "c:¥user¥");
}