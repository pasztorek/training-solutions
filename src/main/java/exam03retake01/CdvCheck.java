package exam03retake01;

public class CdvCheck {

    public boolean check(String vat) {
        int sum = 0;
        if (vat.length() != 10) {
            throw new IllegalArgumentException();
        }

        try {
            Long vatNumber = Long.parseLong(vat);

            for (int i = 0; i <= vat.length() - 2; i++) {
                sum = sum + (Character.getNumericValue(vat.charAt(i)) * (i + 1));
            }

        } catch (IllegalArgumentException ie) {
            throw new IllegalArgumentException(ie);
        }

        if (sum % 11 == (Character.getNumericValue(vat.charAt(9)))) {

            return true;
        }
        return false;
    }
}
