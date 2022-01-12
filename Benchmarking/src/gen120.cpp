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
  struct s7 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s7(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  double f13(const double &v0) {
    double v1 = v0;
    double v6 = v1;
    double v7 = v6;
    double v4 = v7;
    const double v5 = v4 / v4;
    double v2 = v6;
    double v8 = v6;
    double v9 = v2;
    const double v13 = v4 + v2;
    double v11 = v13;
    const double v15 = v11 / v11;
    double v12 = v9;
    double v14 = v9;
    const std::vector<double> v28 { v14, v8, v13 };
    std::vector<double> v24 = v28;
    std::vector<double> v22 = v24;
    const double v26 = v9 * v15;
    double v45 = v6;
    v24[2] = v5;
    const double v35 = v24[2];
    const double v49 = v22[1];
    const std::vector<double> v53 { v26, v12, v5, v49, v45, v12 };
    std::vector<double> v36 = v53;
    const double v86 = v53[5];
    std::vector<double> v68 = v53;
    std::vector<double> v61 = v68;
    v68[2] = v86;
    const double v124 = v53[5];
    v68[0] = v9;
    const double v66 = v22[1];
    const double v59 = v61[0];
    const double v48 = v68[4];
    const double v37 = v66 * v59;
    const double v30 = v36[1];
    double v60 = v35;
    const std::vector<double> v64 { v60, v48 };
    v68 = v61;
    const double v73 = v64[0];
    const double v77 = v64[1];
    v22[1] = v77;
    v36[2] = v124;
    v61[1] = v49;
    v45 = v73;
    v24[1] = v30;
    double v293 = v37;
    return v293;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s7>> &v0, const double &v1) {
    double v5 = v1;
    const double v6 = f13(v1);
    const double v2 = f13(v1);
    double v7 = v5;
    v5 = v2;
    double v8 = v6;
    double v34 = v7;
    v34 = v8;
    const double v87 = v34 / v5;
    return v87;
  }
  int main() {
    std::vector<std::vector<s7>> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } } } }, { { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } } }, { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } }, { { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } }, { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } } } } });
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
