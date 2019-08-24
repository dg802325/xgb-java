<template>
<el-dialog title="新增" width="30%" :visible.sync="addVisible" :before-close="closeEvent">
    <el-form ref="form"  label-width="100px">
        <el-form-item label="中文名称:" required>
            <el-input v-model="bbiContractChn" ></el-input>
        </el-form-item>
        <el-form-item label="英文名称:" required>
            <el-input v-model="bbiContractEng" ></el-input>
        </el-form-item>

    </el-form>
        <span slot="footer" class="dialog-footer">
            <el-button @click="closeEvent">取 消</el-button>
            <el-button type="primary" @click="saveBbiContract">确 定</el-button>
        </span>
</el-dialog>
</template>
<script>
    import {saveWharf} from 'api/bbiContract'

    export default {
        data () {
            return {
                wharfChn: '',
                wharfEng: '',
                seaportId:''
            }
        },
        props: {
            seaportItem: Array,
            addVisible: Boolean
        },
        methods: {
            closeEvent () {
                this.$emit('closeInsert')
            },
            async saveBbiContract () {
                let data = {
                    wharfChn: this.wharfChn,
                    wharfEng: this.wharfEng,
                    seaportId: this.seaportId
                };
                if(!this.wharfChn) {
                    this.$message({
                        showClose: true,
                        message: '请输入码头名称',
                        type: 'error'
                    });
                    return
                }
                if(!this.seaportId) {
                    this.$message({
                        showClose: true,
                        message: '请选择港口',
                        type: 'error'
                    });
                    return
                }
                let res = await saveBbiContract(data);
                if (res.isSuccess){
                    this.$message({
                        showClose: true,
                        message: res.content,
                        type: 'success'
                    });
                    this.$emit('addBbiContractSuccess')
                }
            }
        }
    }
</script>
