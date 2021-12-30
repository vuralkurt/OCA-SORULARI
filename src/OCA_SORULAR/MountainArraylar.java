package OCA_SORULAR;

public class MountainArraylar {

	public static void main(String[] args) {
		/*
		Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, 
		decreasing constantly after the maximum value
		Not Mauntain Array--> [5, 2, 7, 1, 4] 
		​
		Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk degerinden sonra 
		surekli azalan deger aliyorsa Mauntain Array'dir
		 */
		
		int aar1[]= {1,2,3,4,6,4,3};
		
		boolean flag1 = true; // yarisina kadarlik kismin foru icin kontrol
		boolean flag2 = true; // yarisindan sonraki  kismin foru icin kontrol
							// siz int kontrol=0 der olayin sonunda hala 0 sa diye de kontrol edebilirsiniz
		
		
        //yarisina kadar kismi kontrol foru
		for (int i = 0; i < findMaxElements(aar1) - 1; i++) {
			if (aar1[i] >= aar1[i + 1]) {
				flag1 = false;
				break;
			}
		}
		
		
		 //yarisindan sonraki kismi kontrol foru
		for (int i = findMaxElements(aar1); i < aar1.length - 1; i++) {
			if (aar1[i] <= aar1[i + 1]) {
				flag2 = false;
				break;
			}
		}

		
		// iki fordan da flag false olmadan cikabildiyse demekki Mauntain Array
		if (flag2 && flag1) {
			System.out.println("Girilen array Mauntain Array'dir");
		} else {
			System.out.println("Girilen array Mauntain Array degildir");
		}

	}

	private static int findMaxElements(int[] arr) {
		int max = Integer.MIN_VALUE;
		int Maxindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				Maxindex = i;

			}
		}

		return Maxindex;
	}

}


