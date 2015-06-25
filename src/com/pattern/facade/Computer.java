package com.pattern.facade;

/**
 * User: May
 * Date: 2015-06-25
 * Time: 11:42
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("Computer is starting ...");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("Computer started !");
    }

    public void shutdown() {
        System.out.println("Computer is shutdown ...");
        disk.shuntdown();
        memory.shuntdown();
        cpu.shuntdown();
        System.out.printf("Computer shutdown !");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
