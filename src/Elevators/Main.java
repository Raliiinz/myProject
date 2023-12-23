package Elevators;

public class Main {
    public static void main(String[] args) throws ElevatorCallException {

        ElevatorQueue employeeElevators = new ElevatorQueue();
        ElevatorQueue oddElevators = new ElevatorQueue();
        ElevatorQueue evenElevators = new ElevatorQueue();

        employeeElevators.addElevator(new EmployeeElevator(Status.FREE));
        for (int i = 0; i < 3; ++i) {
            evenElevators.addElevator(new EvenElevator(Status.FREE));
            oddElevators.addElevator(new OddElevator(Status.FREE));
        }

        Call call1 = new Call(8);
        Call call2 = new Call(7);
        Call call3 = new Call(6);
        Call call4 = new Call(5, ElevatorType.EMPLOYEE);
        Call call5 = new Call(4);
        Call call6 = new Call(6);
        Call call7 = new Call(5);
        Call call8 = new Call(4);
        Call call9 = new Call(3, ElevatorType.EMPLOYEE);
        Call call10 = new Call(8);
        Call call11 = new Call(6);
        Call call12 = new Call(9);
        Call call13 = new Call(4);
        Call call14 = new Call(7, ElevatorType.EMPLOYEE);
        Call call15 = new Call(2);
        Call call16 = new Call(10);
        Call call17 = new Call(5);
        Call call18 = new Call(2);
        Call call19 = new Call(7, ElevatorType.EMPLOYEE);
        Call call20 = new Call(2);

        evenElevators.free().call(call1);
        oddElevators.free().call(call2);
        evenElevators.free().call(call5);
        evenElevators.free().call(call6);
        oddElevators.free().call(call7);
        evenElevators.free().call(call10);
        evenElevators.free().call(call11);
        oddElevators.free().call(call12);
        evenElevators.free().call(call15);
        evenElevators.free().call(call16);
        oddElevators.free().call(call17);
        evenElevators.free().call(call20);
        evenElevators.free().call(call8);
        oddElevators.free().call(call9);
        evenElevators.free().call(call13);
        oddElevators.free().call(call14);
        evenElevators.free().call(call18);
        oddElevators.free().call(call19);
        employeeElevators.free().call(call3);
        evenElevators.free().call(call4);
    }
}
