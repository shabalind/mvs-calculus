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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s3 p0;
    s2 p1;
    s7(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    std::vector<s7> p1;
    s8(s0 v0, std::vector<s7> v1): p0(v0), p1(v1) { }
  };
  double f86(const double &v0) {
    double v1 = v0;
    double v8 = v0;
    double v2 = v1;
    double v5 = v0;
    double v7 = v2;
    double v4 = v2;
    double v6 = v0;
    const double v3 = v8 / v8;
    v2 = v4;
    double v9 = v7;
    double v11 = v9;
    double v33 = v5;
    double v13 = v3;
    double v12 = v8;
    double v16 = v33;
    double v39 = v12;
    const std::vector<double> v29 { v7 };
    const double v10 = v29[0];
    const double v18 = v29[0];
    std::vector<double> v15 = v29;
    const double v21 = v15[0];
    const double v17 = v15[0];
    double v32 = v21;
    std::vector<double> v61 = v29;
    std::vector<double> v26 = v61;
    v15[0] = v2;
    v15[0] = v9;
    const double v28 = v29[0];
    double v27 = v17;
    v26[0] = v2;
    v15[0] = v13;
    const double v84 = v26[0];
    std::vector<double> v69 = v15;
    std::vector<double> v31 = v69;
    double v46 = v39;
    v31[0] = v4;
    const double v54 = v15[0];
    const double v35 = v31[0];
    v26[0] = v32;
    v26[0] = v13;
    const double v90 = v61[0];
    v69[0] = v18;
    const double v119 = v84 / v54;
    const double v42 = v10 - v54;
    const double v44 = v61[0];
    v61[0] = v28;
    std::vector<double> v50 = v69;
    v26[0] = v16;
    const double v71 = v26[0];
    v15[0] = v6;
    std::vector<double> v66 = v50;
    std::vector<double> v68 = v61;
    v39 = v27;
    v66[0] = v11;
    const double v128 = v50[0];
    v15[0] = v21;
    const std::vector<double> v41 { v46, v90, v119, v42, v44, v6 };
    v15[0] = v35;
    v15[0] = v128;
    const std::vector<std::vector<double>> v108 { v41, v41 };
    v66[0] = v128;
    std::vector<std::vector<double>> v96 = v108;
    std::vector<std::vector<double>> v278 = v96;
    v61 = v68;
    std::vector<double> v109 = v41;
    std::vector<double> v63 = v109;
    v69[0] = v21;
    const double v122 = v109[1];
    v26 = v66;
    const std::vector<double> v215 = v278[1];
    const std::vector<double> v91 = v96[0];
    const std::vector<double> v100 = v108[1];
    v109 = v91;
    const double v228 = v100[5];
    const double v116 = v66[0];
    v63 = v215;
    v31[0] = v122;
    const double v176 = v63[3];
    v31[0] = v32;
    v66[0] = v116;
    double v173 = v228;
    v109[2] = v71;
    v69[0] = v176;
    return v173;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    const double v2 = f86(v1);
    const s0 v6 = v0.p0;
    const std::vector<std::vector<double>> v11 = v6.p0;
    const double v12 = v1 * v2;
    const double v4 = v1 / v12;
    double v15 = v4;
    v15 = v12;
    const std::vector<double> v23 = v11[0];
    std::vector<std::vector<double>> v44 = v11;
    const std::vector<double> v61 = v44[0];
    v44[1] = v61;
    const double v50 = v61[0];
    const std::vector<std::vector<double>> v31 = v6.p0;
    const std::vector<double> v30 = v31[1];
    v44[1] = v23;
    double v42 = v15;
    const double v89 = v1 / v42;
    v44[0] = v30;
    v42 = v50;
    return v89;
  }
  int main() {
    s8 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } } } });
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
