public class Konversi {

    public String konversiNilai(short nilai) {

        if (nilai >= 85 && nilai <= 100) {
            return "A";
        } else if (nilai >= 80) {
            return "A-";
        } else if (nilai >= 75) {
            return "B+";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 65) {
            return "C+";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
