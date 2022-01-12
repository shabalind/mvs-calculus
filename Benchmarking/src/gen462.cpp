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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f80(const double &v0) {
    double v2 = v0;
    const std::vector<double> v7 { v0, v2 };
    std::vector<double> v6 = v7;
    const double v3 = v7[1];
    std::vector<double> v1 = v7;
    v1[0] = v3;
    double v15 = v0;
    const double v14 = v7[0];
    double v5 = v2;
    const double v9 = v1[0];
    double v10 = v2;
    std::vector<double> v8 = v7;
    const std::vector<std::vector<double>> v11 { v7, v8, v8, v8, v6, v6 };
    double v13 = v15;
    const std::vector<double> v16 = v11[2];
    double v31 = v15;
    std::vector<double> v25 = v8;
    const double v28 = v25[1];
    const double v32 = v14 - v10;
    double v21 = v32;
    std::vector<double> v18 = v1;
    double v23 = v28;
    const double v39 = v25[0];
    const double v35 = v16[1];
    v15 = v10;
    v5 = v13;
    v8[0] = v14;
    const double v27 = v18[1];
    std::vector<std::vector<double>> v76 = v11;
    const std::vector<double> v46 { v15, v9, v0, v27, v27, v32, v39 };
    std::vector<double> v59 = v46;
    const double v74 = v8[1];
    const double v83 = v31 - v2;
    double v71 = v14;
    double v54 = v35;
    v1[0] = v9;
    double v112 = v74;
    const double v82 = v59[4];
    v8[0] = v54;
    v8[0] = v83;
    const std::vector<double> v136 { v32, v21, v112, v5, v27, v23, v82 };
    const double v149 = v136[4];
    v25[1] = v71;
    const std::vector<double> v109 = v76[5];
    v18 = v109;
    return v149;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const double v5 = f80(v1);
    const double v18 = v1 * v5;
    double v22 = v18;
    const std::vector<double> v61 { v1, v5, v18, v22, v1, v18, v18 };
    std::vector<double> v233 = v61;
    std::vector<double> v154 = v233;
    const double v136 = v154[6];
    return v136;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } });
    double v1(60.0);
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
