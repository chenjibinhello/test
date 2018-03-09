package test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.sound.midi.Soundbank;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("50", "mon");
		map.put("49", "jim");
		map.put("51", "code");
		System.out.println(map);
		
	}
}
