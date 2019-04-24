package ru.curs.demo;

import ru.curs.celesta.CallContext;
import ru.curs.lyra.kernel.BasicGridForm;
import ru.curs.lyra.kernel.annotations.FormParams;
import ru.curs.lyra.kernel.annotations.LyraForm;
import ru.curs.lyra.service.FormInstantiationParameters;

import java.time.LocalDateTime;
import java.util.Map;

@LyraForm(gridWidth = "100%", gridHeight = "670px")
public class P1MusSample extends BasicGridForm<Show_tableCursor> {

    @FormParams
    private FormInstantiationParameters params = null;

    public P1MusSample(CallContext c/*, FormInstantiationParameters params*/) {
        super(c);
        createAllBoundFields();
    }

    @Override
    public Show_tableCursor getCursor(CallContext callContext) {
        Show_tableCursor c = new Show_tableCursor(callContext);

        System.out.println("LLLLLLLLLLLLLLL44.getCursor");
        if (params != null) {
            System.out.println(params.getClientParams());

            Map<String, Object> refreshParams = (Map<String, Object>) params.getClientParams().get("refreshParams");
            String sort = (String) refreshParams.get("sort");
            System.out.println(sort);

            String[] names = sort.split(",");

            c.orderBy(names);
            //c.orderBy("id");

            getFormProperties().setFooter("<h5>refreshParams: " + refreshParams.toString() + ", date: " + LocalDateTime.now() + "</h5>");
        }

        return c;
    }



/*
    @Override
    public int getGridHeight() {
        return 50;
    }

    @Override
    public String getSummaryRow() {
        return null;
    }

    @Override
    public void beforeSending(BasicCursor basicCursor) {
        rec().setName("dd22");
    }
*/

}
