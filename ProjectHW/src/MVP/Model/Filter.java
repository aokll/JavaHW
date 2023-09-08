package MVP.Model;

import java.io.File;

public class Filter {
   public boolean findFiles(String dir, String ext, String nameFindFile) {
        boolean b = false;
        File file = new File(dir);
        if(!file.exists()) System.out.println(dir + " папка не существует");
        File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
            for(File f : listFiles) {
                String s = removeLastNchars(f.getName(),4);
                if (s.equals(nameFindFile)) {
                    b = true;
                    break;
                }
            }
        return b;

    }
    private String removeLastNchars(String str, int n) {
        return str.substring(0, str.length() - n);
    }
}
