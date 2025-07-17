package Exception.Reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class serializer {

    public String serialize(Object o) {
        String serialized = "";

        Class c = o.getClass();

        serialized += "{";

        List<Field> allFields = getAllFields(c);

        for (Field f : allFields) {
            f.setAccessible(true);
            try {
                String f1 = f.getName();
                serialized += "\"" + f1 + "\":";

                Object val = f.get(o);

                if (val == null) {
                    serialized += "null";
                } else if (val.getClass().equals(Integer.class) || val.getClass().equals(Double.class)) {
                    serialized += val;
                } else if (val.getClass().equals(String.class)) {
                    serialized += "\"" + val + "\"";
                } else {
                    // Recursively call serialize for complex types
                    serialized += serialize(val);
                }

                serialized += ",";
            } catch (Exception e) {
                e.printStackTrace(); // basic error handling
            }
        }

        if (serialized.endsWith(",")) {
            serialized = serialized.substring(0, serialized.length() - 1); // Remove last comma
        }

        serialized += "}";

        return serialized;
    }

    // Helper to get all declared fields
    private List<Field> getAllFields(Class c) {
        List<Field> fields = new ArrayList<>();
        for (Field field : c.getDeclaredFields()) {
            fields.add(field);
        }
        return fields;
    }
}
