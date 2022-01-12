  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const s0 &v2, const s0 &v3, const double &v4) {
    double v6 = v4;
    const s0 v7 = v0[0];
    const std::vector<std::vector<double>> v9 = v7.p1;
    std::vector<std::vector<double>> v10 = v9;
    const std::vector<std::vector<double>> v37 = v3.p0;
    const std::vector<double> v11 = v37[1];
    std::vector<double> v26 = v11;
    const std::vector<double> v16 = v37[0];
    v26[0] = v6;
    const std::vector<std::vector<double>> v20 = v3.p0;
    v10[0] = v16;
    std::vector<std::vector<double>> v19 = v20;
    const std::vector<double> v31 = v10[0];
    const std::vector<double> v63 = v19[1];
    const double v66 = v31[0];
    v26[0] = v66;
    v26[0] = v4;
    const std::vector<std::vector<double>> v61 { v26, v26, v63, v11, v63 };
    v26[0] = v66;
    const std::vector<double> v67 = v61[4];
    const double v153 = v67[0];
    return v153;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    s0 v1({ { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } });
    s0 v2({ { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } });
    s0 v3({ { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } });
    double v4(20.0);
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
