package polymorphismus_exercise;

public class Interaktion {

    public static void main(String[] args) {

        Rechner myRechner = new Rechner();

        for (int i = 0; i < 10; i++) {

            Form formen;

            int color = (int) Math.round(Math.random() * 3 + 1);
            int type = (int) Math.round(Math.random() * 1 + 1);
            int numb = (int) Math.round(Math.random() * 9 + 1);

            if (type == 1) {

                formen = new Kreis();

                ((Kreis) formen).setRadius(numb);


            } else {

                formen = new Quadrat();

                ((Quadrat) formen).setKantenLaenge(numb);


            }

            switch (color) {

                case 1:
                    formen.setFarbe("rot");
                    break;

                case 2:
                    formen.setFarbe("grün");
                    break;

                case 3:
                    formen.setFarbe("blau");
                    break;

                case 4:
                    formen.setFarbe("lila");
                    break;

            }
            myRechner.setArray(formen);



        }
        myRechner.printFarben();
        myRechner.printFlaechen();
        myRechner.printUmfang();

    }

}
