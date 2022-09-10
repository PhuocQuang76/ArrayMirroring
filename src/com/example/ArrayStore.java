package com.example;

import javax.swing.plaf.PanelUI;

public class ArrayStore {
    private int[][] numbers;
    private int[][] mirror;
    //Random rand = new Random();

    public ArrayStore(){
        numbers = new int[4][4];
        mirror = new int[4][4];
    }

    public ArrayStore(int row, int col){
        numbers = new int[row][col];
        mirror = new int[row][col];
    }

    public void assignNumbers(){
        this.numbers = Printing.assignNumber(this.numbers,200);
    }

    public void generateMirror(){
        int colSize = this.numbers[0].length;
        int lastIndex = colSize - 1;

        for(int i = 0; i < this.numbers.length; ++i) {
            for(int j = 0; j < this.numbers[i].length; ++j) {
                this.mirror[i][j] = this.numbers[i][lastIndex - j];
            }
        }
    }

    public void print() {
        Printing.print(this.numbers);
        System.out.println("*******Mirror***********");
        Printing.print(this.mirror);
    }
}
