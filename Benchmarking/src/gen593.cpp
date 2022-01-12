  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    double p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, double v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s2 f49(const std::vector<s2> &v0, const s2 &v1) {
    std::vector<s2> v4 = v0;
    std::vector<s2> v2 = v0;
    const s2 v11 = v2[0];
    const std::vector<s0> v3 = v1.p1;
    s2 v5 = v1;
    const std::vector<s0> v7 = v1.p1;
    const s0 v6 = v7[0];
    const s0 v24 = v7[0];
    const std::vector<s0> v13 = v5.p1;
    v5.p1 = v13;
    const std::vector<s0> v10 = v1.p1;
    s0 v18 = v6;
    const s0 v12 = v7[0];
    const s0 v33 = v5.p0;
    const double v14 = v6.p3;
    v18.p3 = v14;
    double v29 = v14;
    v5.p1 = v10;
    std::vector<s0> v15 = v13;
    s2 v49 = v11;
    double v21 = v14;
    const std::vector<double> v30 { v21, v21, v14, v14, v29, v29, v14 };
    s0 v71 = v18;
    const std::vector<std::vector<double>> v39 = v12.p4;
    const s0 v35 = v49.p0;
    v4[1] = v5;
    std::vector<s0> v41 = v3;
    std::vector<s0> v52 = v41;
    const double v86 = v30[0];
    v49.p1 = v41;
    const s0 v19 = v52[1];
    const double v31 = v21 * v21;
    v2[0] = v1;
    v15[1] = v71;
    const s2 v28 = v4[0];
    v5.p0 = v6;
    std::vector<s0> v20 = v3;
    v21 = v31;
    v71.p0 = v39;
    v2[1] = v49;
    v15 = v20;
    double v40 = v86;
    std::vector<double> v53 = v30;
    v71.p3 = v86;
    s2 v102 = v5;
    const s0 v89 = v13[0];
    std::vector<double> v51 = v53;
    v102.p0 = v24;
    const double v109 = v40 / v31;
    v5.p0 = v6;
    const s0 v116 = v10[0];
    const std::vector<s2> v47 { v49, v5, v11, v49, v102, v28, v1 };
    v18.p4 = v39;
    v49.p0 = v89;
    std::vector<s2> v42 = v47;
    v102.p0 = v33;
    v53[1] = v40;
    v102.p1 = v41;
    v102.p0 = v19;
    v49.p1 = v15;
    const double v103 = v51[5];
    v71.p3 = v103;
    v5.p0 = v116;
    v102.p1 = v52;
    v5.p0 = v12;
    v52[0] = v89;
    const std::vector<std::vector<double>> v88 = v35.p0;
    v18.p0 = v88;
    v5.p0 = v89;
    const s2 v97 = v42[5];
    v4[1] = v49;
    v18.p3 = v109;
    v5.p1 = v10;
    v53[6] = v103;
    return v97;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v6 = v0[0];
    const s2 v3 = f49(v0, v6);
    const s0 v9 = v3.p0;
    const std::vector<std::vector<double>> v11 = v9.p2;
    const std::vector<double> v61 = v11[1];
    const double v66 = v61[0];
    return v66;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } }, 7.0, { { 8.0 } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } }, 16.0, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } }, 25.0, { { 26.0 } } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 }, { 32.0 }, { 33.0 } }, 34.0, { { 35.0 } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 }, { 42.0 } }, 43.0, { { 44.0 } } }, { { { 45.0 } }, { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } }, 52.0, { { 53.0 } } } } } });
    double v1(54.0);
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
