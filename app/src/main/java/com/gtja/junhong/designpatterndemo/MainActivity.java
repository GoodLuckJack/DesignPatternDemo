package com.gtja.junhong.designpatterndemo;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.gtja.junhong.designpatterndemo.cash.DiscountModel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends Activity {


    /**
     * price for goods
     */
    private EditText etPriceInput;

    /**
     * confirm to get sum
     */
    private Button btnConfirm;

    /**
     * Amount input
     */
    private EditText etAmountInput;


    /**
     * Reset Button
     */
    private Button btnReset;

    /**
     * Discount info selector
     */
    private Spinner spinner;

    /**
     * for goods list to show
     */
    private TextView goodsList;

    private List<DiscountModel> mDiscountModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
    }

    private void findViewById() {
        etPriceInput = findViewById(R.id.price_input);
        etAmountInput = findViewById(R.id.amount_input);

        btnConfirm = findViewById(R.id.confirm);
        btnReset = findViewById(R.id.reset);

        goodsList = findViewById(R.id.goods_list);
    }

    private void spinnerInit() {
        spinner = findViewById(R.id.spinner);
        mDiscountModels = new ArrayList<>();
        parseOptions();


    }

    /**
     * parse local data for selector
     */
    private void parseOptions() {
        try {
            InputStream inputStream = getAssets().open("options.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            Element element = (Element) document.getDocumentElement();
            NodeList nodeList = element.getElementsByTagName("type");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element type = (Element) nodeList.item(i);
                DiscountModel model = new DiscountModel();
                String discountName = type.getAttribute("discountName");
                String className = type.getAttribute("className");
                String param = type.getAttribute("param");
                model.setClassName(className);
                model.setDiscountName(discountName);
                model.setParam(param);
                mDiscountModels.add(model);
            }

        } catch (Exception e) {

        }
    }

    class MyAdapter extends BaseAdapter {

        private Context mContext;
        private List<DiscountModel> mDiscountList;

        public MyAdapter(Context context, List<DiscountModel> mDiscountList) {
            this.mContext = context;
            this.mDiscountList = mDiscountList;
        }

        @Override
        public int getCount() {
            return mDiscountList.size();
        }

        @Override
        public Object getItem(int i) {
            return mDiscountList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }


}
