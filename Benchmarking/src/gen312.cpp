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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<std::vector<s1>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  double f35(const double &v0) {
    double v6 = v0;
    double v4 = v6;
    v6 = v4;
    double v2 = v6;
    double v5 = v2;
    double v7 = v5;
    double v1 = v2;
    v1 = v0;
    double v16 = v1;
    double v10 = v7;
    double v9 = v1;
    double v15 = v9;
    double v30 = v6;
    double v18 = v5;
    double v35 = v18;
    const std::vector<double> v14 { v10, v2, v30, v16, v35, v0, v5 };
    std::vector<double> v25 = v14;
    std::vector<double> v20 = v25;
    std::vector<double> v24 = v25;
    const double v39 = v14[6];
    v24[6] = v30;
    const double v27 = v24[0];
    v20[4] = v27;
    std::vector<double> v122 = v25;
    v122[2] = v27;
    double v52 = v7;
    const std::vector<std::vector<double>> v58 { v25, v14, v20, v122 };
    const std::vector<double> v118 = v58[3];
    v122[4] = v39;
    double v85 = v2;
    const std::vector<std::vector<double>> v67 { v118, v20 };
    v20[0] = v15;
    v122[6] = v1;
    v30 = v52;
    const std::vector<double> v172 = v67[1];
    v24[0] = v18;
    v1 = v85;
    const double v114 = v172[1];
    v122[2] = v1;
    v122[1] = v1;
    return v114;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<std::vector<s0>> &v1, const std::vector<s0> &v2, const s2 &v3, const double &v4) {
    const double v9 = f35(v4);
    double v28 = v4;
    const double v27 = v28 * v9;
    return v27;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } } }, { { { { { 12.0 } }, { { 13.0 } } } }, { { { { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 } } } } } }, { { { { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } }, { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } } } }, { { { { { 26.0 } }, { { 27.0 } } }, { { { 28.0 } }, { { 29.0 } } } } } }, { { { { { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 } } } }, { { { { 34.0 } }, { { 35.0 } } } } } }, { { { { { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } } } }, { { { { { 40.0 } }, { { 41.0 } } }, { { { 42.0 } }, { { 43.0 } } } } }, { { { { { 44.0 } }, { { 45.0 } } }, { { { 46.0 } }, { { 47.0 } } } } } }, { { { { { 48.0 } }, { { 49.0 } } } }, { { { { 50.0 } }, { { 51.0 } } } }, { { { { 52.0 } }, { { 53.0 } } } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 54.0 } }, { { 55.0 } } } } });
    std::vector<s0> v2({ { { { 56.0 } }, { { 57.0 } } }, { { { 58.0 } }, { { 59.0 } } } });
    s2 v3({ { { { { { { 60.0 } }, { { 61.0 } } }, { { { 62.0 } }, { { 63.0 } } } } }, { { { { { 64.0 } }, { { 65.0 } } }, { { { 66.0 } }, { { 67.0 } } } } }, { { { { { 68.0 } }, { { 69.0 } } }, { { { 70.0 } }, { { 71.0 } } } } } }, { { { { { 72.0 } }, { { 73.0 } } } }, { { { { 74.0 } }, { { 75.0 } } } }, { { { { 76.0 } }, { { 77.0 } } } } } });
    double v4(78.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
