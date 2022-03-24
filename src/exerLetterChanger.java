public class exerLetterChanger {

    public void Change(){

        StringBuilder tInput = new StringBuilder("uuuUUU");
        StringBuilder input = new StringBuilder("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et e");


        for(int i = 0; i < input.length(); i++){

            if (input.charAt(i) == 'u'){

                input.setCharAt(i, 'v');

            }

            if (input.charAt(i) == 'U'){

                input.setCharAt(i, 'V');


            }

            if(input.charAt(i) == ' '){

                input.setCharAt(i + 1, Character.toUpperCase(input.charAt(i + 1)));

            }

        }

        System.out.println(input);


    }



}
