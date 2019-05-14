package java8.annotations;

import java.util.Arrays;

public class RolesTest {

	public static void main(String[] args) {

		RelatorioController controller = new RelatorioController();
		
		Role[] annotationsByType = controller.getClass().getAnnotationsByType(Role.class);
		
		Arrays.asList(annotationsByType).forEach(a -> System.out.println(a.value()));

	}

}
