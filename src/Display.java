public class Display {
    private String diagonal;
    private String manuFacture;
    private String matrixType;

    public Display(String diagonal, String manuFacture, String matrixType) {
        this.diagonal = diagonal;
        this.manuFacture = manuFacture;
        this.matrixType = matrixType;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getManuFacture() {
        return manuFacture;
    }

    public void setManuFacture(String manuFacture) {
        this.manuFacture = manuFacture;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public  String getInfo(){
        return "Diagonal: " + diagonal+ "\n" +
                "Manufacture: " + manuFacture + "\n" +
                "MatrixType: " + matrixType;
    }
}
