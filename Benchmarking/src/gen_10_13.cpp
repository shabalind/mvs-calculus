  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    s2 p1;
    s4(std::vector<std::vector<s0>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s4> p0;
    std::vector<std::vector<s2>> p1;
    s7(std::vector<s4> v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  double f98(const double &v0) {
    double v3 = v0;
    double v5 = v3;
    double v2 = v5;
    double v11 = v0;
    double v1 = v2;
    double v9 = v2;
    double v10 = v11;
    const std::vector<double> v14 { v9, v9, v10, v9, v3, v9 };
    const std::vector<std::vector<double>> v28 { v14 };
    const std::vector<double> v20 = v28[0];
    v10 = v1;
    v1 = v10;
    const double v21 = v14[1];
    const std::vector<double> v26 = v28[0];
    const std::vector<double> v22 = v28[0];
    double v34 = v9;
    const double v23 = v20[4];
    v10 = v23;
    std::vector<std::vector<double>> v16 = v28;
    v16[0] = v26;
    const std::vector<double> v36 { v21, v21, v0, v34, v3 };
    const std::vector<double> v58 { v5 };
    const std::vector<double> v50 = v28[0];
    const double v25 = v58[0];
    const std::vector<double> v35 = v28[0];
    v16[0] = v35;
    std::vector<double> v120 = v36;
    std::vector<double> v59 = v120;
    const std::vector<double> v117 = v16[0];
    v59[0] = v23;
    v16[0] = v22;
    v16[0] = v26;
    const double v68 = v120[0];
    std::vector<double> v83 = v117;
    v83[2] = v68;
    v120 = v59;
    v83[0] = v25;
    v83 = v50;
    const double v175 = v83[0];
    return v175;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    double v2 = v1;
    const double v6 = f98(v2);
    double v24 = v6;
    const double v15 = f98(v24);
    return v15;
  }
  int main() {
    std::vector<s7> v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } } }, { { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } } }, { { { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } } } }, { { { { { { { { 30.0 } }, { { 31.0 }, { 32.0 } } } } }, { { { { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 } } } } }, { { { { { { 39.0 } }, { { 40.0 }, { 41.0 } } } } }, { { { { { { 42.0 } }, { { 43.0 }, { 44.0 } } } } }, { { { 45.0 } }, { { 46.0 }, { 47.0 } } } } } }, { { { { { { { { 48.0 } }, { { 49.0 }, { 50.0 } } } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } } } }, { { { { { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } }, { { { 57.0 } }, { { 58.0 }, { 59.0 } } } } } } }, { { { { { { { { 60.0 } }, { { 61.0 }, { 62.0 } } } } }, { { { { { { 63.0 } }, { { 64.0 }, { 65.0 } } } } }, { { { 66.0 } }, { { 67.0 }, { 68.0 } } } } }, { { { { { { 69.0 } }, { { 70.0 }, { 71.0 } } } } }, { { { { { { 72.0 } }, { { 73.0 }, { 74.0 } } } } }, { { { 75.0 } }, { { 76.0 }, { 77.0 } } } } } }, { { { { { { { { 78.0 } }, { { 79.0 }, { 80.0 } } } } }, { { { 81.0 } }, { { 82.0 }, { 83.0 } } } } }, { { { { { { { 84.0 } }, { { 85.0 }, { 86.0 } } } } }, { { { 87.0 } }, { { 88.0 }, { 89.0 } } } } } } } });
    double v1(90.0);
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
