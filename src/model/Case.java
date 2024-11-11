package src.model;

public class Case {
    private int x;
    private int y;

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;
        Case c = (Case) obj;

        if(c.getY() == this.getY() && c.getX() == this.getX()) {
            return true;
        }
        return false;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
