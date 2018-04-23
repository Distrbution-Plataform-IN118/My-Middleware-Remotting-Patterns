import java.util.ArrayList;


public class CalculatorProxy extends ClientProxy implements ICalculator {

	public CalculatorProxy(int port) {
		super(port);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public float add(float a, float b) {
		// TODO Auto-generated method stub
		Invocation inv = new Invocation();
		Termination ter = new Termination();
		ArrayList<Object> parameters = new ArrayList<Object>();
		class Local{}
		String methodName = null;
		Requestor requestor = new Requestor();
		
		methodName = Local.class.getEnclosingMethod().getName();
		parameters.add(a);
		parameters.add(b);
		
		inv.setObjectId(this.getObjectId());
		inv.setIpAddress(this.getPort());
		inv.setPortNumber(this.getPort());
		inv.setOperationName(methodName);
		inv.setParameters(parameters);
		
		ter = requestor.invoke(inv);
		
		return (Float) ter.getResult();
	}

	@Override
	public float sub(float a, float b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float mul(float a, float b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float div(float a, float b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
