public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int time){
        return 40-time;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time){
        return layers*2 + time;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
}

