public class FigureList {

    private Figure[] list = new Figure[10];
    private int counter;

    public void add(Figure figure) {
        if (counter == list.length) {
            Figure[] list = new Figure[this.list.length];
            System.arraycopy(this.list, 0, list, 0, this.list.length);
            this.list = list;
        }
        list[counter++] = figure;
    }

    public void showAllList() {
        System.out.println("------------------------------------------------");
        System.out.println("All figures:");
        for (int i = 0; i < counter; i++) {
            showFigure(i);
        }

        System.out.println("------------------------------------------------");
    }

        public void showFigure ( int n){
            System.out.println((n + 1) + " " + list[n].getName() + ": area = " + list[n].getArea());
            System.out.println("  " + list[n].getName() + ": perimeter = " + list[n].getPerimeter());
        }


    }


