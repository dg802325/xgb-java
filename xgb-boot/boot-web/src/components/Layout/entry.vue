<template>
  <div>
    <v-header />
    <router-view />
    <v-footer />
  </div>
</template>

<script>
import vHeader from '../Header/entry';
import vFooter from '../Footer/entry';
export default {
  components: {
    vHeader,
    vFooter
  }
}
</script>

<style>

</style>
