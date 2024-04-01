package dk.sebsa;

import dk.sebsa.spellbook.core.Application;

public class Arcana implements Application {
    public static void main(String[] args) {
        Spellbook.start(new Arcana(), SpellbookCapabilities.builder().build());
    }

    @Override
    public String name() {
        return "2";
    }

    @Override
    public String author() {
        return "1";
    }

    @Override
    public String version() {
        return "1";
    }
}
