package com.heraizen.cj.collections.level2.stateandcapital;

import java.util.HashMap;
import java.util.Map;

public class StateAndCaptitalInfo {
	private Map<String, String> state_captital = new HashMap<>();

	public void add_state_capital(String states, String capital) {
		state_captital.put(states, capital);

	}

	public String view_capital(String state) {
		if (state_captital.isEmpty()) {
			System.out.println("State and capital list is Empty");
		} else {
			for (Map.Entry<String, String> stateInfo : state_captital.entrySet()) {
				if (stateInfo.getKey().equals(state)) {
					System.out.println(stateInfo.getValue());
				}

				else {
					System.out.println("“The State name is not existing”");
				}
			}

		}

		return state;
	}

}
