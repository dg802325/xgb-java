package com.xgb.service;


import com.xgb.dao.*;
import com.xgb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly=true)
public class OldService {

    @Autowired
    private StNjReport3Mapper stNjReport3Mapper;
    @Autowired
    private MjzzUserMapper mjzzUserMapper;
    @Autowired
    private JjhnjGyhdmxMapper jjhnjGyhdmxMapper;
    @Autowired
    private JjhnjGyhdmxSubMapper jjhnjGyhdmxSubMapper;
    @Autowired
    private JjhnjReport3Mapper jjhnjReport3Mapper;
    @Autowired
    private JjhnjReport4Mapper jjhnjReport4Mapper;
    @Autowired
    private JjhNjReport6Mapper jjhNjReport6Mapper;
    @Autowired
    private MfGwyJzTbMapper mfGwyJzTbMapper;
    @Autowired
    private MfGwyjzZbMapper mfGwyjzZbMapper;
    @Autowired
    private NjGwyjzSubMapper njGwyjzSubMapper;
    @Autowired
    private NjGwyjzTbMapper njGwyjzTbMapper;
    @Autowired
    private StDjqk4Mapper stDjqk4Mapper;
    @Autowired
    private StNjAdministratCostInxMapper stNjAdministratCostInxMapper;
    @Autowired
    private StNjAdministratCostMapper stNjAdministratCostMapper;
    @Autowired
    private StNjAppraiseCostInxMapper stNjAppraiseCostInxMapper;
    @Autowired
    private StNjAppraiseCostMapper stNjAppraiseCostMapper;
    @Autowired
    private StNjCgfwMapper stNjCgfwMapper;
    @Autowired
    private StNjGjhyMapper stNjGjhyMapper;
    @Autowired
    private StNjGyhdzcMapper stNjGyhdzcMapper;
    @Autowired
    private StNjGyhdzcSubMapper stNjGyhdzcSubMapper;
    @Autowired
    private StNjJbgyhdMapper stNjJbgyhdMapper;
    @Autowired
    private StNjJbgyhdSubMapper stNjJbgyhdSubMapper;
    @Autowired
    private StNjJieshoujianduMapper stNjJieshoujianduMapper;
    @Autowired
    private StNjQgadviseMapper stNjQgadviseMapper;
    @Autowired
    private StNjReport11Mapper stNjReport11Mapper;
    @Autowired
    private StNjReport11Sub1Mapper stNjReport11Sub1Mapper;
    @Autowired
    private StNjReport13SubMapper stNjReport13SubMapper;
    @Autowired
    private StNjReport14SubMapper stNjReport14SubMapper;
    @Autowired
    private StNjReport16Mapper stNjReport16Mapper;
    @Autowired
    private StNjReport16Sub1Mapper stNjReport16Sub1Mapper;
    @Autowired
    private StNjReport16Sub2Mapper stNjReport16Sub2Mapper;
    @Autowired
    private StNjReport17Sub1Mapper stNjReport17Sub1Mapper;
    @Autowired
    private StNjReport17Sub2Mapper stNjReport17Sub2Mapper;
    @Autowired
    private StNjReprot13Mapper stNjReprot13Mapper;
    @Autowired
    private StNjReprot14Mapper stNjReprot14Mapper;
    @Autowired
    private StNjReprot140Mapper stNjReprot140Mapper;
    @Autowired
    private StNjReprot140SubMapper stNjReprot140SubMapper;
    @Autowired
    private StNjServiceCostInxMapper stNjServiceCostInxMapper;
    @Autowired
    private StNjServiceCostMapper stNjServiceCostMapper;
    @Autowired
    private StnjSfqkJyfwMapper stnjSfqkJyfwMapper;
    @Autowired
    private StnjSfqkJyfwSubMapper stnjSfqkJyfwSubMapper;
    @Autowired
    private StnjYwhdSubMapper stnjYwhdSubMapper;
    @Autowired
    private StnjYwhdTbMapper stnjYwhdTbMapper;
    @Autowired
    private FormConsultationCaseMapper formConsultationCaseMapper;
    @Autowired
    private StNjInner4Mapper stNjInner4Mapper;
    @Autowired
    private StNjReport15Mapper stNjReport15Mapper;
    @Autowired
    private StNjGyhdtjMapper stNjGyhdtjMapper;
    @Autowired
    private StNjGzjhSubMapper stNjGzjhSubMapper;
    @Autowired
    private StNjHfgxTbMapper stNjHfgxTbMapper;
    @Autowired
    private MfNianjianJbxxMapper mfNianjianJbxxMapper;
    @Autowired
    private StNijianReport13Mapper stNijianReport13Mapper;
    @Autowired
    private StNjQgothercase19SubMapper stNjQgothercase19SubMapper;
    @Autowired
    private LsCybaZbMapper lsCybaZbMapper;
    @Autowired
    private SjzdNodeMapper sjzdNodeMapper;
    @Autowired
    private MjzzDictionaryMapper mjzzDictionaryMapper;

