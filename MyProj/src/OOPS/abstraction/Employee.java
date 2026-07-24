package OOPS.abstraction;

public class Employee extends Person implements Artist,Player{

    @Override
    public void doSomething() {
        System.out.println("Employee works to make his living");
    }

    @Override
    public void doPlay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doPlay'");
    }

    @Override
    public void doArt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doArt'");
    }

	@Override
	public void coach() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'coach'");
	}

    @Override
    public void do1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'do1'");
    }
    
}
