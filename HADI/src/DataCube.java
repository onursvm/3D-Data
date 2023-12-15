import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCube<T> {


    private String name;
    private List<Dimension<T>> dimensions = new ArrayList<>();
    private Map<String, T> values = new HashMap<>();

    public DataCube(String name) {
        this.name = name;
    }

    public void addDimension(int index, String name) {
        dimensions.add(new Dimension<>(index, name));
    }

    public void setValue(String a, String b, String c, T value) {
        String key = a + "-" + b + "-" + c;
        values.put(key, value);
    }

    public void updateValue(String a, String b, String c, T newValue) {
        String key = a + "-" + b + "-" + c;
        if (values.containsKey(key)) {
            values.put(key, newValue);
        } else {
            System.out.println("Key not found: " + key);
        }
    }

    public void updateStudent(String oldName, String newStudentName) {
        Map<String, T> updatedValues = new HashMap<>();
        for (String key : values.keySet()) {
            String[] parts = key.split("-");
            if (parts.length == 3 && parts[0].equals(oldName)) {
                String newKey = newStudentName + "-" + parts[1] + "-" + parts[2];
                updatedValues.put(newKey, values.get(key));
            } else {
                updatedValues.put(key, values.get(key));
            }
        }
        values = updatedValues;
    }
    public void updateLesson(String oldLesson, String newLesson) {
        Map<String, T> updatedValues = new HashMap<>();
        for (String key : values.keySet()) {
            String[] parts = key.split("-");
            if (parts.length == 3 && parts[1].equals(oldLesson)) {
                String newKey = parts[0] + "-" + newLesson + "-" + parts[2];
                updatedValues.put(newKey, values.get(key));
            } else {
                updatedValues.put(key, values.get(key));
            }
        }
        values = updatedValues;
    }
    public void updateTime(String oldTime, String newTime) {
        Map<String, T> updatedValues = new HashMap<>();
        for (String key : values.keySet()) {
            String[] parts = key.split("-");
            if (parts.length == 3 && parts[2].equals(oldTime)) {
                String newKey = parts[0] + "-" + parts[1] + "-" + newTime;
                updatedValues.put(newKey, values.get(key));
            } else {
                updatedValues.put(key, values.get(key));
            }
        }
        values = updatedValues;
    }

    public void removeValue(String a, String b, String c) {
        String key = a + "-" + b + "-" + c;
        values.remove(key);
    }

    public void clearValues() {
        values.clear();
    }


    public T getValue(String a, String b, String c) {
        String key = a + "-" + b + "-" + c;
        return values.get(key);
    }
}
 class Dimension<T> {
    private int index;
    private String name;
    private List<T> values = new ArrayList<>();

    public Dimension(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public void add(T value) {
        values.add(value);
    }

   // public void remove(T value) {
        //values.remove(value);
    //}
}