    public List<MjzzDictionary> selectByExample(MjzzDictionaryExample example){ return mjzzDictionaryMapper.selectByExample(example); }

    public List<SjzdNode> selectByExample(SjzdNodeExample example){ return sjzdNodeMapper.selectByExample(example); }

    public List<LsCybaZb> selectByExample(LsCybaZbExample example){ return lsCybaZbMapper.selectByExample(example); }

    public List<StNjQgothercase19Sub> selectByExample(StNjQgothercase19SubExample example){ return stNjQgothercase19SubMapper.selectByExample(example); }

    public List<StNijianReport13> selectByExample(StNijianReport13Example example){ return stNijianReport13Mapper.selectByExample(example); }

    public List<MfNianjianJbxx> selectByExample(MfNianjianJbxxExample example){ return mfNianjianJbxxMapper.selectByExample(example); }

    public List<StNjHfgxTb> selectByExample(StNjHfgxTbExample example){ return stNjHfgxTbMapper.selectByExample(example); }

    public List<StNjGzjhSub> selectByExample(StNjGzjhSubExample example){ return stNjGzjhSubMapper.selectByExample(example); }

    public List<StNjGyhdtj> selectByExample(StNjGyhdtjExample example){ return stNjGyhdtjMapper.selectByExample(example); }

    public List<StNjReport15> selectByExample(StNjReport15Example example){ return stNjReport15Mapper.selectByExample(example); }

    public List<StNjInner4> selectByExample(StNjInner4Example example){ return stNjInner4Mapper.selectByExample(example); }

    public List<StNjReport3> selectByExample(StNjReport3Example example){ return stNjReport3Mapper.selectByExample(example); }

    public List<MjzzUser> selectByExample(MjzzUserExample example){
        return mjzzUserMapper.selectByExample(example);
    }

    public List<JjhnjGyhdmx> selectByExample(JjhnjGyhdmxExample example){
        return jjhnjGyhdmxMapper.selectByExample(example);
    }

