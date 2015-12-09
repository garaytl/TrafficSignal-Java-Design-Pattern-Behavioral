package fr.iutvalence.info.dut.m3105.preamble.state;

public abstract class TrafficSignalState
{
	public void secondEllapsed(TrafficSignal tS){
		tS.secondEllapsed();
	}
	public void buttonPressed(TrafficSignal tS){
		tS.buttonPressed();
	}
}
