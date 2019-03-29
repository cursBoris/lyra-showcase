<template>
    <div class="p1mussample">


        <b-form-textarea style="width:1150px;height:50px;"
                         id="context" v-model="context2" :rows="3" :max-rows="3">
        </b-form-textarea>


        <b-button-toolbar>
            <b-button-group>
                <b-button v-on:click="refresh442">ALL Refresh grid</b-button>
            </b-button-group>
        </b-button-toolbar>


        <lyra-grid
                formclass="ru.curs.demo.P1MusSample"
                instanceid="grid1"

                context='{"part1": "part1","part2": "part2","refreshParams": {"selectKey": "","sort": "id","filter": "filter conditions"}}'
        >
        </lyra-grid>


    </div>
</template>

<script>

    import {lyraGridEvents} from 'lyra-grid/LyraGrid'

    export default {

        components: {
            lyraGrid: () => import('lyra-grid/LyraGrid')
        },

        name: 'P1MusSample',

        data() {
            return {
                context2:
                    '{' +
                    '"part1": "part1",' +
                    '"part2": "part2",' +

                    '"refreshParams": {' +
                    //current
                    '"selectKey": [152594],' +
                    '"sort": "id",' +
                    '"filter": "filter conditions"' +
                    '}' +
                    '}',
            }
        },
        methods: {
            refresh442: function () {
                lyraGridEvents.$emit('refresh', 'ru.curs.demo.P1MusSample', 'grid1', this.context2);
                //event => this.$emit('refresh', 'ru.curs.demo.P1MusSample', 'grid1', this.context2)
            },
        }
    }

</script>

