package kakao_condigtest.blind2023;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 개인정보수집유효기간 {

    static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    static ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        LocalDate parsedToday = LocalDate.parse(today, FORMAT);

        HashMap<String, Integer> expirationMap = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            StringTokenizer st = new StringTokenizer(terms[i]);
            expirationMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i <= privacies.length; i++) {
            StringTokenizer st = new StringTokenizer(privacies[i-1]);
            LocalDate collectedDate = LocalDate.parse(st.nextToken(), FORMAT);
            Integer expireMonth = expirationMap.get(st.nextToken());

            LocalDate expire = collectedDate.plusMonths(expireMonth).minusDays(1);
            if (expire.equals(parsedToday)) {
                continue;
            }

            if (expire.isBefore(parsedToday)) {
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> solution = solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});

        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
