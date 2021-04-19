package factory;

public class CharacterFactory {

    public Codeamon createCodeamon(String type) {

        if(type == null || type.isEmpty()) {

            return null;

        }

        if("Fire".equals(type)) {

            return new FireCodeamon();

        }else if("Water".equals(type)) {

            return new WaterCodeamon();

        }else if("Grass".equals(type)) {

            return new GrassCodeamon();

        }

        return null;

    }

    public Trainer createTrainer(String type) {

        if(type == null || type.isEmpty()) {

            return null;

        }

        if("Beginner".equals(type)) {

            return new BeginnerTrainer();

        }else if("Expert".equals(type)) {

            return new ExpertTrainer();

        }

        return null;

    }

}
