public class GeneradorEmail {
    public static void main(String[] args) {
        String nombreUsuario = "Carlos Delgado";
        String nombreUsuarioNormalizado = String.join(".",nombreUsuario.toLowerCase().split(" "));
        System.out.println("nombreUsuario = " + nombreUsuario);
        System.out.println("nombreUsuarioNormalizado = " + nombreUsuarioNormalizado + "\n");

        String nombreEmpresa = "Global Mentoring";
        String extensionDominio = ".com.mx";
        StringBuilder dominioEmailNormalizado =  new StringBuilder();
        dominioEmailNormalizado.append("@");
        dominioEmailNormalizado.append(nombreEmpresa.toLowerCase().replace(" ", ""));
        dominioEmailNormalizado.append(extensionDominio);

        System.out.println("nombreEmpresa = " + nombreEmpresa);
        System.out.println("extensionDominio = " + extensionDominio);
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado + "\n");

        System.out.println(nombreUsuarioNormalizado + dominioEmailNormalizado);
    }
}
