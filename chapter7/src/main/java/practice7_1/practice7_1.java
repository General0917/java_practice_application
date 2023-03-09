package practice7_1;

import java.lang.reflect.*;

public class practice7_1 {
    public static void main(String[] args) {
        String fqcn = args[0]; // java.util.�C���^�[�t�F�[�X�� or �N���X�� or �񋓌^ or ��O or �G���[�Ŏw�肷��
        String sw = args[1];
        showMemory();

        try {
            Class<?> clazz = Class.forName(fqcn);
            listMethods(clazz);
            if (sw.equals("E")) {
                launchExternal(clazz);
            } else if (sw.equals("I")) {
                launchInternal(clazz);
            } else {
                throw new IllegalArgumentException("�N�����@�̎w�肪�s���ł��B");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        showMemory();
        System.exit(0);
    }

    public static void listMethods(Class<?> clazz) {
        System.out.println("���\�b�h�̈ꗗ��\�����܂��B");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

    public static void launchExternal(Class<?> clazz) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
        Process proc = pb.start();
        proc.waitFor();
    }

    public static void launchInternal(Class<?> clazz) throws Exception {
        Method m = clazz.getMethod("main", String[].class);
        String[] args = {};
        m.invoke(null, (Object)args);
    }

    public static void showMemory() {
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long usage = (total - free) / 1024 / 1024;
        System.out.println("���݂̃������g�p���F" + usage + "MB");
    }

}