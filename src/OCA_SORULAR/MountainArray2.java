package OCA_SORULAR;

public class MountainArray2 {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 3, 5, 8, 2, 3 }; //

		int flag1 = 0;
		int flag2 = 0;
		boolean kontrol = true;

		// Her eleman kendisinen sonra gelen elemen ile karsilastirildigindan outer for
		// son elemana kadar gitmemeli.
		for (int i = 0; i < arr.length - 1; i++) { // Her eleman kendisinden sonra gelen elemandan kucuk olmali,
													// bu sart, sart bozulduktan sonra terse donmeli.
			for (int j = i + 1; j < i + 2; j++) { // ve bir kez kucuk elemana rastlanmis olmali, yani [1,2,3,4,5] sarta
													// uymuyor.(cikis ve inis mutlaka olmali)
				if (arr[i] < arr[j] && flag1 == 0) {
					flag2 = 1; // burasi en az bir kere calismali
				} else if (arr[i] > arr[j]) {
					flag1 = 1; // burasi en az bir kere calismali
				} else {
					kontrol = false;
					break;
				}
			}
		}

		if (kontrol && flag1 == 1 && flag2 == 1) {
			System.out.println("Mountain Array");
		} else {
			System.out.println("Mountain Array DEGIL");
		}

	}
}
