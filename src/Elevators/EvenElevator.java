package Elevators;

public class EvenElevator extends Elevator {
    public EvenElevator(Status status) {
        super(status);
    }

    public void call(Call call) throws ElevatorCallException {
        if (call.type == ElevatorType.EVEN) {
            status = Status.BUSY;
            System.out.println("Чётный лифт ушёл на " + call.floor + " этаж ");
            status = Status.FREE;
        } else if (call.type == ElevatorType.ODD)
            throw new ElevatorCallException("ОШИБКА! Вы вызвали чётный лифт для нечётного этажа");
        else if (call.type == ElevatorType.EMPLOYEE) throw new ElevatorCallException("ОШИБКА! Этот лифт не для сотрудников");

    }
}