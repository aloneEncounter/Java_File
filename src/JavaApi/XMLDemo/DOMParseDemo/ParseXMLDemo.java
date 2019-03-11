package JavaApi.XMLDemo.DOMParseDemo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class ParseXMLDemo {
    // 收藏信息，XML对应的Document 对象
    private Document document;

    // 获得DOM树
    public void getDom() {
        //获得解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //根据解析器工厂获得解析器
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            //解析器来解析XML文件获得Document对象

            document = builder.parse("file:\\Java\\Java_File\\src\\JavaApi\\XMLDemo\\收藏信息.xml");


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //  获取手机品牌及型号相关信息
    public void showInfo() {

        // 以Document 做起点，先拿到所有的Brand节点
        NodeList brands = document.getElementsByTagName("Brand");
        // 遍历brands ，从中拿出每一个band
        for (int i = 0; i < brands.getLength(); i++) {
            Node node = brands.item(i);
            Element eleBrand = (Element) node;
            String brandName = eleBrand.getAttribute("name");
            System.out.println(brandName);

            //继续查找，找每个Brand的子节点出来
            NodeList types = eleBrand.getChildNodes();
            for (int j = 0; j < types.getLength(); j++) {
                Node typeNode = types.item(j);

                // 判断该子节点是否为元素节点  getNodeType():获得节点的类型
                if (typeNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element typeEle = (Element) typeNode;
//                    System.out.println(typeEle.getTextContent());
                    System.out.println("\t" + typeEle.getAttribute("name"));
                }
            }
        }

    }

    //为XML添加元素
    public void addEle() {
        //1、创建<Brand>    <Brand name="三星">
        Element brand = document.createElement("Brand");

        //2、为<Brand>设置name属性取值为三星
        brand.setAttribute("name", "三星");


        //3、<Type name="node2"/>
        Element type = document.createElement("Type");
        type.setAttribute("name", "NOte2");

        //将type作为Brand的子元素
        brand.appendChild(type);

        // 将Brand放到PhoneInfo中去  返回Nodelist
        document.getElementsByTagName("PhoneInfo").item(0).appendChild(brand);
        saveXML("收藏信息.xml");
    }

    // 保存 XML 文件(借助转换器 将转换后的内容记录到XML 中)   源（最新的DOM树）--》目的地（XML文件）
    // 借助输出流来实现
    public void saveXML(String path) {
        // 装换器工厂
        TransformerFactory factory = TransformerFactory.newInstance();
        //  设置缩进
        factory.setAttribute("indent-number",4);
        try {
            //  获得转换器
            Transformer transformer = factory.newTransformer();

            //  指定转换格式
//            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF8"); // 设置编码格式
            transformer.setOutputProperty(OutputKeys.INDENT,"YES");   // 允许缩进


            //源（最新的DOM树）--》目的地（XML文件）
            DOMSource source = new DOMSource(document);   //  源


//            OutputStream out= new FileOutputStream("收藏信息.xml");
            /*StreamResult result = new StreamResult(new OutputStreamWriter
                    (new FileOutputStream("收藏信息.xml")));*/
            StreamResult result = new StreamResult(new OutputStreamWriter
                    (new FileOutputStream(path),"UTF8"));

            transformer.transform(source, result);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    // 修改元素
    public void updateEle(){
        // 获取所有的 Brand
       NodeList brand= document.getElementsByTagName("Brand");
        for (int i = 0; i <brand.getLength(); i++) {
            Node node=brand.item(i);
            Element brandEle=(Element)node;
            brandEle.setAttribute("id",i+"");
        }
        saveXML("收藏信息.xml");
    }

    // 删除元素(华为手机)
    public void deleteEle(){
        // 获取所有Brand
        NodeList brand=document.getElementsByTagName("Brand");
        for (int i = 0; i <brand.getLength() ; i++) {
            Node node=brand.item(i);
            Element brandEle=(Element)node;
            if (brandEle.getAttribute("name").equals("华为")){
                //  获取父节点 删除 Brand
                brandEle.getParentNode().removeChild(brandEle);
            }
        }
        saveXML("收藏信息.xml");
    }


    public static void main(String[] args) {
        ParseXMLDemo pd = new ParseXMLDemo();
        pd.getDom();
//        pd.addEle();
//        pd.updateEle();
        pd.deleteEle();
        pd.showInfo();


    }
}














