package nl.sudohenk.xtext.generator;

import java.util.LinkedList;

import nl.sudohenk.xtext.stateDef.MessageTransition;
import nl.sudohenk.xtext.stateDef.State;

public class StateMachineTrace implements Comparable {
	
	// Always non-null
	private final State state;
	private int distance = 0;
	private LinkedList<MessageTransition> shortestPath = new LinkedList<>();
	
	public StateMachineTrace(State state) throws Exception {
		super();
		if(state == null) {
			throw new Exception("StateObj may not be null");
		}
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public LinkedList<MessageTransition> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(LinkedList<MessageTransition> shortestPath) {
		this.shortestPath = shortestPath;
	}
	
	public String getFolderLocation() {
		return Constants.TRACE_FOLDER_LOCATION;
	}
	
	public String getTraceDotFileName() {
		return this.state.getName()+Constants.DOT_FILE_EXTENSION;
	}
	
	public String getTraceFileName() {
		return this.state.getName()+Constants.TRACE_FILE_EXTENSION;
	}
	
	public String getTracePngFileName() {
		return this.state.getName()+Constants.PNG_FILE_EXTENSION;
	}

	@Override
	public int compareTo(Object o) {
		StateMachineTrace node = (StateMachineTrace) o;
		if(this.getDistance() == node.getDistance()) {
			return 0;
		} else if(this.getDistance() < node.getDistance()) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public boolean equals(Object obj) {
		StateMachineTrace other = (StateMachineTrace) obj;
		return this.state.getName().equals(other.state.getName());
	}
}
