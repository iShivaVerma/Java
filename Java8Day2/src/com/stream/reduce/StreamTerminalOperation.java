package com.stream.reduce;

import java.util.ArrayList;
import java.util.List;

public class StreamTerminalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> memberNames=new ArrayList();
		memberNames.add("Tony");
		memberNames.add("Peter");
		memberNames.add("Logan");
		memberNames.add("Kevin");
		memberNames.add("Amy");
		memberNames.add("Anderson");
		boolean matchResult=memberNames.stream().anyMatch((s)->s.startsWith("A"));
		System.out.println(matchResult);
	}

}
