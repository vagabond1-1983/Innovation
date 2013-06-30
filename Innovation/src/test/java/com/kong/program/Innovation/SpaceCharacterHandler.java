package com.kong.program.Innovation;

public class SpaceCharacterHandler {
	private String[] words;

	public SpaceCharacterHandler(String sentence, String regex) {
		words = sentence.split(regex);
	}

	class OneSpaceConnection {
		
	}
	
	public String getOneSpaceResult() {
		return new OneSpaceConnection(){
			String connect() {
				StringBuffer result = new StringBuffer();
				for (String word : words) {
					if (!word.isEmpty()) {
						result.append(word).append(' ');
					}
				}
				return result.deleteCharAt(result.length() - 1).toString();
			}
			
		}.connect();
	}
}
