  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<double> v7 { v1, v1, v1, v1, v1 };
    const double v10 = v7[2];
    const double v11 = v7[4];
    double v9 = v11;
    double v13 = v1;
    const std::vector<double> v29 { v13, v11, v10, v11, v11, v1 };
    std::vector<double> v18 = v29;
    const std::vector<std::vector<double>> v15 { v29, v29, v18, v18, v18, v18 };
    v18[4] = v9;
    v18[0] = v13;
    v18[4] = v13;
    const std::vector<double> v35 = v15[0];
    std::vector<double> v26 = v35;
    v26 = v35;
    const double v46 = v26[1];
    return v46;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    double v1(5.0);
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
