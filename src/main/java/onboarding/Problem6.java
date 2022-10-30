package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> emails = new ArrayList<>();

        for (int i=0; i < forms.size(); i++) {
            for(int j=0; j < forms.size(); j++) {
                if ( isDuplicated(forms.get(i).get(1), forms.get(j).get(1))) {
                    emails.add(forms.get(i).get(0));
                    emails.add(forms.get(j).get(0));
                }
            }
        }

        Collections.sort(emails);

        return emails;
    }

    private static boolean isDuplicated(String email1, String email2) {
        for (int i = 0; i < email1.length(); i++) {
            for (int j = 0; j < email2.length(); j++) {
                if (email1.substring(i, i+1).equals(email2.substring(j, j+1))) {
                    return true;
                }
            }
        }
        return false;
    }
}
