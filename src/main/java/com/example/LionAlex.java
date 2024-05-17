package com.example;

import java.util.List;

public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super("Самец",feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() throws Exception {
        return 0;
    }
}
