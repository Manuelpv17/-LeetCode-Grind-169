class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> lifo = new ArrayList<>();
        Map<Character, Character> charsParentheses = new HashMap<>();
        charsParentheses.put('(', ')');
        charsParentheses.put('{', '}');
        charsParentheses.put('[', ']');

        if (s.length() % 2 != 0){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            if (charsParentheses.containsKey(s.charAt(i))){
                lifo.add(0, s.charAt(i));
            } else if (lifo.size() > 0 && s.charAt(i) == charsParentheses.get(lifo.get(0))) {
                lifo.remove(0);
            } else {
                return false;
            }
        }

        if (lifo.size() > 0){
            return false;
        }
        return true;
    }
}
