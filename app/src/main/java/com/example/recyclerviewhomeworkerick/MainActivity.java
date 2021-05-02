package com.example.recyclerviewhomeworkerick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("Tarta Sacher",
                "La famosa Tarta Sacher, fue inventada en 1832 por Franz Sacher. Este hombre era un ayudante de cocina, que consiguió impresionar con su tarta al príncipe Klemens Wenzel Lothar von Metternich.",
                "img1",
                "Mazapán (ver indicaciones más abajo)...220 g\n" +
                        "Azúcar glasé...80 g\n" +
                        "Yema de huevo...140 g\n" +
                        "Clara de huevo...200 g\n" +
                        "Azúcar...125 g\n" +
                        "Mantequilla a temperatura ambiente...65 g\n" +
                        "Cacao en polvo...65 g\n" +
                        "Harina de trigo...70 g\n" +
                        "Mermelada de albaricoque...120 g\n" +
                        "Chocolate fondant (cobertura)...250 g\n" +
                        "Nata líquida...250 g",
                "Comenzaremos haciendo el mazapán. Para ello mezclamos en un bol 100 gramos de almendra en polvo, 100 gramos de azúcar glas y 20 gramos de agua y vamos amasando hasta conseguir una masa sólida, pero blanda. Precalentamos el horno a 180 grados.\n" +
                        "\n" +
                        "Seguidamente colocamos en el vaso de una batidora el mazapán, y posteriormente la mantequilla, las yemas y el azúcar glas. Batimos hasta que quede esponjoso.\n" +
                        "\n" +
                        "Echamos la harina junto con el cacao tamizados a la mezcla anterior y mezclamos. Por otra parte batimos las claras con el azúcar blanquilla a punto de nieve. Agregamos a la masa en dos veces y echamos en un molde engrasado y enharinado de 20 centímetros de diámetro. Horneamos durante cuarenta minutos aproximadamente.\n" +
                        "\n" +
                        "Una vez horneado y frío el bizcocho, lo cortamos a la mitad y le añadimos la mermelada de albaricoque. Para el glaseado ponemos en un cazo a hervir la nata y la volcamos sobre la cobertura de chocolate troceada, removemos y cuando alcance los 30 grados de temperatura lo echamos por encima de la tarta colocada en una rejilla."));
        elements.add(new ListElement("Pastel de chocolate, plátano y pera sin azúcar añadido",
                "Hemos adaptado una receta original de dulcementenadia en Instagram, quien lo preparó originalmente en microondas y usando solamente plátanos, además de avena. En este caso hemos combinado dos frutas, plátano y peras conferencia muy maduras, usando una combinación de harinas sin gluten y bajas en hidratos, quinoa y avellanas. No añadimos nada de azúcar ni edulcorante; cuanto más madura esté la fruta, más dulce saldrá.",
                "img2",
                "Plátano maduro (peso sin piel)...300 g\n" +
                        "Pera madura (peso sin piel ni corazón)...200 g\n" +
                        "Huevo L...3\n" +
                        "Mantequilla de cacahuete natural (1 cucharada)...15 ml\n" +
                        "Leche de almendras o otra vegetal (2 cucharadas)...30\n" +
                        "Esencia de vainilla...5 ml\n" +
                        "Cacao en polvo...35 g\n" +
                        "Harina de quinoa (o arroz, o maizena, o trigo sarraceno)...40 g\n" +
                        "Avellana molida (o almendra)...40 g\n" +
                        "Levadura química (1 cucharadita)...4 g\n" +
                        "Sal...2 g\n" +
                        "Chocolate negro sin azúcar (opcional)...100 g",
                "Precalentar el horno a 180ºC con calor arriba y abajo, y preparar un molde de fondo desmontable de unos 20 cm de diámetro (si es más pequeño quedará más gordito, y si es más grande más finito). Recomendamos forrar el fondo con papel sulfurizado y engrasar los laterales.\n" +
                        "\n" +
                        "Pelar la fruta y pesarla para obtener los 500 g, retirando el corazón y semillas en el caso de las peras o manzanas. Triturar hasta obtener un puré homogéneo (puede quedar algún grumito). Añadir los huevos, la mantequilla de cacahuete, la vainilla y la leche, y triturar de nuevo.\n" +
                        "\n" +
                        "Añadir el cacaco en polvo, la levadura química, la harina sin gluten y la avellana o almendra molida, y volver a triturar lo justo hasta que quede una masa homogénea, sin grumos secos. Añadir el chocolate picado o en chips, y remover.\n" +
                        "\n" +
                        "Verter la masa en el molde con cuidado, dar unos golpecitos suaves para igualar bien la superficie y romper las burbujas más grandes, y llevar al horno. Hornear durante unos 45-50 minutos, o hasta que al pinchar en el centro con un palillo salga casi limpio. Debe quedar jugosito, no seco como un bizcocho.\n" +
                        "\n" +
                        "Esperar un poco fuera del horno antes de desmoldar y dejar enfriar completamente sobre una rejilla, o hasta que esté solo ligeramente tibio."));
        elements.add(new ListElement("Galletas de avena caseras",
                "Si buscas una receta de galletas caseras sencillas, sin ingredientes extraños y muy rápidas de preparar, esta puede ser la ganadora que se quede para siempre en tu repertorio. Son las típicas galletas de avena al estilo norteamericano, ligeramente crujientes por fuera y con el corazón más tierno, un clásico de la repostería que no necesita más adornos para seguir siendo uno de los dulces favoritos de niños y mayores.",
                "img3",
                "Mantequilla sin sal a temperatura ambiente...170 g\n" +
                        "Azúcar moreno...100 g\n" +
                        "Azúcar...90 g\n" +
                        "Esencia de vainilla...5 ml\n" +
                        "Huevo L (de unos 65 g con cáscara) a temperatura ambiente...1\n" +
                        "Harina de repostería...100 g\n" +
                        "Canela molida...2 g\n" +
                        "Bicarbonato sódico (1/2 cucharadita)...3 g\n" +
                        "Sal (1/2 cucharadita)...2 g\n" +
                        "Copos de avena...260 g",
                "Precalentar el horno a 180ºC con calor arriba y abajo, y preparar dos bandejas con papel sulfurizado antiadherente. Disponer la mantequilla troceada en un recipiente con cierta profundidad, y batir con batidora de varillas eléctrica para cremarla ligeramente.\n" +
                        "\n" +
                        "Añadir los dos azúcares y la vainilla, y batir durante dos minutos hasta que quede una masa homogénea. Agregar el huevo y batir un poco más, removiendo la masa con una espátula para aglutinar todo bien antes de seguir batiendo.\n" +
                        "\n" +
                        "Mezclar aparte con unas varillas la harina con la canela y el bicarbonato, para romper los grumos, y agregarla a la masa principal. Batir suavemente con la batidora. Echar finalmente los copos de avena y combinar todo a mano con una espátula, lengüeta o cuchara grande.\n" +
                        "\n" +
                        "Tomar porciones de masa repartiendo bolitas del tamaño de una pelota de golf (o del tamaño deseado) en las bandejas, dejando al menos 5 cm entre ellas; más si son más grandes. Con las manos ligeramente humedecidas, compactar la masa y dar forma de disco grueso, entre 1 y 1,5 cm de grosor.\n" +
                        "\n" +
                        "Hornear una bandeja cada vez durante unos 12-15 minutos, hasta que estén doradas. vigilar que no se pasen y afinar el tiempo según se prefieran más crujientes o más tiernas. Esperar un poco fuera del horno antes de trasladar a una rejilla para que se enfríen."));
        elements.add(new ListElement("Vasitos de masa de galleta con chips de chocolate",
                "A medio camino entre bizcocho, pastel y cookie blanda al estilo Tony Roma's, estos vasitos de masa de galleta con chocolate son, ante todo, una tentadora delicia para disfrutar en muy pocos minutos. Es una receta que hemos adaptado de la británica Nigella Lawson, de quien somos fervientes seguidores, y sin duda se ha ganado un puesto fijo en nuestro repertorio de postres exprés.",
                "img4",
                "Harina de repostería...150 g\n" +
                        "Sal (1/2 cucharadita rasa)...2 g\n" +
                        "Bicarbonato sódico (1/2 cucharadita)...4 g\n" +
                        "Mantequilla blanda (a temperatura ambiente)...100 g\n" +
                        "Azúcar moreno...75 g\n" +
                        "Esencia de vainilla...5 ml\n" +
                        "Huevo L a temperatura ambiente...1\n" +
                        "Leche...20 g\n" +
                        "Chips de chocolate negro...150 g\n" +
                        "Mantequilla para engrasar",
                "Precalentar el horno a 180ºC con calor arriba y abajo, sin ventilador, y engrasar con mantequilla unos seis recipientes refractarios, tipo ramekin, de unos 200 ml de capacidad y 8 cm de diámetro.\n" +
                        "\n" +
                        "Tamizar la harina con la sal y la levadura; reservar. Batir en otro recipiente la mantequilla blanda con el azúcar, usando varillas eléctricas, hasta que se forme una crema esponjosa y homogénea. Añadir la vainilla, el huevo y la leche y batir un poco más.\n" +
                        "\n" +
                        "Echar la mezcla de harina en dos o tres tandas, batiendo a velocidad muy baja. Terminar de mezclar a mano con una espátula, incorporar los chips de chocolate, y trabajar la masa lo justo para distribuirlos bien.\n" +
                        "\n" +
                        "Repartir en los vasitos, homogeneizando la superficie, y hornearlos sobre una bandeja durante unos 13-15 minutos. Vigilar que no se pasen; al pinchar el centro con un palillo, debe salir manchado. Sacar del horno y esperar unos 5-10 minutos antes de servir calientes."));
        elements.add(new ListElement("Magdalenas de chocolate",
                "Esta entrada va dirigida, principalmente, a los chocolateros del mundo que disfrutan de este producto de cualquier manera y en cualquier forma. Porque estas magdalenas de chocolate están para empezar y no parar. Son las mejores magdalenas de chocolate que he preparado hasta la fecha, y han sido unas cuantas. Aunque, por supuesto, existen multitud de recetas y variaciones y cada cual puede tener la suya favorita.",
                "img5",
                "Zumo de limón...5 ml\n" +
                        "Leche...175 ml\n" +
                        "Harina de trigo...200 g\n" +
                        "Cacao en polvo puro...60 g\n" +
                        "Bicarbonato sódico...5 g\n" +
                        "Mantequilla a temperatura ambiente...100 g\n" +
                        "Azúcar...200 g\n" +
                        "Café soluble disuelto en una cucharadita de agua muy caliente...5 g\n" +
                        "Huevo M...2\n" +
                        "Chips de chocolate...75 g",
                "Mezclamos el zumo de limón con la leche y dejamos reposar la mezcla durante unos 20 minutos. Con ello conseguiremos que la leche se corte y obtendremos lo que, en muchas recetas anglosajonas y alemanas, se denomina buttermilk. Una leche imposible de beber, por su sabor agrio y su textura grumosa, pero que funciona de maravilla con masas batidas por el punto de jugosidad y sabor que aporta.\n" +
                        "\n" +
                        "Tamizamos la harina, el cacao en polvo y el bicarbonato de soda. Reservamos. Batimos los huevos y el azúcar hasta que doblen su volumen y adquieran un tono blanquecino. Este paso lleva unos 10 minutos, de modo que usamos unas varillas eléctricas, a no ser que queramos sacar músculo y ahorrarnos la sesión de gimnasio. Agregamos la mantequilla y batimos nuevamente.\n" +
                        "\n" +
                        "Añadimos el café disuelto en agua y mezclamos hasta incorporar. A continuación añadimos la mitad de la leche cortada y removemos de nuevo hasta incorporar. Entonces incorporamos la mitad de la mezcla de la harina, cacao y bicarbonato. Removemos de nuevo. Repetimos la operación añadiendo el resto de la leche, removiendo, el resto de la mezcla de harina y removemos hasta obtener una mezcla homogénea. Por último, incorporamos los chips de chocolate y removemos con suavidad.\n" +
                        "\n" +
                        "Vertemos la mezcla en 12 cápsulas de papel para magdalenas, colocadas en los huecos de una bandeja de horno especial para este tipo de bollería. Introducimos en el horno, que tendremos listo a una temperatura de 180ºC, en la zona inferior. Horneamos durante 12-14 minutos o hasta que, al introducir una brocheta en el interior, comprobemos que esta sale limpia. Retiramos y dejamos enfriar."));
        elements.add(new ListElement("Bizcocho de limón",
                "Esta receta de bizcocho de limón de Linda McCartney es del libro Mis recetas caseras. El aroma de limón es uno de mis preferidos y supongo que por eso este bizcocho me resultó tan delicioso, pues es el sabor que lo impregna enteramente.",
                "img6",
                "Mantequilla a temperatura ambiente...125 g\n" +
                        "Azúcar...150 g\n" +
                        "Huevo L...2\n" +
                        "Ralladura de limón...1\n" +
                        "Zumo de limón...3\n" +
                        "Harina de repostería...180 g\n" +
                        "Levadura química...16 g\n" +
                        "Leche...60 ml\n" +
                        "Azúcar glasé...50 g",
                "Empezamos precalentando el horno a 180 ºC. Untamos con mantequilla un molde de plum cake antiadherente. En un bol grande batimos la mantequilla y el azúcar con unas varillas eléctricas.\n" +
                        "\n" +
                        "Gradualmente incorporamos los huevos batidos y seguimos batiéndolo todo hasta que quede una mezcla espumosa. Agregamos la ralladura de limón, la harina y la levadura. Mezclamos bien.\n" +
                        "\n" +
                        "Añadimos dos cucharadas de zumo de limón y mezclamos bien de nuevo. Después incorporamos la leche y removemos. Vertemos la mezcla en el molde y horneamos unos 35 o 40 minutos.\n" +
                        "\n" +
                        "Mientras, mezclamos el zumo de limón restante con el azúcar molido en un cuenco pequeño, batiendo con un tenedor. Cuando el bizcocho esté listo, lo dejamos enfriar cinco minutos, lo pasamos a una bandeja, lo pinchamos con un palillo y lo rociamos con el jarabe de limón."));
    }
}