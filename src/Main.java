public class Main {
            public static void main(String[] args) {
                var dog = 8.0;
                System.out.println(dog);
                var cat = 3.6;
                System.out.println(cat);
                var paper = 763789;
                System.out.println(paper);
                 dog = dog + 4;
                 System.out.println(dog);
                 cat = cat + 4;
                System.out.println(cat);
                paper = paper + 4;
                System.out.println(paper);
                dog = dog - 3.5;
                System.out.println(dog);
                cat = cat - 1.6;
                System.out.println(cat);
                paper = paper - 7639;
                System.out.println(paper);

                var friend = 19;
                System.out.println(friend);
                friend = friend + 2;
                System.out.println(friend);
                friend = friend / 7;
                System.out.println(friend);
                var frog = 3.5;
                System.out.println(frog);
                frog = frog * 10;
                System.out.println(frog);
                frog = frog / 3.5;
                System.out.println(frog);
                frog = frog + 4;
                System.out.println(frog);
                var weightOfBoxerNumber1 = 78.2;
                var weightOfBoxerNumber2 = 82.7;
                var weightOfTwoBoxers = weightOfBoxerNumber1 + weightOfBoxerNumber2;
                System.out.println("общий вес двух боксеров " + weightOfTwoBoxers + " кг");
                var weightDifference = weightOfBoxerNumber2 - weightOfBoxerNumber1;
                System.out.println("разница веса в " + weightDifference + " кг");
                var overWeight = weightOfBoxerNumber2 % weightOfBoxerNumber1;
                System.out.println("перевес на " + overWeight + " кг");
            }

    }



