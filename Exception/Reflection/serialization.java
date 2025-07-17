package Exception.Reflection;

/**
 * This class represents a serializable student record.
 * Serialization is the process of converting an object into a format (like JSON or binary)
 * that can be stored or transmitted and later reconstructed.
 * Deserialization is the reverse process.
 */
public class serialization {

    private final int id;
    
    private final double totalPercent;

private final Sciencemarks sciencemarks;

public serialization(int id, Sciencemarks scienceMarks, double totalPercent) {
    this.id = id;
    this.sciencemarks = scienceMarks;
    this.totalPercent = totalPercent;
}

public Sciencemarks getScienceMarks() {
    return sciencemarks;
}


    

    public int getId() {
        return id;
    }

    

    public double getTotalPercent() {
        return totalPercent;
    }
}
