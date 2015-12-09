package fr.iutvalence.info.dut.m3105.preamble.state;

public class TrafficSignal extends Thread implements TrafficSignalInterface 
{
	private final static int BUTTON_THRESHOLD_IN_SECONDS = 2;
	
	private TrafficSignalState state;
	private int stateSecondsRemaining; 
	
	public TrafficSignal()
	{
		super();
		this.setState(TrafficSignalState.GREEN);
	}

	
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}
	
	@Override
	public void secondEllapsed()
	{
		this.stateSecondsRemaining--;
		System.out.println(this.stateSecondsRemaining);
		System.out.flush();
		if (this.stateSecondsRemaining == 0)
		{
			
	}

	private void setState(TrafficSignalState state)
	{
		System.out.println("Traffic signal turns "+state);
		System.out.flush();
		this.state = state;
		this.stateSecondsRemaining = this.state.getDurationInSeconds();		
	}

	

		

	@Override
	public void buttonPressed() {
		// TODO Auto-generated method stub
		
	}

}
