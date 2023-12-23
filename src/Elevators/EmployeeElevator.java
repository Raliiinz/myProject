package Elevators;

public class EmployeeElevator extends Elevator {
    public EmployeeElevator(Status status) {
        super(status);
    }

    public void call(Call call) throws ElevatorCallException {
        if (call.type == ElevatorType.EMPLOYEE) {
            status = Status.BUSY;
            System.out.println("Лифт для сотрудников ушёл на "+ call.floor +" этаж ");
            status = Status.FREE;
        }
        else throw new ElevatorCallException("ОШИБКА! Лифт только для сотрудников");
    }
}
