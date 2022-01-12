  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f60(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p0;
    s0 v5 = v0;
    v5.p0 = v4;
    const std::vector<std::vector<double>> v6 = v5.p1;
    const std::vector<std::vector<double>> v1 = v5.p1;
    s0 v22 = v5;
    v5.p0 = v2;
    s0 v29 = v22;
    const std::vector<std::vector<double>> v31 = v5.p1;
    v5.p1 = v31;
    s0 v16 = v29;
    v22.p1 = v1;
    v16.p1 = v6;
    return v16;
  }
  s0 f59(const std::vector<double> &v0, const s0 &v1) {
    s0 v5 = v1;
    const double v4 = v0[0];
    const s0 v6 = f60(v1);
    std::vector<double> v2 = v0;
    v2[0] = v4;
    v5 = v6;
    const s0 v10 = f60(v1);
    const std::vector<std::vector<double>> v9 = v1.p0;
    const s0 v8 = f60(v1);
    const std::vector<std::vector<double>> v13 = v1.p0;
    const std::vector<std::vector<double>> v15 = v8.p0;
    std::vector<std::vector<double>> v21 = v15;
    v5.p0 = v13;
    v2[0] = v4;
    const s0 v12 = f60(v10);
    const double v14 = v0[0];
    std::vector<double> v11 = v2;
    const s0 v22 = f60(v6);
    const std::vector<std::vector<double>> v24 = v22.p1;
    const s0 v32 = f60(v5);
    const std::vector<double> v31 { v14, v14, v4, v14, v14 };
    const std::vector<std::vector<double>> v26 = v22.p1;
    std::vector<std::vector<double>> v41 = v24;
    const double v55 = v31[2];
    const s0 v19 = f60(v32);
    const s0 v25 = f60(v12);
    v2[0] = v4;
    const std::vector<std::vector<double>> v47 = v32.p0;
    v5.p0 = v13;
    const std::vector<std::vector<double>> v59 = v25.p1;
    std::vector<std::vector<double>> v106 = v26;
    const s0 v37 = f60(v32);
    std::vector<std::vector<double>> v50 = v24;
    const s0 v45(v9, v106);
    const std::vector<std::vector<double>> v68 = v37.p0;
    v5.p1 = v41;
    v106[0] = v2;
    std::vector<std::vector<double>> v56 = v15;
    const std::vector<double> v125 = v26[0];
    v56[1] = v2;
    v5.p0 = v56;
    std::vector<std::vector<double>> v96 = v21;
    const std::vector<double> v116 = v59[0];
    v50[0] = v116;
    const std::vector<double> v63 = v68[0];
    v5 = v19;
    v5.p1 = v24;
    v11[0] = v55;
    v21[1] = v116;
    v5.p0 = v47;
    const std::vector<double> v79 = v96[1];
    v41[0] = v11;
    v96[1] = v63;
    std::vector<double> v61 = v0;
    v50[0] = v0;
    v106[0] = v79;
    v5.p1 = v41;
    v5.p1 = v50;
    v56[0] = v125;
    v106[0] = v11;
    v96[1] = v2;
    v2 = v61;
    return v45;
  }
  s0 f52(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v0.p0;
    s0 v8 = v7;
    v7.p0 = v3;
    std::vector<std::vector<double>> v1 = v3;
    s0 v2 = v0;
    std::vector<std::vector<double>> v11 = v1;
    const std::vector<std::vector<double>> v4 = v8.p0;
    const std::vector<double> v23 = v4[0];
    const double v13 = v23[0];
    const std::vector<std::vector<double>> v38 = v0.p0;
    const s0 v41 = f60(v7);
    const std::vector<double> v17 = v1[0];
    double v16 = v13;
    const s0 v49 = f59(v23, v2);
    v2.p0 = v3;
    v8.p0 = v11;
    const std::vector<std::vector<double>> v27 = v0.p1;
    std::vector<double> v24 = v17;
    v2.p1 = v27;
    v24[0] = v16;
    const s0 v50 = f59(v24, v49);
    const s0 v42 = f60(v41);
    v2.p0 = v38;
    v8 = v42;
    return v50;
  }
  s0 f22(const s0 &v0) {
    const s0 v4 = f60(v0);
    const s0 v1 = f52(v4);
    const s0 v11 = f60(v4);
    const std::vector<std::vector<double>> v3 = v11.p1;
    const std::vector<double> v16 = v3[0];
    const s0 v28 = f59(v16, v1);
    return v28;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s1 &v1, const s0 &v2, const std::vector<s0> &v3, const double &v4) {
    const s0 v23 = v3[1];
    const s0 v77 = f22(v23);
    const std::vector<std::vector<double>> v73 = v77.p1;
    const std::vector<double> v132 = v73[0];
    const double v66 = v132[0];
    return v66;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } });
    s1 v1({ { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } });
    s0 v2({ { { 36.0 }, { 37.0 } }, { { 38.0 } } });
    std::vector<s0> v3({ { { { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } });
    double v4(45.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
