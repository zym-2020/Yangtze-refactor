<template>
  <div class="main">
    <div class="head"></div>
    <div class="body">
      <router-view />
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";
export default defineComponent({
  setup() {},
});
</script>

<style lang="scss" scoped>
.main {
  height: 100%;
  .head {
    height: 60px;
  }
  .body {
    height: calc(100% - 60px);
  }
}
</style>