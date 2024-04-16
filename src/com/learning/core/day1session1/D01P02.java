package com.learning.core.day1session1;

public class D01P02 {

	public static void main(String[] args) {
		// Declare Medicine instances
        MedicineInfo[] medicines = new MedicineInfo[3];
        medicines[0] = new Tablet();
        medicines[1] = new Syrup();
        medicines[2] = new Ointment();

        // Check polymorphic behavior of displayLabel method
        for (MedicineInfo medicine : medicines) {
            medicine.displayLabel();
        }

	}

}
