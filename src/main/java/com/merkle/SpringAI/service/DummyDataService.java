package com.merkle.SpringAI.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyDataService {


    public record Pilot(String name) {}
    public record MobileSuit(String name) {}

    public List<MobileSuit> searchMsByName(Pilot pilot){

        System.out.println("查询参数是" + pilot.name);

        List<MobileSuit> list = new ArrayList<>();

        if ("Amuro".equals(pilot.name)){
            list.add(new MobileSuit("RX-78-2 高达"));
            list.add(new MobileSuit("RX-78-3 G-3 高达"));
            list.add(new MobileSuit("RMS-099 Rick Dias／力克·迪亚斯"));
            list.add(new MobileSuit("MSK-008 Dijeh／迪杰"));
            list.add(new MobileSuit("RX-178 高达Mk-II 阿姆罗专用机"));
            list.add(new MobileSuit("MSZ-006 Z高达 阿姆罗专用机"));
            list.add(new MobileSuit("MSZ-000 Zero Shiki／零式"));
            list.add(new MobileSuit("RMS-099B Schuzrum Dias／疾风·迪亚斯"));
            list.add(new MobileSuit("MSZ-006A1 Z-plus A1"));
            list.add(new MobileSuit("MSZ-006-3 Z高达3号机“白色独角兽”"));
            list.add(new MobileSuit("运输机"));
            list.add(new MobileSuit("ORX-013 高达Mk-V 阿姆罗专用机"));
            list.add(new MobileSuit("MSK-008R Rick Dijeh／力克·迪杰"));
            list.add(new MobileSuit("MSK-008R Modified Rick-Dijeh／力克·迪杰改"));
            list.add(new MobileSuit("RGM-88X Jeddah／杰达"));
            list.add(new MobileSuit("RGZ-91 Re-Gz／灵格斯"));
            list.add(new MobileSuit("RGZ-91B Re-Gz Custom／灵格斯特装型"));
            list.add(new MobileSuit("RX-93 ν高达"));
            list.add(new MobileSuit("RX-93-ν-2 Hi-ν高达"));
        }else if ("Char".equals(pilot.name)){
            list.add(new MobileSuit("MS-06S 夏亚专用扎古II"));
            list.add(new MobileSuit("MSM-07S 夏亚专用魔蟹"));
            list.add(new MobileSuit("MS-14S 夏亚专用勇士"));
            list.add(new MobileSuit("MSN-02 吉翁号"));
            list.add(new MobileSuit("MS-09RS 夏亚专用力克·大魔"));
            list.add(new MobileSuit("MS-15Plus 夏亚专用强人改良型"));
            list.add(new MobileSuit("RMS-099 力克·迪亚斯"));
            list.add(new MobileSuit("RX-178 高达Mk-II"));
            list.add(new MobileSuit("MSN-00100 百式"));
            list.add(new MobileSuit("MSZ-000 零式"));
            list.add(new MobileSuit("MSN-04 沙扎比"));
            list.add(new MobileSuit("MSN-04-02 夜莺"));
            list.add(new MobileSuit("MS-05 夏亚专用扎古I"));
            list.add(new MobileSuit("MS-06S 夏亚专用扎古II"));
            list.add(new MobileSuit("MS-06R-1A 夏亚专用高机动型扎古II"));
            list.add(new MobileSuit("RX-78/CA 卡斯巴尔专用高达"));
            list.add(new MobileSuit("MS-15S 夏亚专用强人"));
            list.add(new MobileSuit("AMA-00GR Zero GR"));
            list.add(new MobileSuit("MSN-02 完美吉翁号"));
            list.add(new MobileSuit("MS-06R-1A 黑色三连星专用高机动型扎古II"));
            list.add(new MobileSuit("MS-14U 勇士(宇宙型)"));
            list.add(new MobileSuit("RGM-79 吉姆"));
            list.add(new MobileSuit("MSK-008 夏亚专用迪杰"));
            list.add(new MobileSuit("MSK-008S 迪杰·特拉瓦西亚"));
        }else{
            list.add(new MobileSuit("RGM-79 吉姆"));
            list.add(new MobileSuit("RGM-179 吉姆II"));
            list.add(new MobileSuit("RGM-89 杰刚"));
        }

        return list;
    }
}
