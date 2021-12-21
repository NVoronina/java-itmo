package lesson12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<PromoCode> promoCodeList = List.of(
                new PromoCode("test1", false),
                new PromoCode("test2", true),
                new PromoCode("test3", false),
                new PromoCode("test4", true),
                new PromoCode("test4", false)
        );
        Stream<PromoCode> stream = promoCodeList.stream();
        Stream<PromoCode> stream2 = Stream.of(
                new PromoCode("test1", true),
                new PromoCode("test2", true),
                new PromoCode("test3", false),
                new PromoCode("test4", true)
        );
        promoCodeList.stream().filter(promoCode -> !promoCode.isExpired())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<PromoCode> collect = promoCodeList.stream().filter(promoCode -> !promoCode.isExpired())
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
        promoCodeList.stream().limit(1).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
