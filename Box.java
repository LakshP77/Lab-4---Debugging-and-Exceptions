public class Box {

    private int width, height, depth, grade;

    // Proper constructor
    public Box(int width, int height, int depth, int grade) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.grade = grade;
    }

    // Two boxes are equal if their volume and grade are the same
    public boolean equals(Box b) {
        return this.getVolume() == b.getVolume() && this.getGrade() == b.getGrade();
    }

    // Return the larger box by volume
    public Box larger(Box b) {
        if (b.getVolume() > this.getVolume()) {
            return b;
        }
        return this;
    }

    // Getter methods
    public int getGrade() {
        return grade;
    }

    public int getVolume() {
        return width * height * depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
