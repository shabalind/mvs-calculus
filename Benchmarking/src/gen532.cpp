  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s4(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s0 p0;
    s0 p1;
    s7(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s4 p0;
    std::vector<s7> p1;
    s8(s4 v0, std::vector<s7> v1): p0(v0), p1(v1) { }
  };
  double f2(const double &v0) {
    double v3 = v0;
    double v6 = v3;
    double v4 = v6;
    double v7 = v0;
    double v5 = v3;
    double v11 = v0;
    double v8 = v4;
    const std::vector<double> v2 { v5, v3, v4, v8, v3, v7 };
    const double v1 = v11 * v8;
    const double v10 = v2[0];
    const double v12 = v2[5];
    const double v9 = v2[2];
    double v17 = v9;
    const std::vector<std::vector<double>> v16 { v2, v2 };
    const std::vector<double> v19 { v12, v6, v17 };
    double v43 = v1;
    std::vector<double> v22 = v2;
    const std::vector<double> v35 = v16[1];
    const std::vector<double> v20 = v16[1];
    v22[4] = v12;
    std::vector<double> v25 = v19;
    const double v37 = v25[2];
    std::vector<double> v34 = v22;
    double v61 = v1;
    double v45 = v37;
    std::vector<double> v40 = v20;
    std::vector<double> v76 = v2;
    double v39 = v43;
    v34 = v22;
    v76 = v35;
    const double v63 = v17 / v39;
    const double v50 = v34[3];
    v40[2] = v12;
    v34[3] = v3;
    const double v67 = v76[2];
    const double v83 = v50 / v67;
    v22[4] = v63;
    v17 = v45;
    v34 = v40;
    const double v131 = v83 / v10;
    v5 = v0;
    v40[0] = v61;
    v34[1] = v3;
    return v131;
  }
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const double &v1) {
    double v3 = v1;
    const double v7 = f2(v1);
    const std::vector<double> v5 { v1, v7, v1, v1, v3 };
    const double v24 = v5[3];
    const double v57 = f2(v3);
    v3 = v57;
    return v24;
  }
  int main() {
    std::vector<s8> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } }, { { { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } } }, { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } } } });
    double v1(80.0);
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
