package com.ti;

public class SwitchStructure {

    static String hero = "Spider-Man";
    static String loki = "";

    public static void main(String[] args) {
        /*switch(hero){
            case "Iron-Man":
                loki = "Mandarin";
                break;
            case "Spider-Man":
                loki = "Venom";
                break;
            case "Hulk":
                loki = "Abomination";
                break;
            case "DareDevil":
                loki = "Kingpin";
                break;
            default:
                loki = "Loki";
        }*/

        /*switch(hero){
            case "Iron-Man" -> { loki = "Mandarin"; }
            case "Spider-Man" -> { loki = "Venom"; }
            case "Hulk" -> { loki = "Abomination"; }
            case "Daredevil" -> { loki = "Kingpin"; }
            default -> { loki = "Loki"; }
        }*/

        loki = switch(hero){
          case "Iron-Man" -> "Mandarin";
          case "Spider-Man" -> "Venom";
          case "Hulk" -> "Abomination";
          case "Daredevil" -> "Kingpin";
          default -> "Loki";
        };

        System.out.println(loki);

    }

}
