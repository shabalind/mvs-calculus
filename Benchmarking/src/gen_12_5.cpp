  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const s0 &v2, const s0 &v3, const std::vector<s0> &v4, const double &v5) {
    const s0 v28 = v4[2];
    const std::vector<std::vector<double>> v9 = v28.p1;
    std::vector<std::vector<double>> v13 = v9;
    const std::vector<double> v15 = v13[1];
    std::vector<double> v16 = v15;
    std::vector<double> v59 = v16;
    const double v36 = v59[0];
    const double v29 = v15[0];
    v16[0] = v36;
    v59[0] = v5;
    const std::vector<std::vector<double>> v94 = v1.p1;
    const std::vector<std::vector<double>> v37 = v3.p1;
    double v87 = v36;
    double v39 = v87;
    v59[0] = v29;
    v13[0] = v16;
    v13 = v94;
    v13 = v37;
    return v39;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    s0 v1({ { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } });
    s0 v2({ { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } });
    s0 v3({ { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } });
    std::vector<s0> v4({ { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } });
    double v5(42.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
