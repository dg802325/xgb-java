package com.xgb.service;

import com.xgb.dao.*;
import com.xgb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OldService {

    @Autowired
    private JjhNianjianDangjmesMapper jjhNianjianDangjmesMapper;
    @Autowired
    private JjhNjGmzcqkItemMapper jjhNjGmzcqkItemMapper;
    @Autowired
    private JjhnjJdglMapper jjhnjJdglMapper;
    @Autowired
    private JjhnjJgjslsjqkSubMapper jjhnjJgjslsjqkSubMapper;
    @Autowired
    private JjhnjJjhyglfjySubMapper jjhnjJjhyglfjySubMapper;
    @Autowired
    private JjhnjJshjdgltabMapper jjhnjJshjdgltabMapper;
    @Autowired
    private JjhNjReport1Mapper jjhNjReport1Mapper;
    @Autowired
    private JjhnjReport2Mapper jjhnjReport2Mapper;
    @Autowired
    private JjhnjReport3Mapper jjhnjReport3Mapper;
    @Autowired
    private JjhnjReport4Mapper jjhnjReport4Mapper;
    @Autowired
    private JjhNjReport6Mapper jjhNjReport6Mapper;
    @Autowired
    private JjhNjReportGqstqkItemMapper jjhNjReportGqstqkItemMapper;
    @Autowired
    private JjhnjReportThrMapper jjhnjReportThrMapper;
    @Autowired
    private JjhnjWtlcTest002Mapper jjhnjWtlcTest002Mapper;
    @Autowired
    private JjhnjYewhddaejzpageSubMapper jjhnjYewhddaejzpageSubMapper;
    @Autowired
    private JjhnjYfkxSubMapper jjhnjYfkxSubMapper;
    @Autowired
    private JjhnjYfzkjkhMapper jjhnjYfzkjkhMapper;
    @Autowired
    private JjhnjYskxjkhMapper jjhnjYskxjkhMapper;
    @Autowired
    private JjhnjYszkSubMapper jjhnjYszkSubMapper;
    @Autowired
    private JjhNjMlMapper jjhNjMlMapper;
    @Autowired
    private JjhnjJgjsljlqkMapper jjhnjJgjsljlqkMapper;
    @Autowired
    private JjhnjCsbaIndexMapper jjhnjCsbaIndexMapper;
    @Autowired
    private JjhnjYzhdqkMapper jjhnjYzhdqkMapper;
    @Autowired
    private JjhnjChengjishuomingSubMapper jjhnjChengjishuomingSubMapper;
    @Autowired
    private JjhnjXxgkMapper jjhnjXxgkMapper;
    @Autowired
    private JjhnjWtlcTest002SubMapper jjhnjWtlcTest002SubMapper;
    @Autowired
    private JjhNjReportZxqkItemMapper jjhNjReportZxqkItemMapper;
    @Autowired
    private JjhNjCsxtMapper jjhNjCsxtMapper;
    @Autowired
    private JjhNjZbCsxtMapper jjhNjZbCsxtMapper;
    @Autowired
    private JjhnjZhdgyxmdezhfdxSubMapper jjhnjZhdgyxmdezhfdxSubMapper;
    @Autowired
    private JjhnjZhdgyhdshzSubMapper jjhnjZhdgyhdshzSubMapper;
    @Autowired
    private JjhnjYzhdqkSubMapper jjhnjYzhdqkSubMapper;
    @Autowired
    private JjhnjGyhdmxMapper jjhnjGyhdmxMapper;
    @Autowired
    private JjhnjJshjdglSubMapper jjhnjJshjdglSubMapper;
    @Autowired
    private LsCircsMapper lsCircsMapper;
    @Autowired
    private LshCircsMapper lshCircsMapper;
    @Autowired
    private LshGzryMapper lshGzryMapper;
    @Autowired
    private Stnianjianreport9Mapper stnianjianreport9Mapper;
    @Autowired
    private Stnianjianreport9SubMapper stnianjianreport9SubMapper;
    @Autowired
    private StNjInner4Mapper stNjInner4Mapper;
    @Autowired
    private JjhnjGyhdmxSubMapper jjhnjGyhdmxSubMapper;
    @Autowired
    private JjhnjGlfgxjjySubMapper jjhnjGlfgxjjySubMapper;
    @Autowired
    private JjhNjReportQtnsjgItemMapper jjhNjReportQtnsjgItemMapper;
    @Autowired
    private SNianjianBranchMapper sNianjianBranchMapper;
    @Autowired
    private StNjQgothercase19SubMapper stNjQgothercase19SubMapper;

    public List<StNjQgothercase19Sub> selectByExample(StNjQgothercase19SubExample example){
        return stNjQgothercase19SubMapper.selectByExample(example);
    }

    public List<SNianjianBranch> selectByExample(SNianjianBranchExample example){
        return sNianjianBranchMapper.selectByExample(example);
    }

    public List<JjhNjReportQtnsjgItem> selectByExample(JjhNjReportQtnsjgItemExample example){
        return jjhNjReportQtnsjgItemMapper.selectByExample(example);
    }

    public List<JjhnjGlfgxjjySub> selectByExample(JjhnjGlfgxjjySubExample example){
        return jjhnjGlfgxjjySubMapper.selectByExample(example);
    }

    public List<JjhnjGyhdmxSub> selectByExample(JjhnjGyhdmxSubExample example){
        return jjhnjGyhdmxSubMapper.selectByExample(example);
    }

    public List<StNjInner4> selectByExample(StNjInner4Example example){
        return stNjInner4Mapper.selectByExample(example);
    }

    public List<Stnianjianreport9Sub> selectByExample(Stnianjianreport9SubExample example){
        return stnianjianreport9SubMapper.selectByExample(example);
    }

    public List<Stnianjianreport9> selectByExample(Stnianjianreport9Example example){
        return stnianjianreport9Mapper.selectByExample(example);
    }

    public List<LshGzry> selectByExample(LshGzryExample example){
        return lshGzryMapper.selectByExample(example);
    }

    public List<LshCircs> selectByExample(LshCircsExample example){
        return lshCircsMapper.selectByExample(example);
    }

    public List<LsCircs> selectByExample(LsCircsExample example){
        return lsCircsMapper.selectByExample(example);
    }

    public List<JjhnjJshjdglSub> selectByExample(JjhnjJshjdglSubExample example){
        return jjhnjJshjdglSubMapper.selectByExample(example);
    }

    public List<JjhnjGyhdmx> selectByExample(JjhnjGyhdmxExample example){
        return jjhnjGyhdmxMapper.selectByExample(example);
    }

    public List<JjhnjYzhdqkSub> selectByExample(JjhnjYzhdqkSubExample example){
        return jjhnjYzhdqkSubMapper.selectByExample(example);
    }

    public List<JjhnjZhdgyhdshzSub> selectByExample(JjhnjZhdgyhdshzSubExample example){
        return jjhnjZhdgyhdshzSubMapper.selectByExample(example);
    }

    public List<JjhnjZhdgyxmdezhfdxSub> selectByExample(JjhnjZhdgyxmdezhfdxSubExample example){
        return jjhnjZhdgyxmdezhfdxSubMapper.selectByExample(example);
    }

    public List<JjhNjZbCsxt> selectByExample(JjhNjZbCsxtExample example){
        return jjhNjZbCsxtMapper.selectByExample(example);
    }

    public List<JjhNjCsxt> selectByExample(JjhNjCsxtExample example){
        return jjhNjCsxtMapper.selectByExample(example);
    }

    public List<JjhNjReportZxqkItem> selectByExample(JjhNjReportZxqkItemExample example){
        return jjhNjReportZxqkItemMapper.selectByExample(example);
    }

    public List<JjhnjWtlcTest002Sub> selectByExample(JjhnjWtlcTest002SubExample example){
        return jjhnjWtlcTest002SubMapper.selectByExample(example);
    }

    public List<JjhnjXxgk> selectByExample(JjhnjXxgkExample example){
        return jjhnjXxgkMapper.selectByExample(example);
    }

    public List<JjhnjChengjishuomingSub> selectByExample(JjhnjChengjishuomingSubExample example){
        return jjhnjChengjishuomingSubMapper.selectByExample(example);
    }

    public List<JjhnjYzhdqk> selectByExample(JjhnjYzhdqkExample example){
        return jjhnjYzhdqkMapper.selectByExample(example);
    }

    public List<JjhnjCsbaIndex> selectByExample(JjhnjCsbaIndexExample example){
        return jjhnjCsbaIndexMapper.selectByExample(example);
    }

    public List<JjhnjJgjsljlqk> selectByExample(JjhnjJgjsljlqkExample example){
        return jjhnjJgjsljlqkMapper.selectByExample(example);
    }

    public List<JjhNjMl> selectByExample(JjhNjMlExample example){
        return jjhNjMlMapper.selectByExample(example);
    }

    public List<JjhnjYszkSub> selectByExample(JjhnjYszkSubExample example){
        return jjhnjYszkSubMapper.selectByExample(example);
    }

    public List<JjhnjYskxjkh> selectByExample(JjhnjYskxjkhExample example){
        return jjhnjYskxjkhMapper.selectByExample(example);
    }

    public List<JjhnjYfzkjkh> selectByExample(JjhnjYfzkjkhExample example){
        return jjhnjYfzkjkhMapper.selectByExample(example);
    }

    public List<JjhnjYfkxSub> selectByExample(JjhnjYfkxSubExample example){
        return jjhnjYfkxSubMapper.selectByExample(example);
    }

    public List<JjhnjYewhddaejzpageSub> selectByExample(JjhnjYewhddaejzpageSubExample example){
        return jjhnjYewhddaejzpageSubMapper.selectByExample(example);
    }

    public List<JjhnjWtlcTest002> selectByExample(JjhnjWtlcTest002Example example){
        return jjhnjWtlcTest002Mapper.selectByExample(example);
    }

    public List<JjhnjReportThr> selectByExample(JjhnjReportThrExample example){
        return jjhnjReportThrMapper.selectByExample(example);
    }

    public List<JjhNjReportGqstqkItem> selectByExample(JjhNjReportGqstqkItemExample example){
        return jjhNjReportGqstqkItemMapper.selectByExample(example);
    }

    public List<JjhNianjianDangjmes> selectByExample(JjhNianjianDangjmesExample example){
        return jjhNianjianDangjmesMapper.selectByExample(example);
    }
    public List<JjhNjGmzcqkItem> selectByExample(JjhNjGmzcqkItemExample example){
        return jjhNjGmzcqkItemMapper.selectByExample(example);
    }
    public List<JjhnjJdgl> selectByExample(JjhnjJdglExample example){
        return jjhnjJdglMapper.selectByExample(example);
    }
    public List<JjhnjJgjslsjqkSub> selectByExample(JjhnjJgjslsjqkSubExample example){
        return jjhnjJgjslsjqkSubMapper.selectByExample(example);
    }
    public List<JjhnjJjhyglfjySub> selectByExample(JjhnjJjhyglfjySubExample example){
        return jjhnjJjhyglfjySubMapper.selectByExample(example);
    }
    public List<JjhnjJshjdgltab> selectByExample(JjhnjJshjdgltabExample example){
        return jjhnjJshjdgltabMapper.selectByExample(example);
    }
    public List<JjhNjReport1> selectByExample(JjhNjReport1Example example){
        return jjhNjReport1Mapper.selectByExample(example);
    }
    public List<JjhnjReport2> selectByExample(JjhnjReport2Example example){
        return jjhnjReport2Mapper.selectByExample(example);
    }
    public List<JjhnjReport3> selectByExample(JjhnjReport3Example example){
        return jjhnjReport3Mapper.selectByExample(example);
    }
    public List<JjhnjReport4> selectByExample(JjhnjReport4Example example){
        return jjhnjReport4Mapper.selectByExample(example);
    }
    public List<JjhNjReport6> selectByExample(JjhNjReport6Example example){
        return jjhNjReport6Mapper.selectByExample(example);
    }
}
