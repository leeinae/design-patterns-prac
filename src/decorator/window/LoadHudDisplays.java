package decorator.window;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {
    private String filename = "";

    public LoadHudDisplays(String filename) {
        this.filename = filename;
    }

    @Override
    public ArrayList<String> load() {
        ArrayList<String> list = new ArrayList<>();

        try {
            File file = new File(LoadHudDisplays.class.getResource("").getPath() + filename);
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String str;
                while ((str = br.readLine()) != null) {
                    list.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
