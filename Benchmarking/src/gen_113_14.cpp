  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const s0 &v2, const double &v3) {
    const std::vector<std::vector<double>> v7 = v2.p0;
    const std::vector<std::vector<double>> v5 = v2.p1;
    double v4 = v3;
    std::vector<std::vector<double>> v11 = v7;
    const double v8 = v3 + v4;
    std::vector<std::vector<double>> v26 = v5;
    const std::vector<double> v51 = v26[0];
    const std::vector<double> v14 = v26[0];
    const double v17 = v51[0];
    const std::vector<std::vector<double>> v45 = v0.p1;
    const std::vector<double> v42 = v11[1];
    const double v49 = v51[0];
    v26[1] = v14;
    const std::vector<double> v93 { v8, v49, v17, v49 };
    v26[2] = v14;
    v26[1] = v42;
    v26 = v45;
    const double v128 = v93[1];
    return v128;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    s0 v1({ { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } });
    s0 v2({ { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } });
    double v3(15.0);
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
