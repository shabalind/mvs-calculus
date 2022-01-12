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
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f12(const double &v0) {
    double v4 = v0;
    double v7 = v0;
    double v6 = v7;
    double v2 = v4;
    double v3 = v2;
    double v1 = v7;
    double v18 = v3;
    const std::vector<double> v9 { v18, v1, v18, v2, v0 };
    double v14 = v2;
    v2 = v1;
    const double v12 = v9[4];
    v3 = v6;
    std::vector<double> v5 = v9;
    double v16 = v14;
    const double v10 = v5[1];
    v5[3] = v7;
    v5[3] = v14;
    v5[4] = v14;
    v5[1] = v7;
    std::vector<double> v25 = v5;
    double v23 = v10;
    std::vector<double> v17 = v25;
    std::vector<double> v19 = v17;
    std::vector<double> v33 = v19;
    double v20 = v16;
    v33[4] = v12;
    double v27 = v20;
    std::vector<double> v35 = v19;
    std::vector<double> v45 = v17;
    const std::vector<std::vector<double>> v36 { v33, v33, v19, v45, v45, v17 };
    const std::vector<double> v108 = v36[4];
    std::vector<std::vector<double>> v75 = v36;
    const std::vector<double> v186 = v75[4];
    v25 = v33;
    const double v61 = v35[4];
    const std::vector<double> v34 = v75[1];
    const std::vector<double> v42 = v36[1];
    const std::vector<double> v145 = v36[0];
    const std::vector<std::vector<double>> v135 { v35, v35, v108, v34, v186, v42, v145 };
    const double v68 = v23 * v0;
    std::vector<double> v85 = v17;
    std::vector<std::vector<double>> v78 = v135;
    v17[1] = v61;
    v78[2] = v33;
    v75[5] = v5;
    std::vector<std::vector<double>> v121 = v78;
    v75[5] = v35;
    const std::vector<double> v100 = v121[1];
    v33[4] = v27;
    v35[3] = v4;
    const double v98 = v100[0];
    std::vector<std::vector<double>> v116 = v135;
    v116[4] = v85;
    v25[1] = v4;
    v45[4] = v2;
    v121 = v116;
    v33[4] = v68;
    return v98;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s1>> &v1, const std::vector<std::vector<s1>> &v2, const double &v3) {
    const double v8 = f12(v3);
    const double v11 = v3 * v8;
    const double v44 = v3 / v3;
    const double v61 = v11 - v3;
    const double v150 = v44 + v61;
    return v150;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } } });
    std::vector<std::vector<s1>> v1({ { { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } } }, { { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } } } });
    std::vector<std::vector<s1>> v2({ { { { { { { 32.0 } }, { { 33.0 } } }, { { { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } }, { { { 40.0 } }, { { 41.0 } } } } } } });
    double v3(42.0);
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
