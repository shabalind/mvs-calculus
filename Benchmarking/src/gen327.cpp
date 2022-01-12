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
    s0 p0;
    std::vector<std::vector<s1>> p1;
    std::vector<std::vector<s0>> p2;
    s2(s0 v0, std::vector<std::vector<s1>> v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s0> p1;
    s4(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s4 p0;
    s1 p1;
    s9(s4 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f28(const double &v0) {
    const double v1 = v0 * v0;
    double v2 = v1;
    double v4 = v2;
    double v19 = v4;
    double v16 = v19;
    return v16;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const s2 &v1, const std::vector<double> &v2, const double &v3) {
    std::vector<double> v6 = v2;
    const std::vector<std::vector<double>> v5 { v6 };
    std::vector<std::vector<double>> v4 = v5;
    const double v20 = v2[0];
    const std::vector<double> v15 = v4[0];
    v6[0] = v20;
    const double v14 = v6[0];
    std::vector<double> v18 = v15;
    double v48 = v3;
    v18[0] = v3;
    const double v36 = f28(v48);
    v6[0] = v36;
    const std::vector<double> v45 = v5[0];
    v4[0] = v45;
    const double v52 = v36 * v14;
    v6[0] = v36;
    const double v27 = v2[0];
    const double v164 = v3 / v20;
    const double v73 = f28(v20);
    v6 = v18;
    const double v99 = v27 + v36;
    const std::vector<double> v68 { v73, v52, v14, v164, v14 };
    v18[0] = v99;
    const double v65 = v68[3];
    return v65;
  }
  int main() {
    s9 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } });
    s2 v1({ { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } } }, { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } } } }, { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } } });
    std::vector<double> v2({ 84.0 });
    double v3(85.0);
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
