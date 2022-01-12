  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f2(const double &v0) {
    double v6 = v0;
    double v1 = v6;
    double v7 = v1;
    double v10 = v0;
    v7 = v10;
    double v21 = v10;
    double v8 = v7;
    double v15 = v7;
    double v35 = v21;
    double v26 = v8;
    double v34 = v35;
    double v16 = v34;
    double v29 = v26;
    const std::vector<double> v37 { v16, v15, v29, v26 };
    const double v47 = v37[1];
    return v47;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const double v3 = f2(v1);
    double v2 = v1;
    const std::vector<double> v8 { v1, v3, v2 };
    std::vector<double> v7 = v8;
    const double v10 = v7[2];
    const double v26 = f2(v1);
    const double v46 = v8[1];
    const double v104 = v3 * v26;
    const double v58 = v104 / v10;
    v7[1] = v46;
    v7[0] = v1;
    v7 = v8;
    return v58;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } });
    double v1(15.0);
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
