package Elevators;

public class ElevatorQueue implements FreeElevator {
    Elevator elevator;
    public void addElevator(Elevator elevator) {
        if (this.elevator == null) {
            this.elevator = elevator;
            this.elevator.next = elevator;
        }
        else {
            Elevator t = this.elevator;
            while (t.next != this.elevator) {
                t = t.next;
            }
            t.next = elevator;
            t = t.next;
            t.next = this.elevator;
        }

    }
    @Override
    public Elevator free() throws ElevatorCallException {
        Elevator t = elevator;
        while (t.status != Status.FREE) {
            t = t.next;
            if (t == elevator) {
                throw new ElevatorCallException("Свободных лифтов нет");
            }
        }
        return t;
    }
}
