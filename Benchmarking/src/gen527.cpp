  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    std::vector<std::vector<s0>> p2;
    s0 p3;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1, std::vector<std::vector<s0>> v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  s0 f106(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    s0 v2 = v0;
    v2.p0 = v7;
    v2.p0 = v7;
    return v2;
  }
  s0 f103(const std::vector<s0> &v0, const s0 &v1) {
    const std::vector<std::vector<s0>> v7 { v0, v0, v0, v0, v0 };
    const std::vector<s0> v5 = v7[2];
    std::vector<std::vector<s0>> v59 = v7;
    const std::vector<s0> v74 = v59[1];
    v59 = v7;
    v59[1] = v5;
    const s0 v126 = v74[0];
    return v126;
  }
  s0 f98(const s0 &v0, const std::vector<s0> &v1) {
    s0 v5 = v0;
    const s0 v7 = f106(v5);
    const s0 v3 = v1[0];
    std::vector<s0> v6 = v1;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const s0 v9 = v6[0];
    std::vector<std::vector<double>> v15 = v11;
    v5.p0 = v15;
    v5.p0 = v15;
    const s0 v14 = v6[0];
    const std::vector<double> v16 = v11[2];
    const std::vector<s0> v21 { v3, v5, v0, v9, v7, v14, v7 };
    v15[1] = v16;
    const s0 v25 = v21[3];
    return v25;
  }
  s0 f96(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const s0 v4 = f106(v0);
    const std::vector<std::vector<double>> v3 = v5.p0;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const s0 v16 = f106(v4);
    const s0 v18 = f106(v4);
    v5.p0 = v7;
    const std::vector<std::vector<double>> v20 = v16.p1;
    const std::vector<std::vector<double>> v13 = v18.p1;
    v5.p0 = v3;
    v5.p1 = v20;
    const std::vector<std::vector<double>> v14 = v5.p1;
    v5.p0 = v2;
    const std::vector<std::vector<double>> v33 = v5.p1;
    v5.p1 = v14;
    const s0 v27(v3, v13);
    v5.p1 = v13;
    v5.p1 = v33;
    const std::vector<std::vector<double>> v108 = v4.p1;
    s0 v40 = v27;
    v40.p1 = v108;
    std::vector<std::vector<double>> v114 = v20;
    v40.p1 = v114;
    return v40;
  }
  s0 f93(const s0 &v0) {
    const s0 v3 = f106(v0);
    const s0 v1 = f106(v0);
    const std::vector<std::vector<double>> v6 = v1.p0;
    std::vector<std::vector<double>> v8 = v6;
    const std::vector<double> v11 = v6[1];
    const s0 v10 = f106(v3);
    const std::vector<std::vector<double>> v12 = v0.p1;
    s0 v26 = v1;
    v26.p0 = v8;
    v8[0] = v11;
    const std::vector<std::vector<double>> v14 = v3.p0;
    const std::vector<std::vector<double>> v22 = v10.p0;
    std::vector<std::vector<double>> v24 = v12;
    const s0 v19 = f96(v26);
    v26.p0 = v22;
    v26.p0 = v6;
    v26.p1 = v24;
    v26.p0 = v14;
    return v19;
  }
  s0 f83(const s0 &v0) {
    const s0 v7 = f106(v0);
    const std::vector<std::vector<double>> v6 = v0.p1;
    s0 v1 = v7;
    v1.p1 = v6;
    const s0 v3 = f96(v0);
    const s0 v35 = f96(v0);
    const std::vector<std::vector<double>> v14 = v0.p0;
    const s0 v31 = f106(v35);
    const std::vector<std::vector<double>> v42 = v31.p1;
    const s0 v50 = f96(v1);
    v1.p1 = v42;
    v1.p0 = v14;
    const s0 v129 = f106(v50);
    const std::vector<s0> v66 { v129, v50, v31, v3, v31 };
    const s0 v59 = v66[3];
    const s0 v151 = f96(v59);
    return v151;
  }
  s0 f78(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const s0 v7 = f83(v0);
    const std::vector<s0> v4 { v0 };
    s0 v2 = v7;
    const s0 v9 = f103(v4, v0);
    v2.p0 = v3;
    const s0 v5 = f93(v7);
    v2.p0 = v3;
    s0 v17 = v0;
    const s0 v14 = v4[0];
    const s0 v18 = f96(v7);
    std::vector<std::vector<double>> v13 = v3;
    const s0 v21 = f83(v5);
    v2.p0 = v13;
    const std::vector<std::vector<double>> v30 = v21.p1;
    const std::vector<double> v20 = v13[0];
    const s0 v22 = f83(v17);
    const s0 v25 = f98(v0, v4);
    const std::vector<std::vector<double>> v19 = v18.p1;
    const s0 v42 = f103(v4, v14);
    const std::vector<s0> v28 { v2, v22, v25, v9 };
    v17.p1 = v19;
    const std::vector<std::vector<double>> v58 = v42.p1;
    const std::vector<std::vector<double>> v60 = v18.p0;
    const s0 v64 = v4[0];
    const std::vector<std::vector<double>> v35 = v21.p0;
    std::vector<s0> v38 = v28;
    v2 = v64;
    v2 = v22;
    v13[1] = v20;
    v17.p0 = v60;
    v17.p0 = v35;
    const s0 v161 = v38[0];
    v17.p1 = v58;
    v2.p1 = v30;
    return v161;
  }
  s0 f10(const s0 &v0, const std::vector<s0> &v1) {
    const s0 v4 = v1[0];
    const std::vector<std::vector<double>> v3 = v4.p1;
    const std::vector<std::vector<double>> v10 = v0.p0;
    std::vector<std::vector<double>> v2 = v10;
    s0 v11 = v4;
    const std::vector<std::vector<double>> v9 = v11.p1;
    const std::vector<double> v19 = v3[1];
    std::vector<std::vector<double>> v20 = v10;
    const std::vector<std::vector<double>> v17 = v0.p0;
    v2[0] = v19;
    const std::vector<double> v23 = v17[2];
    const s0 v37(v10, v9);
    v11.p0 = v2;
    v11.p0 = v20;
    v11.p0 = v10;
    v20[1] = v23;
    return v37;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v5 = v0.p1;
    std::vector<s0> v8 = v5;
    const s0 v2 = v5[0];
    v8[1] = v2;
    const std::vector<std::vector<double>> v3 = v2.p1;
    const std::vector<std::vector<double>> v13 = v2.p0;
    std::vector<std::vector<double>> v4 = v13;
    const std::vector<double> v7 = v3[1];
    const s0 v12(v4, v3);
    v4[1] = v7;
    v8[0] = v12;
    const s0 v22 = f96(v2);
    const s0 v18 = f10(v12, v5);
    const s0 v42 = v8[1];
    v8[0] = v18;
    const s0 v41 = f78(v22);
    const std::vector<std::vector<double>> v32 = v42.p0;
    const std::vector<std::vector<double>> v34 = v41.p1;
    const std::vector<double> v64 = v32[2];
    const std::vector<std::vector<double>> v47 { v7, v7, v7, v64, v64 };
    const std::vector<double> v73 = v47[1];
    std::vector<std::vector<double>> v54 = v47;
    const std::vector<double> v130 = v54[2];
    v4[0] = v73;
    std::vector<double> v161 = v130;
    const std::vector<double> v78 = v34[1];
    const double v144 = v161[0];
    v54[0] = v78;
    return v144;
  }
  int main() {
    s1 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } });
    double v1(40.0);
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