    public List<JjhnjGyhdmxSub> selectByExample(JjhnjGyhdmxSubExample example){
        return jjhnjGyhdmxSubMapper.selectByExample(example);
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

    public List<MfGwyJzTb> selectByExample(MfGwyJzTbExample example){
        return mfGwyJzTbMapper.selectByExample(example);
    }

    public List<MfGwyjzZb> selectByExample(MfGwyjzZbExample example){
        return mfGwyjzZbMapper.selectByExample(example);
    }

    public List<NjGwyjzSub> selectByExample(NjGwyjzSubExample example){
        return njGwyjzSubMapper.selectByExample(example);
    }

    public List<NjGwyjzTb> selectByExample(NjGwyjzTbExample example){
        return njGwyjzTbMapper.selectByExample(example);
    }

    public List<StNjAdministratCostInx> selectByExample(StNjAdministratCostInxExample example){
        return stNjAdministratCostInxMapper.selectByExample(example);
    }

    public List<StNjAdministratCost> selectByExample(StNjAdministratCostExample example){
        return stNjAdministratCostMapper.selectByExample(example);
    }

    public List<StNjAppraiseCostInx> selectByExample(StNjAppraiseCostInxExample example){
        return stNjAppraiseCostInxMapper.selectByExample(example);
    }

    public List<StNjAppraiseCost> selectByExample(StNjAppraiseCostExample example){
        return stNjAppraiseCostMapper.selectByExample(example);
    }

    public List<StNjCgfw> selectByExample(StNjCgfwExample example){
        return stNjCgfwMapper.selectByExample(example);
    }

    public List<StNjGjhy> selectByExample(StNjGjhyExample example){
        return stNjGjhyMapper.selectByExample(example);
    }

    public List<StNjGyhdzc> selectByExample(StNjGyhdzcExample example){
        return stNjGyhdzcMapper.selectByExample(example);
    }

    public List<StNjGyhdzcSub> selectByExample(StNjGyhdzcSubExample example){
        return stNjGyhdzcSubMapper.selectByExample(example);
    }

    public List<StNjJbgyhd> selectByExample(StNjJbgyhdExample example){
        return stNjJbgyhdMapper.selectByExample(example);
    }

    public List<StNjJbgyhdSub> selectByExample(StNjJbgyhdSubExample example){
        return stNjJbgyhdSubMapper.selectByExample(example);
    }

    public List<StNjJieshoujiandu> selectByExample(StNjJieshoujianduExample example){
        return stNjJieshoujianduMapper.selectByExample(example);
    }

    public List<StNjQgadvise> selectByExample(StNjQgadviseExample example){
        return stNjQgadviseMapper.selectByExample(example);
    }

    public List<StNjReport11> selectByExample(StNjReport11Example example){
        return stNjReport11Mapper.selectByExample(example);
    }

    public List<StNjReport11Sub1> selectByExample(StNjReport11Sub1Example example){
        return stNjReport11Sub1Mapper.selectByExample(example);
    }

    public List<StNjReport13Sub> selectByExample(StNjReport13SubExample example){
        return stNjReport13SubMapper.selectByExample(example);
    }

    public List<StNjReport14Sub> selectByExample(StNjReport14SubExample example){
        return stNjReport14SubMapper.selectByExample(example);
    }

    public List<StNjReport16> selectByExample(StNjReport16Example example){
        return stNjReport16Mapper.selectByExample(example);
    }

    public List<StNjReport16Sub1> selectByExample(StNjReport16Sub1Example example){
        return stNjReport16Sub1Mapper.selectByExample(example);
    }

    public List<StNjReport16Sub2> selectByExample(StNjReport16Sub2Example example){
        return stNjReport16Sub2Mapper.selectByExample(example);
    }

    public List<StNjReport17Sub1> selectByExample(StNjReport17Sub1Example example){
        return stNjReport17Sub1Mapper.selectByExample(example);
    }

    public List<StNjReport17Sub2> selectByExample(StNjReport17Sub2Example example){
        return stNjReport17Sub2Mapper.selectByExample(example);
    }

    public List<StNjReprot13> selectByExample(StNjReprot13Example example){
        return stNjReprot13Mapper.selectByExample(example);
    }

    public List<StNjReprot14> selectByExample(StNjReprot14Example example){
        return stNjReprot14Mapper.selectByExample(example);
    }

    public List<StNjReprot140> selectByExample(StNjReprot140Example example){
        return stNjReprot140Mapper.selectByExample(example);
    }

    public List<StNjReprot140Sub> selectByExample(StNjReprot140SubExample example){
        return stNjReprot140SubMapper.selectByExample(example);
    }

    public List<StNjServiceCostInx> selectByExample(StNjServiceCostInxExample example){
        return stNjServiceCostInxMapper.selectByExample(example);
    }

    public List<StNjServiceCost> selectByExample(StNjServiceCostExample example){
        return stNjServiceCostMapper.selectByExample(example);
    }

    public List<StnjSfqkJyfw> selectByExample(StnjSfqkJyfwExample example){
        return stnjSfqkJyfwMapper.selectByExample(example);
    }

    public List<StnjSfqkJyfwSub> selectByExample(StnjSfqkJyfwSubExample example){
        return stnjSfqkJyfwSubMapper.selectByExample(example);
    }

    public List<StnjYwhdSub> selectByExample(StnjYwhdSubExample example){
        return stnjYwhdSubMapper.selectByExample(example);
    }

    public List<StnjYwhdTb> selectByExample(StnjYwhdTbExample example){
        return stnjYwhdTbMapper.selectByExample(example);
    }

    public List<FormConsultationCase> selectByExample(FormConsultationCaseExample example){
        return formConsultationCaseMapper.selectByExample(example);
    }

    public List<StDjqk4> selectByExample(StDjqk4Example example){
        return stDjqk4Mapper.selectByExample(example);
    }
}
