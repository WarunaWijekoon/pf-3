void main(){
    int x = 0;
    while (x++<=6){
        int y =0;
        while (y++<=6-x) System.out.print((y<=6-x)?"*":"\n");

    }
}