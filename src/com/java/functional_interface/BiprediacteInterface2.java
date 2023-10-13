package com.java.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiprediacteInterface2 {

	public static void main(String[] args) {
		List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));

        BiPredicate<String, Integer> bi = (domain, score) -> {
            return (domain.equalsIgnoreCase("google.com") || score == 0);
        };

       
        List<Domain> result = filterBadDomain(domains, bi);
        System.out.println(result); 

     
        List<Domain> result2 = filterBadDomain(domains, (domain, score) -> score == 0);
        System.out.println(result2); 

       
        List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") && score > 5);
        System.out.println(result3); 

       
        List<Domain> result4 = filterBadDomain(domains, bi.or(
                (domain, x) -> domain.equalsIgnoreCase("microsoft.com"))
        );
        System.out.println(result4); 
 

    }

    public static <T extends Domain> List<T> filterBadDomain(
            List<T> list, BiPredicate<String, Integer> biPredicate) {

        return list.stream()
                .filter(x -> biPredicate.test(x.getName(), x.getScore()))
                .collect(Collectors.toList());

    }



}


