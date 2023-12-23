package Elevators;

public class OddElevator extends Elevator {
    public OddElevator(Status status) {
        super(status);
    }

    public void call(Call call) throws ElevatorCallException {
        if (call.type == ElevatorType.ODD) {
            status = Status.BUSY;
            System.out.println("Нечётный лифт ушёл на " + call.floor + " этаж ");
            status = Status.FREE;
        }
        else if (call.type == ElevatorType.EVEN) throw new ElevatorCallException("ОШИБКА! Вы вызвали нечётный лифт для чётного этажа");
        else if (call.type == ElevatorType.EMPLOYEE) throw new ElevatorCallException("ОШИБКА! Этот лифт не для сотрудников");
    }
}
