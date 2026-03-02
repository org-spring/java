package com.basic.intermediate;

class VersionOneOS {
    public void features() {
        System.out.println("basic ui");
        System.out.println("file manager");
    }
}

class VersionTwoOS extends VersionOneOS {
    public void features() {
        System.out.println("dark mode");
        System.out.println("improved security");
        super.features();
    }
}

public class MethodOverriding {
    static void main(String[] args) {
        VersionTwoOS versionTwo = new VersionTwoOS();
        versionTwo.features();
    }

}