package Elevators;
public class Call {
    int floor;
    ElevatorType type;
    public Call(int floor) throws ElevatorCallException {
        if (floor < 1) {
            throw new ElevatorCallException("Введите правильный этаж");
        }
        this.floor = floor;
        if (floor % 2 == 0) {
            type = ElevatorType.EVEN;
        }
        else {
            type = ElevatorType.ODD;
        }
    }

    public Call(int floor, ElevatorType type) throws ElevatorCallException {
        if (floor < 1) {
            throw new ElevatorCallException("Введите правильный этаж");
        }
        this.floor = floor;
        this.type = type;
    }
}
