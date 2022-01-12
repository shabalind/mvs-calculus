  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s6(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f60(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    s0 v4 = v0;
    const std::vector<std::vector<double>> v5 = v4.p1;
    v4.p1 = v5;
    v4.p1 = v5;
    v4.p0 = v6;
    v4.p1 = v5;
    v4.p0 = v6;
    v4.p0 = v6;
    const std::vector<double> v8 = v5[1];
    const std::vector<double> v3 = v5[1];
    v4.p1 = v5;
    v4.p0 = v6;
    std::vector<std::vector<double>> v1 = v5;
    v1[0] = v8;
    v1[1] = v3;
    v4.p0 = v6;
    s0 v12 = v4;
    const std::vector<std::vector<double>> v41 = v12.p1;
    v4.p1 = v1;
    const std::vector<double> v29 = v1[0];
    v1[1] = v29;
    s0 v39 = v12;
    const std::vector<std::vector<double>> v32 = v0.p0;
    v12 = v4;
    v4 = v12;
    v39.p0 = v32;
    v12.p1 = v41;
    return v39;
  }
  std::vector<std::vector<s6>> f38(const std::vector<std::vector<s6>> &v0) {
    std::vector<std::vector<s6>> v2 = v0;
    std::vector<std::vector<s6>> v4 = v2;
    const std::vector<std::vector<std::vector<s6>>> v3 { v2, v4, v2, v0, v4, v0, v4 };
    std::vector<std::vector<std::vector<s6>>> v7 = v3;
    const std::vector<std::vector<s6>> v55 = v7[3];
    v7[6] = v2;
    return v55;
  }
  s0 f18(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v3 = v4[1];
    const std::vector<double> v7 = v4[1];
    const s0 v8 = f60(v0);
    const std::vector<std::vector<double>> v13 = v0.p0;
    const std::vector<double> v9 = v5[0];
    std::vector<std::vector<double>> v14 = v13;
    v14[0] = v7;
    v14 = v5;
    v14[1] = v3;
    v14[0] = v3;
    v14[0] = v9;
    const s0 v55 = f60(v0);
    const std::vector<std::vector<double>> v27 = v55.p0;
    const s0 v50 = f60(v8);
    v14[2] = v3;
    s0 v179 = v50;
    v179.p0 = v27;
    v179.p0 = v14;
    v179.p1 = v4;
    return v179;
  }
  s6 f11(const s6 &v0) {
    const std::vector<s6> v8 { v0, v0, v0, v0, v0, v0 };
    const std::vector<std::vector<s6>> v10 { v8, v8, v8, v8, v8, v8, v8 };
    const std::vector<std::vector<std::vector<s6>>> v18 { v10, v10 };
    const std::vector<std::vector<s6>> v12 = v18[0];
    const std::vector<std::vector<s6>> v16 = v18[1];
    std::vector<std::vector<s6>> v72 = v16;
    v72[6] = v8;
    const std::vector<s6> v37 = v72[6];
    v72 = v16;
    std::vector<s6> v100 = v37;
    const std::vector<s6> v133 = v12[4];
    const s6 v146 = v133[5];
    std::vector<s6> v139 = v100;
    v139[0] = v146;
    const s6 v212 = v139[1];
    return v212;
  }
  __attribute__((noinline))
  double f0(const double &v0, const std::vector<std::vector<s6>> &v1) {
    std::vector<std::vector<s6>> v2 = v1;
    const std::vector<s6> v7 = v2[0];
    const std::vector<std::vector<s6>> v8 = f38(v2);
    v2[2] = v7;
    const std::vector<std::vector<s6>> v5 = f38(v8);
    std::vector<std::vector<s6>> v10 = v5;
    v10[2] = v7;
    const std::vector<s6> v11 = v5[2];
    std::vector<s6> v16 = v11;
    const std::vector<s6> v17 = v8[2];
    const std::vector<std::vector<s6>> v18 = f38(v10);
    std::vector<s6> v26 = v7;
    v2[2] = v11;
    v10 = v2;
    const s6 v24 = v7[0];
    v10[0] = v17;
    const std::vector<std::vector<s1>> v25 = v24.p0;
    s6 v59 = v24;
    v59.p0 = v25;
    const std::vector<s6> v21 = v18[0];
    const s6 v35 = f11(v59);
    const std::vector<std::vector<s1>> v30 = v59.p0;
    v59.p0 = v30;
    const std::vector<s1> v19 = v25[0];
    const s0 v20 = v35.p1;
    v59.p1 = v20;
    s6 v32 = v59;
    const std::vector<s1> v54 = v30[0];
    v59.p0 = v25;
    const s1 v58 = v54[0];
    const std::vector<s6> v50 { v59, v35, v32 };
    const s6 v49 = v50[2];
    v59.p0 = v25;
    v10[1] = v21;
    v2[1] = v16;
    v2[1] = v21;
    const s0 v61 = v58.p1;
    v26[0] = v49;
    v2[2] = v21;
    const std::vector<std::vector<double>> v62 = v20.p1;
    const s6 v64 = v50[1];
    const std::vector<double> v180 = v62[1];
    v59.p0 = v30;
    const s0 v43 = v58.p0;
    std::vector<s6> v72 = v21;
    const s0 v81 = v35.p1;
    v59.p1 = v20;
    v10[0] = v26;
    v59.p0 = v30;
    const s0 v38 = f18(v61);
    const s0 v84 = f60(v43);
    const std::vector<std::vector<s1>> v69 = v64.p0;
    const s0 v126 = f60(v84);
    v59.p1 = v81;
    v32.p1 = v20;
    v10[2] = v26;
    v10[0] = v21;
    const double v82 = v180[0];
    const s6 v113 = v72[0];
    v59.p1 = v38;
    v59.p0 = v69;
    std::vector<std::vector<s1>> v108 = v69;
    v108[0] = v19;
    const std::vector<s1> v75 = v30[0];
    const double v121 = v82 / v82;
    v10[1] = v11;
    v26[0] = v32;
    s6 v131 = v113;
    v72[0] = v24;
    v59.p0 = v108;
    const std::vector<std::vector<s1>> v192 = v131.p0;
    v108[0] = v75;
    v131.p1 = v126;
    v26[0] = v24;
    v59.p0 = v192;
    v16[0] = v35;
    v26[0] = v32;
    v131.p0 = v192;
    return v121;
  }
  int main() {
    double v0(0.0);
    std::vector<std::vector<s6>> v1({ { { { { { { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } } } } } }, { { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } }, { { { { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 } } } } } }, { { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 } } } } }, { { { { { { { { 31.0 }, { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 } } } } } }, { { { 41.0 }, { 42.0 }, { 43.0 } }, { { 44.0 }, { 45.0 } } } } } });
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
