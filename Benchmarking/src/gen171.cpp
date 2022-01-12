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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f4(const std::vector<double> &v0) {
    const double v6 = v0[0];
    const double v5 = v0[0];
    const double v2 = v0[0];
    const double v1 = v0[0];
    std::vector<double> v9 = v0;
    v9 = v0;
    v9[0] = v5;
    v9[0] = v6;
    double v8 = v6;
    v9[0] = v6;
    double v14 = v2;
    v9 = v0;
    const double v16 = v0[0];
    const double v10 = v9[0];
    v8 = v14;
    std::vector<double> v19 = v0;
    v9[0] = v1;
    std::vector<double> v50 = v9;
    std::vector<double> v29 = v19;
    const double v15 = v29[0];
    std::vector<double> v20 = v0;
    v9[0] = v16;
    const std::vector<std::vector<double>> v26 { v0 };
    std::vector<double> v24 = v20;
    v9[0] = v15;
    const double v38 = v9[0];
    const std::vector<double> v17 = v26[0];
    std::vector<std::vector<double>> v33 = v26;
    std::vector<double> v39 = v17;
    std::vector<std::vector<double>> v58 = v26;
    v33 = v26;
    v39[0] = v15;
    const double v44 = v19[0];
    std::vector<double> v27 = v50;
    const std::vector<double> v23 = v58[0];
    std::vector<double> v47 = v50;
    const std::vector<double> v40 = v58[0];
    const std::vector<double> v22 = v33[0];
    const std::vector<double> v31 = v33[0];
    double v45 = v8;
    v27[0] = v45;
    const std::vector<double> v46 = v58[0];
    v50[0] = v38;
    const std::vector<std::vector<double>> v59 { v0, v24, v27, v29, v46 };
    const std::vector<std::vector<double>> v70 { v47, v22, v39, v24, v31, v23 };
    const std::vector<double> v62 = v70[1];
    const double v112 = v29[0];
    v39[0] = v14;
    v27[0] = v112;
    const std::vector<double> v91 = v59[3];
    v39[0] = v44;
    const std::vector<std::vector<double>> v28 { v62, v40, v24, v0, v91, v50, v31 };
    const double v109 = v46[0];
    std::vector<std::vector<double>> v88 = v28;
    const std::vector<double> v87 = v88[4];
    v19[0] = v10;
    v47[0] = v109;
    return v87;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s0 &v1, const std::vector<s1> &v2, const double &v3) {
    double v5 = v3;
    const std::vector<std::vector<double>> v6 = v1.p1;
    const std::vector<double> v13 = v6[0];
    const std::vector<double> v8 = f4(v13);
    const std::vector<double> v45 = f4(v8);
    double v31 = v5;
    const double v46 = v45[0];
    const double v47 = v31 - v46;
    return v47;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    s0 v1({ { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } });
    std::vector<s1> v2({ { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } } } });
    double v3(35.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
