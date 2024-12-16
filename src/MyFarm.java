public class MyFarm {

    public Plot[][] grid;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        // construct a 2D grid of plots
        grid = new Plot[5][4];

        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                System.out.println("planting at row " + a +
                        ", column " + b);
                grid[a][b] = new Plot();
                grid[a][b].printPlotInfo();
            }


        }

        // fill a 2D grid of plots


        // methods to write together during class
        totalPlants();
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plantWithMaxNumber();
        plantWithMinNumber();
        greaterThan50();

        /***
         * for each additional method you code, call it here
         */


    }

    public void totalPlants() {
        // how many plants are there in total across all plots?
        int total = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                total = total + grid[a][b].numberOfPlants; // grid[a][b] is a plot, we can treat it as such.

            }
        }
        System.out.println("total plants: " + total);
    }

    public void totalCarrots() {
        // how many total carrots are there across all plots?
        int c = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "carrot"){
                    c += grid[a][b].numberOfPlants;
                }
            }
        }
        System.out.println("total carrots: " + c);

    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int avgplants = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                avgplants = avgplants + (grid[0][b].numberOfPlants / 4);
            }
        }
        System.out.println("average number of plants across row 0: " + avgplants);

    }

    public void numberOfTomatoPlots() {
        // how many plots have carrots on them?
        int pwc = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "carrot"){
                    pwc++;
                }
            }
        }
        System.out.println("plots with carrots: " + pwc);
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty?
        int empty = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "empty"){
                    empty++;
                }
            }
        }
        System.out.println("empty plots: " + empty);

    }

    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        // print the value or needs water for all plots row by row
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b = b + 2) {
                    grid[a][b].needsWater = true;
            }
        }
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                System.out.println("needs water? " + grid[a][b].needsWater);
            }
        }

    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        String biggest = " ";
        int v = 0;
        int c = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "carrot"){
                    c += grid[a][b].numberOfPlants;
                }
            }
        }
        int s = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "sunflower"){
                    s += grid[a][b].numberOfPlants;
                }
            }
        }
        if (c > s){
            v = c;
            biggest = "carrot";
        }
        else{
            v = s;
            biggest = "sunflower";
        }
        int co = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "corn"){
                    co += grid[a][b].numberOfPlants;
                }
            }
        }
        if (co > v){
            biggest = "corn";
            v = co;
        }
        int t = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "tomato"){
                    t += grid[a][b].numberOfPlants;
                }
            }
        }
        if (t > v){
            biggest = "tomato";
            v = t;
        }
        System.out.println(biggest + " has the most total plants with " + v);

    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        String smallest = " ";
        int v = 0;
        int c = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "carrot"){
                    c += grid[a][b].numberOfPlants;
                }
            }
        }
        int s = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "sunflower"){
                    s += grid[a][b].numberOfPlants;
                }
            }
        }
        if (c < s){
            v = c;
            smallest = "carrot";
        }
        else{
            v = s;
            smallest = "sunflower";
        }
        int co = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "corn"){
                    co += grid[a][b].numberOfPlants;
                }
            }
        }
        if (co < v){
            smallest = "corn";
            v = co;
        }
        int t = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].plantName == "tomato"){
                    t += grid[a][b].numberOfPlants;
                }
            }
        }
        if (t < v){
            smallest = "tomato";
            v = t;
        }
        System.out.println(smallest + " has the least total plants with " + v);

    }

    public void greaterThan50() {
        // how many plots have more than 10 plants in the plot?
        int total = 0;
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b].numberOfPlants > 10)
                    total++;
            }
        }
        System.out.println("plots with more 10 plants: " + total);

    }

    public void plantWithMaxNumberNeedsWater() {
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }


    /***
     * more challenging
     */


    public void averageRows() {
        // find the average number of plants for every row
        // place the average of every row into a new array

    }

    public void averageColumns() {
        // find the average number of plants for every col
        // place the average of every row into a new array

    }

    public void updateNeedsWater() {
        // if 2 or more of the adjacent plots need water (left, right, up, down),
        // make the current plot needs water to be true

    }


    /***
     * most challenging
     */


    public void greatestDifferenceNumberBetweenAnyAdjacentPlants() {
        // of every pair of adjacent plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right),
        // which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void updateNumberOfPlants() {
        // change the value of number of plants so it is the average of the 8 surrounding plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
    }

    public void numberOfCarrotPlotsNextToCorn() {
        // how many carrot plots share a border with a corn plot?

    }

}
