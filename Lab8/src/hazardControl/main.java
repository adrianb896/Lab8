import hazardPeronel.*;

public class main {
    public static void main(String[] args) {
        // build management hierarchy
        // make employees
        Worker nick = new Worker ("Nick");
        Worker john = new Worker ("John");
        Worker mary = new Worker ("Mary");
        Worker jane = new Worker ("Jane");
        Worker tom = new Worker ("Tom");
        Worker rob = new Worker ("Rob");
        Worker ed = new Worker ("Ed");
        Worker rick = new Worker ("Rick");
        Worker michael = new Worker ("Michael");
        Worker joe = new Worker ("Joe");
        Worker frank = new Worker ("Frank");
        Worker sam = new Worker ("Sam");
        Worker greg = new Worker ("Greg");
        Worker amy = new Worker ("Amy");
        Worker will = new Worker ("Will");
        Worker nancy = new Worker ("Nancy");
        Worker adam = new Worker ("Adam");

        Supervisor jack = new Supervisor ("Jack");
        Supervisor jeff = new Supervisor ("Jeff");

        ProjectLeader chuck = new ProjectLeader ("Chuck");
        ProjectLeader denise = new ProjectLeader ("Denise");

        Manager bob = new Manager ("Bob");
        Manager rachel = new Manager ("Rachel");

        CEO steve = new CEO ("Steve");

        //link employees
        // Jack
        jack.addMember(nancy);
        jack.addMember(john);
        jack.addMember(mary);
        jack.addMember(jane);
        jack.addMember(tom);
        nick.setDirectOverseer(jack);
        john.setDirectOverseer(jack);
        mary.setDirectOverseer(jack);
        jane.setDirectOverseer(jack);
        tom.setDirectOverseer(jack);

        // Jeff
        jeff.addMember(rob);
        jeff.addMember(ed);
        jeff.addMember(rick);
        jeff.addMember(michael);
        rob.setDirectOverseer(jeff);
        ed.setDirectOverseer(jeff);
        rick.setDirectOverseer(jeff);
        michael.setDirectOverseer(jeff);

        //Bob
        bob.addMember(jeff);
        bob.addMember(jack);
        jack.setDirectOverseer(bob);
        jeff.setDirectOverseer(bob);

        //Chuck
        chuck.addMember(joe);
        chuck.addMember(frank);
        chuck.addMember(sam);
        chuck.addMember(greg);
        joe.setDirectOverseer(chuck);
        frank.setDirectOverseer(chuck);
        sam.setDirectOverseer(chuck);
        greg.setDirectOverseer(chuck);

        //Denise
        denise.addMember(amy);
        denise.addMember(will);
        denise.addMember(nancy);
        denise.addMember(adam);
        amy.setDirectOverseer(denise);
        will.setDirectOverseer(denise);
        nancy.setDirectOverseer(denise);
        adam.setDirectOverseer(denise);

        //Rachel
        rachel.addMember(chuck);
        rachel.addMember(denise);
        chuck.setDirectOverseer(rachel);
        denise.setDirectOverseer(rachel);

        //Steve
        steve.addMember(bob);
        steve.addMember(rachel);
        bob.setDirectOverseer(steve);
        rachel.setDirectOverseer(steve);

        john.seeDanger(null, null);
    }
}

