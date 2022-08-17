<template>
  <layout />
</template>

<script lang="ts">
import { defineComponent } from "vue";
import Layout from "@/layout/Index.vue";
export default defineComponent({
  components: { Layout },
  setup() {},
});
</script>


<style lang="scss">
html,
body,
#app {
  height: 100%;
  width: 100%;
  padding: 0;
  margin: 0;
}
</style>
